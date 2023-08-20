inherit mocto-base

IMAGE_FSTYPES = "rpi-sdimg"

IMAGE_INSTALL += " connman connman-client iptables dhcp-server wpa-supplicant"
