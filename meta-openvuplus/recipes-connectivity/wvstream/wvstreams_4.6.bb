HOMEPAGE = "http://alumnit.ca/wiki/index.php?page=WvStreams"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55ca817ccb7d5b5b66355690e9abc605"

DESCRIPTION = "WvStreams is a network programming library in C++"
DEPENDS = "zlib openssl (>= 0.9.8)"

SRC_URI = "http://wvstreams.googlecode.com/files/${PN}-${PV}.tar.gz \
	file://vuplus-wvstreams-build-fix.patch \
	file://vuplus-wvstreams-build-fix_getuid.patch \
	"

inherit autotools pkgconfig

LDFLAGS_append = " -Wl,-rpath-link,${CROSS_DIR}/${TARGET_SYS}/lib"
EXTRA_OECONF = " --without-tcl --without-qt --without-pam "

PARALLEL_MAKE = ""

do_configure() {
        autoreconf
        oe_runconf
}

do_install() {
	oe_runmake DESTDIR=${D} install
}

#FILES_${PN} = "/"
FILES__${PN} = ""
FILES__${PN} += "${libdir}/libuniconf.so.*"
FILES__${PN} += "${sbindir}/uniconfd ${sysconfdir}/uniconf.conf ${localstatedir}/uniconf"
FILES__${PN} += "${libdir}/libwvutils.so.*"
FILES__${PN} += "${libdir}/libwvbase.so.* ${libdir}/libwvstreams.so.*"


SRC_URI[md5sum] = "4ee8ccfe6dfc29bf952d58fa23626c97"
SRC_URI[sha256sum] = "171df8e545b53edb3efbd65b9bc2b35549d05249bd0c92776701f9d8da77ed6f"

