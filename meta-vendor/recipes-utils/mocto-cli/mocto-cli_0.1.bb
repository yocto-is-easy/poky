DESCRIPTION = "Test executor"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/yocto-is-easy/mocto-cli.git;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

BB_STRICT_CHECKSUM = "0"

DEPENDS = " i-plugin-manager wifi-manager boost"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 mocto-cli ${D}${bindir}
}
