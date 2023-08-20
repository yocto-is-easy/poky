DESCRIPTION = "Wifi manager"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

SRC_URI = "git://github.com/yocto-is-easy/wifi-manager.git;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "wifi-manager.service"

BB_STRICT_CHECKSUM = "0"

DEPENDS = "supervisor spdlog"

inherit pkgconfig cmake

FILES_${PN}-dev += "${includedir}"

do_install() {
    install -d ${D}${includedir}
    install -d ${D}${includedir}/wifi-manager
    install -m 0755 ${S}/include/wifi-manager/* ${D}${includedir}/wifi-manager

    install -d ${D}${bindir}
    install -m 0755 wifi-manager-service ${D}${bindir}

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/impl/service/wifi-manager.service ${D}${systemd_unitdir}/system
}
