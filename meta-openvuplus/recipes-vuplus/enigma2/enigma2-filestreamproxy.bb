DESCRIPTION = "file transcoding util."
PRIORITY = "required"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit gitpkgv

PR = "r1"

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"
SRCREV_pn-${PN} ?= "${AUTOREV}"

SRC_URI = "git://code.vuplus.com/git/filestreamproxy.git;protocol=git;branch=master"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}/usr/bin
	install -m 0755 ${S}/src/filestreamproxy ${D}/usr/bin
}

FILES_${PN} = "${bindir}/filestreamproxy"

PACKAGE_ARCH := "${MACHINE_ARCH}"
PACKAGES = "${PN}"

