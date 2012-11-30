FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp9"

SRC_URI += "file://bmips-no-array-bounds.patch;patch=1;pnum=1 "
