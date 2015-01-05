FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp4"

SRC_URI += " \
        file://linux-bcm_ethernet.patch;patch=1;pnum=1 \
        "



