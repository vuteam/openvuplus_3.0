SUMMARY = "enigma2 default services/transponder"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PR = "r8"

SRC_URI = "file://*"

S = "${WORKDIR}"

INHIBIT_PACKAGE_STRIP = "1"

do_install() {
	install -d ${D}/usr/share/enigma2/dealer
	install ${WORKDIR}/*.info ${D}/usr/share/enigma2/dealer
	install ${WORKDIR}/lamedb.* ${D}/usr/share/enigma2/dealer
}

FILES_${PN} = "/"
PACKAGE_ARCH = "all"
