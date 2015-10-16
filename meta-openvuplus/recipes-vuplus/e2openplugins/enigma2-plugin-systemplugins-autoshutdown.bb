MODULE = "AutoShutDown"
DESCRIPTION = "automated power off for STB"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit gitpkgv
SRCREV = ""
PV = "0.3+git${SRCPV}"
PKGV = "0.3+git${GITPKGV}"
PR = "r1"


require openplugins.inc

SRCREV_pn-${PN} = "406e54cb250fecb5040dba844098140982186668"

SRC_URI += "\
        file://autoshutdown-default-time_20121207.patch \
        file://autoshutdown-fix-standby_20140407.patch \
        "

inherit autotools-brokensep pkgconfig

FILES_${PN} = "/"

require assume-gplv2.inc
