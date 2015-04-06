SUMMARY = "This package provides dbox2/dreambox \
compatible header files for the API to the drivers."

MAINTAINER = "Felix Domke <tmbinc@elitedvb.net>"

PV="1"
PR="1.1.1"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://dbox/avs_core.h;beginline=1;endline=21;md5=b2ab401756a0768647ae13acb2e325ab"

SRC_URI = "http://sources.dreamboxupdate.com/snapshots/include2.tar.gz"
SRC_URI[md5sum] = "9d236095a88d7ce9f3bf0503ee5237d6"
SRC_URI[sha256sum] = "739bc35bccdb1e4c6e14b77ab86808354eb6fd75434d3bd6236f3b3346805e02"

S = "${WORKDIR}/include"

ALLOW_EMPTY_dreambox-dvbincludes = "1"

INPUT_FILES = "input_fake.h ci/ci.h  dbox/avia_gt_pig.h dbox/avs_core.h \
	dbox/event.h dbox/fp.h dbox/info.h dbox/lcd.h dbox/saa7126_core.h \
	dbox/lcd-ks0713.h dbox/fb.h \
	dreambox/dreaminfo.h \
	tuxbox/hardware_dbox2.h tuxbox/hardware_dreambox.h tuxbox/hardware_pci.h \
	tuxbox/info.h tuxbox/info_dbox2.h tuxbox/kernel.h"

do_install() {
	install -d ${STAGING_INCDIR}/ci
	install -d ${STAGING_INCDIR}/dbox
	install -d ${STAGING_INCDIR}/dreambox
	install -d ${STAGING_INCDIR}/tuxbox
	for f in ${INPUT_FILES}; do
		install -m 0644 ${S}/$f ${STAGING_INCDIR}/$f
	done;
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
