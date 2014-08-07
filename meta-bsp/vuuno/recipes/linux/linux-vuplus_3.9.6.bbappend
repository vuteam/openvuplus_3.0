FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp2"

SRC_URI += "\
	file://linux-sata_bcm.patch \
"
