DESCRIPTION = "Temperature checker service"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

SRC_URI = "git://github.com/yocto-is-easy/temp-check.git;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "temp-check.service"

BB_STRICT_CHECKSUM = "0"

DEPENDS = "midf"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 temp-check-service ${D}${bindir}

    install -m 0755 tcc ${D}${bindir}

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/src/temp-check-service/temp-check.service ${D}${systemd_unitdir}/system
}
