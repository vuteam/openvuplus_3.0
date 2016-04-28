MODULE = "RemoteChannelStreamConverter"
DESCRIPTION = "Fetch channels from remote bouquets and make them available locally"

RDEPENDS_${PN} = "python-shell"

inherit gitpkgv
PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc
require assume-gplv2.inc

SRCREV_pn-${PN}="6f45040821703e0afc3c29451da53f0139cd1c33"
SRC_URI += " file://check_has_isinvisible.patch"
