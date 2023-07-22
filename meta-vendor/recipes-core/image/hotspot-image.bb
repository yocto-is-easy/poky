SUMMARY = "A small image for demonstrating wifi"

IMAGE_LINGUAS = ""

LICENSE = "MIT"

inherit mocto-base

IMAGE_INSTALL += " temp-check connman connman-client iptables"
