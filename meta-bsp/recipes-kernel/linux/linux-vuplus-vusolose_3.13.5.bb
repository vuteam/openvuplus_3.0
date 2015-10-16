require linux-vuplus-3.13.5.inc

COMPATIBLE_MACHINE = "^(vusolose)$"

PR = "${INC_PR}.5"

SRC_URI += " \
        file://brcm_s3_wol.patch \
        file://linux_mtd_bbt_maxblock.patch \
        "


