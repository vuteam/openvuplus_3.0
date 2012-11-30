FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp0"

SRC_URI += "\
	file://linux-sata_brcm.patch;patch=1;pnum=1 \
	"

