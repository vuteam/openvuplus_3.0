FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp4"
SRC_URI += "\
        file://linux-sata_bcm.patch \
"
