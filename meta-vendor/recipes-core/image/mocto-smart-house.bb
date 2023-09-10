SUMMARY = "An image for smart house example"

IMAGE_LINGUAS = ""

LICENSE = "MIT"

inherit mocto-advanced

DISTRO_FEATURES += " wifi"

IMAGE_INSTALL += " "

IMAGE_ROOTFS_EXTRA_SPACE = "100000"
