DESCRIPTION = "Utilities for transponder & dvb-s blindscan"
SECTION = "base"
PRIORITY = "optional"
RDEPENDS_${PN} = "ncurses"

LICENSE = "CLOSED"

PV = "3.6"
PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}.tar.bz2"

S = "${WORKDIR}/blindscan-utils"

PLUGABLE_MODEL_BLINDSCAN = "tda1002x vuplus_blindscan vuplus_6211_blindscan vuplus_6222_blindscan ssh108 ssh108_t2_scan"
PLUGABLE_SOLOSE_BLINDSCAN = "tda1002x vuplus_blindscan vuplus_6211_blindscan ssh108 ssh108_t2_scan"

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

do_install_vuuno() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

do_install_vuultimo() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
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
	for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

do_install_vusolose() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_SOLOSE_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

SRC_URI[md5sum] = "b10ee7d7896611fa2c710ba002bcf678"
SRC_URI[sha256sum] = "7ee73c4ed84a8e11ae2e34d7e5ce8ef55f4a9f41f692e6b614317c27868d6991"

