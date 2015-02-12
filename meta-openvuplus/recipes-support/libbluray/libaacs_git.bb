SUMMARY = "Open implementation of the AACS specification"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d"
DEPENDS = "libgcrypt"
SRCREV = "863e0a50ed9ee7b9bf4695a74bc4d607d12a67ff"
PV = "0.6.0"

SRC_URI = " \
	git://git.videolan.org/${PN}.git;protocol=git \
	file://libaacs_define_xopen_source_500.patch \
	"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig
