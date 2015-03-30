require linux-vuplus-3.9.6.inc

COMPATIBLE_MACHINE = "^(vuultimo)$"

PR = "${INC_PR}.4"

SRC_URI += "\
        file://vu_ultimo_fixed_mtd.patch \
        file://linux-sata_bcm.patch \
        "       


