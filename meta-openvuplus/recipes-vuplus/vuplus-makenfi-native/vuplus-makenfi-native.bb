DESCRIPTION = "create vuplus NAND images"
SECTION = "utils"
LICENSE = "CLOSED"
PV = "1.0"
PR = "r1"

SRC_URI = "file://vfi2 \
	   file://vfi3"

do_compile() {
	cp ${WORKDIR}/vfi2 .
	cp ${WORKDIR}/vfi3 .
}

do_populate_sysroot() {
	install -m 0755 ${S}/vfi2 ${STAGING_BINDIR_NATIVE}/
        install -m 0755 ${S}/vfi3 ${STAGING_BINDIR_NATIVE}/
}
