DESCRIPTION="A set of tools for CD recording"
HOMEPAGE="http://www.cdrkit.org"

LICENSE="GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b30d3b2750b668133fc17b401e1b98f8"

DEPENDS = "libcap2 bzip2"

PR = "r3"

SRC_URI="http://cdrkit.org/releases/cdrkit-${PV}.tar.gz \
	 file://xconfig.patch;patch=1 \
	 file://cdrkit-1.1.9-glibc-2.10-3.patch;patch=1 \
	"

S="${WORKDIR}/cdrkit-${PV}"

inherit cmake 

do_install() {
	oe_runmake install DESTDIR="${D}"
}

RC_URI[md5sum] = "cbc0647e5d85f0e8fb3a692ba1d42edd"
SRC_URI[sha256sum] = "d5d58ab4c7bef036a53ef9742b4e57621f61310cd0cd28f558ba0b88c354efa2"

