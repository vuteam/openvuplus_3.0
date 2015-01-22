FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp5"
SRC_URI += "\
        file://linux-sata_bcm.patch \
"
