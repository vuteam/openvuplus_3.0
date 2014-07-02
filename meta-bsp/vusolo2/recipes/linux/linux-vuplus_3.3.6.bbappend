FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp10"

SRC_URI += "file://bmips-no-array-bounds.patch "
SRC_URI += "file://dvb_backport.patch "
