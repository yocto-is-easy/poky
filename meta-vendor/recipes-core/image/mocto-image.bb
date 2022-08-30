SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_LINGUAS = ""

LICENSE = "MIT"

inherit core-image

IMAGE_FSTYPES = "rpi-sdimg"

IMAGE_INSTALL += " hello openssh"
