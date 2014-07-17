FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp1"

SRC_URI += "\
	file://linux-sata_brcm.patch \
	"

