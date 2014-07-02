HOMEPAGE = "http://www.alumnit.ca/wiki/?WvDial"
DESCRIPTION = "WvDial is a program that makes it easy to connect your Linux workstation to the Internet."

PR = "r4"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605"

SRC_URI = "\
	http://www.alumnit.ca/download/wvdial-1.60.tar.gz \
	file://wvdial-vuplus_001.patch;patch=1 \
	file://wvdial_fileselect.patch \
	"

DEPENDS = "wvstreams ppp"
RDEPENDS_${PN} = "ppp wvstreams"

inherit autotools-brokensep pkgconfig

CFLAGS += " -Wno-write-strings "
LDFLAGS = " -L ${CROSS_DIR}/${TARGET_SYS}/usr/lib -luniconf -lwvstreams -lwvbase -lwvutils "

EXTRA_OEMAKE = ""
export CC="${CXX}"

do_compile() {
        oe_runmake
}

do_install() {
    install -d ${D}/etc/ppp/peers
    oe_runmake prefix=${D}/usr PPPDIR=${D}/etc/ppp/peers install
}

SRC_URI[md5sum] = "27fbbde89f8fd9f6e735a8efa5217fc9"
SRC_URI[sha256sum] = "0c65ea807950fab32e659d1869a7167ff978502bd5d0159dbe9de90eb6c2e16b"

