FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp12"

SRC_URI += "\
        file://linux_3.1.1_bm750.patch \
        file://linux-sata_brcm.patch \
"
