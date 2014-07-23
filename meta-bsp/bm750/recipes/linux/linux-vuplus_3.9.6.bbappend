FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp2"
SRC_URI += "\
        file://linux-sata_bcm7335.patch;patch=1;pnum=1 \
"
