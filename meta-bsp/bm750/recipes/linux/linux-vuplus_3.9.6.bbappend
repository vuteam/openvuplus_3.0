FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp3"
SRC_URI += "\
        file://linux-sata_bcm.patch \
"
