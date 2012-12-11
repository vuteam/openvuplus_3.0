DESCRIPTION = "librtmp Real-Time Messaging Protocol API"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=e344c8fa836c3a41c4cbd79d7bd3a379"

DEPENDS = "openssl"

inherit gitpkgv

PKGV = "2.4+git${GITPKGV}"
PV = "2.4+git${SRCPV}"
PR = "r2"

BRANCH=""
SRCREV="7340f6dbc6b3c8e552baab2e5a891c2de75cddcc"

SRC_URI = "git://git.ffmpeg.org/rtmpdump;protocol=git;branch=${BRANCH};tag=${SRCREV}"

S = "${WORKDIR}/git/librtmp"

do_compile() {
	oe_runmake CROSS_COMPILE=${TARGET_PREFIX} CFLAGS="${CFLAGS} -fPIC" LDFLAGS="${LDFLAGS}"
}

do_install() {
	install -d ${D}/usr/lib
	oe_runmake DESTDIR=${D} install
}
