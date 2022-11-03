DESCRIPTION = "Mocto interface definition framework"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/yocto-is-easy/mocto-idf.git;branch=master"
SRCREV = "${AUTOREV}"

DEPENDS = "lrrp"

S = "${WORKDIR}/git"

BB_STRICT_CHECKSUM = "0"

inherit pkgconfig cmake

FILES_${PN}-dev += "${includedir}"
