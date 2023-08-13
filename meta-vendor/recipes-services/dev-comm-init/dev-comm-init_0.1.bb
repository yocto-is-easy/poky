DESCRIPTION = "Device communication initializer"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

SRC_URI = "git://github.com/yocto-is-easy/dev-comm-init.git;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "dev-comm-init.service"

BB_STRICT_CHECKSUM = "0"

DEPENDS = "supervisor"

inherit pkgconfig cmake

FILES_${PN}-dev += "${includedir}"

do_install() {
    install -d ${D}${includedir}
    install -d ${D}${includedir}/dev-comm-init
    install -m 0755 ${S}/include/dev-comm-init/* ${D}${includedir}/dev-comm-init

    install -d ${D}${bindir}
    install -m 0755 dev-comm-init-service ${D}${bindir}

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/impl/service/dev-comm-init.service ${D}${systemd_unitdir}/system
}
