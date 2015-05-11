require linux-vuplus-3.13.5.inc

COMPATIBLE_MACHINE = "^(vuduo2)$"

PR = "${INC_PR}.4"

SRC_URI += " \
        file://brcm_s3_wol.patch;patch=1;pnum=1 \
        "


