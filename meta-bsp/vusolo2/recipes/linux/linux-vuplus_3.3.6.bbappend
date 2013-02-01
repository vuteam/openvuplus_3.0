FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp10"

SRC_URI += "file://bmips-no-array-bounds.patch;patch=1;pnum=1 "
SRC_URI += "file://dvb_backport.patch;patch=1;pnum=1 "
