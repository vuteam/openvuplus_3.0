SUMMARY = "tuxbox libtuxtxt"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://libtuxtxt/libtuxtxt.c;endline=19;md5=75fd12b0664044ec3b3182337e21e98f"
DEPENDS = "dreambox-dvbincludes libpng freetype"
PR = "r2"

SRC_URI = "http://code.vuplus.com/git/support/apps.tuxbox.libs_cvs.tuxbox.org__20090130.tar.gz \
        file://acinclude.m4 \
        file://ignorelibs.patch \
        file://32bpp.diff \
        file://resize_framebuffer.diff \
        file://allow_different_demux.diff \
        file://videodev2.patch \
        file://libz.patch \
"

S = "${WORKDIR}/libs"

inherit autotools pkgconfig

do_configure_prepend() {
        install ${WORKDIR}/acinclude.m4 ${S}/acinclude.m4
        sed -i -e s:@LIBTUXBOX_LIBS@::g ${S}/libtuxtxt/tuxbox-tuxtxt.pc.in
}

CPPFLAGS += "-DHAVE_DREAMBOX_HARDWARE -DDREAMBOX"

SRC_URI[md5sum] = "4b23e7319269ba583b77e894a9e784b6"
SRC_URI[sha256sum] = "3a4f59e7fc96ccc1c8b99d3976fc8e8af326e9c2af16ef94d1f500a47df43052"

