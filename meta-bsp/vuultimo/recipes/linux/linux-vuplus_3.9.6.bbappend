FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp1"

SRC_URI += "\
        file://vu_ultimo_fixed_mtd.patch;patch=1;pnum=1 \
        "       


