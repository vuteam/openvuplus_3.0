require linux-vuplus-3.9.6.inc

COMPATIBLE_MACHINE = "^(vuuno)$"

PR = "${INC_PR}.4"

SRC_URI += "\
	file://linux-sata_bcm.patch \
"
