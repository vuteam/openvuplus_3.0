DESCRIPTION = "Dreambox Keyboard Keymap files"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://${THISDIR}/${PN}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"
MAINTAINER = "Felix Domke <tmbinc@elitedvb.net>"

SRC_URI = "file://dream-de.info file://dream-de.kmap file://eng.info file://eng.kmap"

PR = "r1"

FILES_${PN} = "/"
PACKAGE_ARCH = "all"

do_install() {
	install -d ${D}/usr/share/keymaps
	for x in dream-de.info dream-de.kmap eng.info eng.kmap; do
		install -m 0644 ${WORKDIR}/$x ${D}/usr/share/keymaps/$x
	done
}
