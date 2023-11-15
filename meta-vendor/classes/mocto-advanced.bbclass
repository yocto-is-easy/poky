inherit mocto-network

IMAGE_FSTYPES = "rpi-sdimg"

IMAGE_INSTALL += " plugin-manager wifi-manager dev-comm-init mocto-cli"

EXTRA_IMAGE_FEATURES += " package-management"
