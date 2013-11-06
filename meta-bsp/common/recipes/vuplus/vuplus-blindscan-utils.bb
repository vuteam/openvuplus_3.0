DESCRIPTION = "Utilities for transponder & dvb-s blindscan"
SECTION = "base"
PRIORITY = "optional"
RDEPENDS_${PN} = "ncurses"

LICENSE = "CLOSED"

PV = "3.4"
PR = "r1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}.tar.bz2"

S = "${WORKDIR}/blindscan-utils"

do_install() {
	install -d ${D}/${bindir}/
	for i in `find ${S} -type f -maxdepth 1`; do
		install -m 0755 $i ${D}/${bindir}/;
	done;
}

SRC_URI[md5sum] = "1266ec1ad53955144a06bc84a2ce497e"
SRC_URI[sha256sum] = "6f961e3645fbdb64972bf188b84c94489d784394b02362022d0f1a9fe9752a70"
