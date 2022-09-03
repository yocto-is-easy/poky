DESCRIPTION = "Json library"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/nlohmann/json.git;branch=master;protocol=https"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

BB_STRICT_CHECKSUM = "0"

inherit pkgconfig cmake

do_install() {
    install -m 755 include/* ${includedir}
}

FILES_${PN} += "${includedir}"
