DESCRIPTION = "vuplus fpga updater"
SECTION = "base"
PRIORITY = "required"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28"

PV = "1.0"
PR = "r0"

SRC_URI = "file://dp_user_fpga"

S = "${WORKDIR}"

INHIBIT_PACKAGE_STRIP = "1"

do_install() {
	install -d ${D}/usr/bin
	install -m 0755 ${WORKDIR}/dp_user_fpga ${D}/usr/bin/dp_user_fpga
}

PACKAGE_ARCH := "${MACHINE_ARCH}"
FILES_${PN} = "/"
