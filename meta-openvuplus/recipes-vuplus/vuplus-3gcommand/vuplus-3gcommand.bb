DESCIPTION = "3gcommand"
MAINTAINER = "vuplus team"
LICENSE = "CLOSED"
require conf/license/license-close.inc

PV = "1.1"
PR = "r1"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-3gcommand-${PV}.tar.gz"

do_install() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager
	install -m 0755 ${WORKDIR}/3gcommand ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager/3gcommand
}

do_install_arm() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager
	install -m 0755 ${WORKDIR}/3gcommand_arm ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager/3gcommand
}

PACKAGES = "${PN}"
FILES_${PN} = "/"

do_populate_sysroot[noexec] = "1"
INSANE_SKIP_${PN} = "already-stripped"

SRC_URI[md5sum] = "cc5bf83dcb28da14e84557ec7ce42809"
SRC_URI[sha256sum] = "1f6e98abe2a56a2091e576a0b57dcf27f06173aada60726640c97028a4a3871c"

