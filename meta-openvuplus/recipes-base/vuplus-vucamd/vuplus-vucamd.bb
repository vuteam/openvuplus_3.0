DESCRIPTION = "Xcrypt/Cnx daemon"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"
LIC_FILES_CHKSUM = "file://${THISDIR}/${PN}/Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28"

PV = "1.1"
PR = "r1"

SRC_URI = "file://vucamd \
	file://vucamd.sh \
"

S = "${WORKDIR}"

INHIBIT_PACKAGE_STRIP = "1"

do_install() {
	install -d ${D}/usr/bin
	install -d ${D}/etc/init.d
	install -m 0755 ${WORKDIR}/vucamd ${D}/usr/bin/vucamd
}

PACKAGE_ARCH := "${MACHINE_ARCH}"
FILES_${PN} = "/"
