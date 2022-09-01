DESCRIPTION = "Light weight request-response protocol"
SECTION = "examples"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/yocto-is-easy/lrrp.git;branch=mocto;name=lrrp \
           git://github.com/google/googletest.git;destsuffix=git/lib/googletest;branch=main;name=googletest \
           git://github.com/nlohmann/json.git;destsuffix=git/lib/json;branch=master;name=json \
"
SRCREV_googletest = "${AUTOREV}"
SRCREV_json = "${AUTOREV}"
SRCREV = "${AUTOREV}"

SRCREV_FORMAT = "lrrp_googletest_json"

DEPENDS = "asio"

S = "${WORKDIR}/git"

BB_STRICT_CHECKSUM = "0"

inherit pkgconfig cmake
