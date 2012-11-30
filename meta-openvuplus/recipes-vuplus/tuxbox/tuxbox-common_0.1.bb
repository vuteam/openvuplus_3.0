SUMMARY = "Tuxbox common files"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
SRCREV = "77ff3efbac5eb01c2fc914ba8fb99374d0970ff5"
PR = "r1"

inherit opendreambox-git

do_install() {
        install -d ${D}${sysconfdir}
        install -d ${D}${sysconfdir}/tuxbox
        install -m 0644 timezone.xml ${D}${sysconfdir}
        install -m 0644 satellites.xml ${D}${sysconfdir}/tuxbox
        install -m 0644 terrestrial.xml ${D}${sysconfdir}/tuxbox
}

FILES_${PN} = "${sysconfdir}"

OPENDREAMBOX_PROJECT = "obi/enigma2-xml-data"
