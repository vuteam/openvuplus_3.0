DESCRIPTION = "szap, czap, tzap are command-line based tools to tune in a DVB service"
SECTION = "console/multimedia"
PRIORITY = "optional"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://szap.c;md5=7a5704804608206c59472a35cb35675f"
PV = "0.0+cvs${SRCDATE}"

SRC_URI = "cvs://anonymous@cvs.linuxtv.org/cvs/linuxtv;module=dvb-apps/util/szap \
           cvs://anonymous@cvs.linuxtv.org/cvs/linuxtv;module=dvb-apps/util/lib"

S = "${WORKDIR}/szap"

CFLAGS_append = " -I../lib "

do_compile() {
	oe_runmake szap czap tzap femon
}

do_install() {
	mkdir -p ${D}${bindir}
	install -m 0755 szap ${D}${bindir}/
	install -m 0755 czap ${D}${bindir}/
	install -m 0755 tzap ${D}${bindir}/
	install -m 0755 femon ${D}${bindir}/
}
