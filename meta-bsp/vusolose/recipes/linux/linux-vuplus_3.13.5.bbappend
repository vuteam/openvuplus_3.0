FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp3"

SRC_URI += " \
        file://brcm_s3_wol.patch;patch=1;pnum=1 \
        "


