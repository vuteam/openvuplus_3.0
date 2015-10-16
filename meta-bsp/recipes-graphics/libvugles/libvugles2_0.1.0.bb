DESCRIPTION = "shared library for E2 animation"
SECTION = "libs"
LICENSE = "CLOSED"
require conf/license/license-close.inc

RDEPENDS_${PN} = "libgles"

PR = "${SRCDATE}.${SRCDATE_PR}"

require libvugles2-${PACKAGE_ARCH}.inc

INHIBIT_PACKAGE_STRIP = "1"
S = "${WORKDIR}/${PN}-${PV}"

inherit pkgconfig

do_install() {
	install -d ${D}${includedir}
	cp -a ${S}/include/* ${D}${includedir}/
	install -d ${D}${libdir}
	cp -a ${S}/lib/*.so ${D}${libdir}/
	install -d ${D}${libdir}/pkgconfig
	cp -a ${S}/lib/pkgconfig/*.pc ${D}${libdir}/pkgconfig/
}

do_package_qa() {
}

PACKAGE_ARCH := "${MACHINE_ARCH}"

PACKAGES = "${PN}"
FILES_${PN} = "/usr/include /usr/lib"

