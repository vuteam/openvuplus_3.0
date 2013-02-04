SUMMARY = "tuxbox tuxtxt for 32bit framebuffer"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://tuxtxt.c;endline=19;md5=4f3fd30feb71f556493f38c7a8b3ca4d"
DEPENDS = "freetype tuxbox-libtuxtxt"
RDEPENDS_${PN} = "enigma2"
PR = "r6"

SRC_URI = "http://code.vuplus.com/git/support/apps.tuxbox.plugins.tuxtxt_cvs.tuxbox.org__20090130.tar.gz \
        file://makefiles.diff \
        file://nonblocking.diff \
        file://32bpp.diff \
        file://add_new_default_conf.diff \
        file://add_advanced_rc.diff \
        file://allow_different_demux.diff \
        file://plugin.py \
	file://tuxtxt_vuplus.patch;patch=1;pnum=1 \
"

S = "${WORKDIR}/tuxtxt"

inherit autotools

do_configure_prepend() {
        touch ${S}/python/__init__.py
        install -m 0644 ${WORKDIR}/plugin.py ${S}/python
}

FILES_${PN} += "${datadir}/fonts/tuxtxt.otb ${libdir}/enigma2 /etc/tuxtxt"

CPPFLAGS += "-DHAVE_DREAMBOX_HARDWARE -DDREAMBOX -I${STAGING_INCDIR}/tuxbox/tuxtxt"

SRC_URI[md5sum] = "395116a358bac2b7f23923454997cab1"
SRC_URI[sha256sum] = "c26387820df3b49f4f40048f1adf4ed0a1fdbf74fc0950748e0785e60aba073f"

