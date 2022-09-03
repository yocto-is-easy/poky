DESCRIPTION = "Light weight request-response protocol"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/yocto-is-easy/lrrp.git;branch=mocto;name=lrrp \
           git://github.com/nlohmann/json.git;destsuffix=git/lib/json;branch=master;name=json \
"
SRCREV_json = "${AUTOREV}"
SRCREV = "${AUTOREV}"

SRCREV_FORMAT = "lrrp_json"

DEPENDS = "asio nlohmann-json"

S = "${WORKDIR}/git"

BB_STRICT_CHECKSUM = "0"

inherit pkgconfig cmake

FILES_${PN}-dev += "${includedir}"
