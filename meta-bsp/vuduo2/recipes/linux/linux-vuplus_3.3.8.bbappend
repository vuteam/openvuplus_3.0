FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp4"

SRC_URI += "file://remove_genet1.patch \
        file://nand_base.patch \
	file://brcm_s3_wol.patch \
	"
