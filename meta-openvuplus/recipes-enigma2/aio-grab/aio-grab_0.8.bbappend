PR .= "-vuplus0"

SRC_URI += " \
        file://aio-grab_vuplus.patch;patch=1;pnum=1 \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

