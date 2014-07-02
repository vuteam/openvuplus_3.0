DESCRIPTION = "create vuplus NAND images"
SECTION = "utils"
LICENSE = "CLOSED"
PV = "1.0"
PR = "r1"

SRC_URI = " \
	file://vfi2;name=vfi2 \
	file://vfi3;name=vfi3 \
"

do_populate_sysroot() {
        install -m 0755 ${WORKDIR}/vfi2 ${STAGING_BINDIR_NATIVE}/
        install -m 0755 ${WORKDIR}/vfi3 ${STAGING_BINDIR_NATIVE}/
}

SRC_URI[vfi2.md5sum] ="04d49c0a75e67afe83188887b1cdcc5c"
SRC_URI[vfi2.sha256sum] ="b854ef5eeb01b3c29b66706c7b87a32aeb2c3cadeee8b86736c26dd1964aaa09"
SRC_URI[vfi3.md5sum] ="d36c808021b9324b79f79bf1d70dfcbd"
SRC_URI[vfi3.sha256sum] ="4fc895852d80d6cbad00e9b7d00fe1b29fa927c4a02bb569dd2fb550fa1b8b1b"

