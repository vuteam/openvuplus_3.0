FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp3"

SRC_URI += " \
        file://linux-bcm_ethernet.patch;patch=1;pnum=1 \
        "



