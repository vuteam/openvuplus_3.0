PR .= "-vuplus0"

SRC_URI += "file://usb-modeswitch-data.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
