DESCRIPTION = "lcd4linux plugin for duo2"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = " \
        file://LCD4linux.tar.gz \
        file://wetter.tar.gz \
	file://duo2lcd4linux.patch \
	file://duo2lcd4linux-fix-standby.patch \
"

RDEPENDS_${PN} = "enigma2 python-codecs python-datetime python-imaging python-textutils python-shell python-ctypes python-pyusb lcd4linux"

S = "${WORKDIR}/LCD4linux"

PR = "r6"

PLUGINPATH = "/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux"

do_install() {
        install -d  ${D}${PLUGINPATH}
        install -m 0600 ${S}/*.* ${D}${PLUGINPATH}
        install -m 0600 ${S}/refreshrate ${D}${PLUGINPATH}
        install -d  ${D}${PLUGINPATH}/locale/de/LC_MESSAGES
        install -m 0600 ${S}/locale/de/LC_MESSAGES/* ${D}${PLUGINPATH}/locale/de/LC_MESSAGES
        install -d  ${D}${PLUGINPATH}/wetter
        install -m 0600 ${S}/wetter/* ${D}${PLUGINPATH}/wetter
}

FILES_${PN} = "${PLUGINPATH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

