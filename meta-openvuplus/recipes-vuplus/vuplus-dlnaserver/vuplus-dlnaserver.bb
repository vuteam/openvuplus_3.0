DESCIPTION = "dinaserver"
MAINTAINER = "vuplus team"
LICENSE = "CLOSED"
require conf/license/license-close.inc

PV = "1.1"
PR = "r1"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-dlnaserver-${PV}.tar.gz"

do_install() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer
	install -m 0755 ${WORKDIR}/dlnaserver ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer/dlnaserver
}

do_install_arm() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer
	install -m 0755 ${WORKDIR}/dlnaserver_arm ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer/dlnaserver
}

PACKAGES = "${PN}"
FILES_${PN} = "/"

do_populate_sysroot[noexec] = "1"
INSANE_SKIP_${PN} = "already-stripped"

SRC_URI[md5sum] = "6b07e98fe748e85cd846e37449bf8d90"
SRC_URI[sha256sum] = "26576e1723187fd7c0fed134dae9b6f1a109c9651bc5a0ec974234a0189d5f32"

