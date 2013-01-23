DESCRIPTION = "opera-hbbtv"
PRIORITY = "required"
LICENSE = "CLOSED"

DEPENDS = "tslib mpfr gmp"
RDEPENS = "tslib-conf libts-1.0-0 libsysfs2 libgmp3 libmpfr1"

SRC_DATE = "20130122_1"

PR = "r1_${SRC_DATE}"
SRC_URI = "http://code.vuplus.com/download/build.fc3abf29fb03f797e78f907928125638/embedded/opera-sdk-build-package/opera-hbbtv_${SRC_DATE}.tar.gz"

INHIBIT_PACKAGE_STRIP = "1"
S = "${WORKDIR}/opera-hbbtv"
do_compile() {
}
do_install() {
        install -d ${D}/usr/local/hbb-browser
	mv ${S}/opera/* ${D}/usr/local/hbb-browser/
        install -d ${D}/etc
	mv ${S}/dfb/etc/* ${D}/etc/
        install -d ${D}/usr/bin
	mv ${S}/dfb/usr/bin/* ${D}/usr/bin/
        install -d ${D}/usr/lib
	mv ${S}/dfb/usr/lib/* ${D}/usr/lib/
        install -d ${D}/usr/share
	mv ${S}/dfb/usr/share/* ${D}/usr/share/
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/HbbTV
	mv ${S}/plugin/* ${D}/usr/lib/enigma2/python/Plugins/Extensions/HbbTV
}

PACKAGES = "${PN}"

FILES_${PN} = "/"

SRC_URI[md5sum] = "ae2d63b91728367210547a2aa8612daf"
SRC_URI[sha256sum] = "39230e0f70337ed4c02077b0bb8f0c1c7adc9ed756e41141ca4a3971c9453d81"
