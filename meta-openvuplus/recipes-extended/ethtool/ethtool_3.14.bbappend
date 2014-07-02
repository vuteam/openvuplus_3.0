PR .= "-vuplus0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://vuplus.patch"

inherit autotools
