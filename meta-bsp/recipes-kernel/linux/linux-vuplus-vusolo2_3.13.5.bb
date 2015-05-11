require linux-vuplus-3.13.5.inc

COMPATIBLE_MACHINE = "^(vusolo2)$"

PR = "${INC_PR}.5"

SRC_URI += " \
        file://linux-bcm_ethernet.patch;patch=1;pnum=1 \
        "



