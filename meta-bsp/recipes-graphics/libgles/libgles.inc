SECTION = "base"
LICENSE = "CLOSED"

PROVIDES += "libgles"
RPROVIDES_${PN} += "libgles"

PV="15.1"
PR="${SRCDATE}.${SRCDATE_PR}"

SRC_URI = "http://archive.vuplus.com/download/build_support/vuplus/libgles-${MACHINE}-${PV}-${PR}.tar.gz"

S = "${WORKDIR}/libgles-${MACHINE}"

do_install() {
	install -d ${D}${libdir}
	install -m 0755 ${S}/lib/*.so ${D}${libdir}
	ln -s libv3ddriver.so ${D}${libdir}/libEGL.so
	ln -s libv3ddriver.so ${D}${libdir}/libGLESv2.so

	install -d ${D}${includedir}
	cp -a ${S}/include/* ${D}${includedir}/
}

do_package_qa() {
}

PACKAGE_ARCH := "${MACHINE_ARCH}"
PACKAGES = "${PN}"
FILES_${PN}="/usr/lib /usr/include"

INSANE_SKIP_${PN} = "already-stripped"
