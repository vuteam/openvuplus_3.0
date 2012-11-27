DEPENDS += "cdparanoia orc orc-native"
PR .= "-vuplus0"

SRC_URI += "file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch"

EXTRA_OECONF += "--enable-orc"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
