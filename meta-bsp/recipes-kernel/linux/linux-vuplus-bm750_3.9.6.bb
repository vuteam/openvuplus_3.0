require linux-vuplus-3.9.6.inc

COMPATIBLE_MACHINE = "^(bm750)$"

PR = "${INC_PR}.6"

SRC_URI += "\
        file://linux-sata_bcm.patch \
"
