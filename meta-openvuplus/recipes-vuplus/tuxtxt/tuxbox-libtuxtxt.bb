SUMMARY = "tuxbox libtuxtxt"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://libtuxtxt/libtuxtxt.c;endline=19;md5=75fd12b0664044ec3b3182337e21e98f"
DEPENDS = "dreambox-dvbincludes libpng freetype"
PR = "r3"

SRCREV = "master"

SRC_URI = "git://code.vuplus.com/git/tuxbox-libs.git;protocol=git \
        file://acinclude.m4 \
        file://ignorelibs.patch \
        file://32bpp.diff \
        file://resize_framebuffer.diff \
        file://allow_different_demux.diff \
        file://videodev2.patch \
        file://libz.patch \
        file://libtuxtxt_buildfix.patch \
"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_configure_prepend() {
        install ${WORKDIR}/acinclude.m4 ${S}/acinclude.m4
        sed -i -e s:@LIBTUXBOX_LIBS@::g ${S}/libtuxtxt/tuxbox-tuxtxt.pc.in
}

CPPFLAGS += "-DHAVE_DREAMBOX_HARDWARE -DDREAMBOX"
