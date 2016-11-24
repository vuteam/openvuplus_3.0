MODULE = "RemoteChannelStreamConverter"
DESCRIPTION = "Fetch channels from remote bouquets and make them available locally"

RDEPENDS_${PN} = "python-shell"

inherit gitpkgv
PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"
PR = "r2"

require openplugins-distutils.inc
require assume-gplv2.inc

SRCREV_pn-${PN}="baaad0038e26cde4d15e67205fdcb4217ea5a749"
SRC_URI += " file://check_has_isinvisible.patch"
