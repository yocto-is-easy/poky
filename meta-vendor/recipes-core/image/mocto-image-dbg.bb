SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_LINGUAS = ""

LICENSE = "MIT"

inherit mocto-base

IMAGE_INSTALL += " temp-check temp-check-tests"
