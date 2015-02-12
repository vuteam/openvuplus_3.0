PR .= "-vuplus2"

SRC_URI += "file://04-default-is-optimized.patch"

RPROVIDES_${PN} += "python-pickle-native python-pprint-native"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

