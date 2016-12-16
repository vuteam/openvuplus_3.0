DESCRIPTION = "Utilities for transponder & dvb-s blindscan"
SECTION = "base"
PRIORITY = "optional"
RDEPENDS_${PN} = "ncurses"

LICENSE = "CLOSED"
require conf/license/license-close.inc

PV = "4.2"
PV_arm = "4.6"

PR = "r10"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}.tar.bz2"
SRC_URI_arm = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}_arm.tar.bz2;name=arm"

S = "${WORKDIR}/blindscan-utils"

PLUGABLE_MIPSEL_BLINDSCAN = " \
	tda1002x \
	vuplus_blindscan \
	vuplus_6211_blindscan \
	vuplus_6222_blindscan \
	ssh108 \
	ssh108_t2_scan \
	tt3l10 \
	tt3l10_t2_scan \
	tt2l08 \
	tt2l08_t2_scan \
"

PLUGABLE_ARM_BLINDSCAN = " \
	vuplus_blindscan \
	vuplus_6211_blindscan \
	vuplus_6222_blindscan \
	ssh108 \
	ssh108_t2_scan \
	tt3l10 \
	tt3l10_t2_scan \
	tt2l08 \
	tt2l08_t2_scan \
	bcm3148 \
"

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

do_install_vuuno() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MIPSEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

do_install_vuultimo() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MIPSEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

do_install_vusolo2() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_bcm7346_blindscan" "${D}/${bindir}"
}

do_install_vuduo2() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MIPSEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

do_install_vusolose() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MIPSEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

do_install_arm() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_ARM_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

SRC_URI[md5sum] = "8e5b2f437b8d3f2b112300ca2e1539d5"
SRC_URI[sha256sum] = "d9b9fcfcafb8f89ded56c2bdd4c7bc6639bfdd93b8c8b78a23a40f4fa6219c2b"

SRC_URI[arm.md5sum] = "f61f4096570ff8fe7ed4d46acc7ba6fb"
SRC_URI[arm.sha256sum] = "1a9e8fd98c8aace692a66e1150db55bad80a5274650d618d3ad91c38ec67dc55"

INSANE_SKIP_${PN} = "already-stripped"

