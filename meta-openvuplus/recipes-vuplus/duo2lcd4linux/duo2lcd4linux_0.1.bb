DESCRIPTION = "lcd4linux plugin for duo2"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = " \
        file://LCD4linux.tar.gz \
"

RDEPENDS = "python-codecs python-datetime python-textutils python-imaging python-pyusb"

S = "${WORKDIR}/LCD4linux"

PR = "r2"

do_install() {
        install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux
        install -m 0755 ${S}/*.py ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux/
        install -m 0755 ${S}/*.png ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux
        install -m 0755 ${S}/*.conf ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux
        install -m 0755 ${S}/*.so ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux
        install -m 0755 ${S}/*.pot ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux
        install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux/locale/de/LC_MESSAGES
        install -m 0644 ${S}/locale/de/LC_MESSAGES/LCD4linux.mo ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux/locale/de/LC_MESSAGES
        install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux/wetter
        install -m 0755 ${S}/wetter/*.gif ${D}/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux/wetter
}

do_package_qa() {
}

FILES_${PN} = "/usr/lib/enigma2/python/Plugins/Extensions/LCD4linux"

PACKAGE_ARCH = "${MACHINE_ARCH}"
