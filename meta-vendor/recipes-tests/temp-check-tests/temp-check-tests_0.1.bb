DESCRIPTION = "Tests for temperature checker service"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/yocto-is-easy/temp-check-tests.git;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

BB_STRICT_CHECKSUM = "0"

DEPENDS = "temp-check gtest"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 temp-check-tests ${D}${bindir}
}
