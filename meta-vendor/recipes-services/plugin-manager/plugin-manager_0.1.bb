DESCRIPTION = "Plugin service"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

SRC_URI = "git://github.com/yocto-is-easy/plugin-manager.git;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "plugin-manager.service"

BB_STRICT_CHECKSUM = "0"

DEPENDS = "supervisor i-plugin-manager boost spdlog"

inherit pkgconfig cmake

FILES_${PN}-dev += "${includedir}"

do_install() {
    install -d ${D}${includedir}
    install -m 0755 ${S}/service/include/** ${D}${includedir}

    install -d ${D}${bindir}
    install -m 0755 plugin-manager-service ${D}${bindir}

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/service/systemd/plugin-manager.service ${D}${systemd_unitdir}/system

    install -d ${D}/etc/plugin-manager/
    install -m 0777 ${S}/service/default-config.json ${D}/etc/plugin-manager
}
