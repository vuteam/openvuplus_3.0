FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp4"

SRC_URI += "file://remove_genet1.patch;patch=1;pnum=1 \
        file://nand_base.patch;patch=1;pnum=1 \
	file://brcm_s3_wol.patch;patch=1;pnum=1 \
	"
