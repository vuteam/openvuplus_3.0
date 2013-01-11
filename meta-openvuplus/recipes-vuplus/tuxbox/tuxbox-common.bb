DESCRIPTION = "Tuxbox common files"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
MAINTAINER = "Felix Domke <tmbinc@elitdvb.net>"

PN = "tuxbox-common"
PR = "r3"
SRCDATE = "20090305"
PV = "0.0+cvs${SRCDATE}"

SRC_URI = "cvs://anoncvs@cvs.tuxbox.org/cvs/tuxbox/;module=cdk/root/share/tuxbox;method=ext;tag=dreambox;date=${SRCDATE} \
	http://dreamboxupdate.com/download/opendreambox/tuxbox-common-r11.tar.gz \
	file://satellites_20120206.patch;patch=1;pnum=0"

FILES_${PN} = "/"

S = "${WORKDIR}/tuxbox-common-r11"

TRANSPONDER_LISTS = "satellites.xml terrestrial.xml"

do_install() {
	install -d ${D}/etc/tuxbox/
	install -d ${D}/usr/share/tuxbox
	install -m 0644 ${S}/scart.conf ${D}/etc/tuxbox/scart.conf
	install -m 0644 ${S}/timezone.xml ${D}/etc/tuxbox/timezone.xml
	ln -sf /etc/tuxbox/timezone.xml ${D}/etc/
	ln -sf /usr/share ${D}/share

	for i in ${TRANSPONDER_LISTS}; do
		install -m 0644 ${WORKDIR}/tuxbox/$i ${D}/etc/tuxbox/$i
		ln -sf /etc/tuxbox/$i ${D}/etc/;
		ln -sf /etc/tuxbox/$i ${D}/usr/share/;
		ln -sf /etc/tuxbox/$i ${D}/usr/share/tuxbox/;
	done;
}
