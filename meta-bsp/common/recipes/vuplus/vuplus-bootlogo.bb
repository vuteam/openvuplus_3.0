DESCRIPTION = "Bootlogo support"
SECTION = "base"
LICENSE = "CLOSED"
PRIORITY = "required"

IMAGES_VERSION = "1"
BINARY_VERSION = "7"

PV = "${BINARY_VERSION}.${IMAGES_VERSION}"
PR = "r6"

#SRC_URI = "file://bootlogo.mvi file://backdrop.mvi file://bootlogo_wait.mvi file://switchoff.mvi"
SRC_URI = "file://bootlogo.mvi file://backdrop.mvi file://bootlogo_wait.mvi"

S = "${WORKDIR}/"
PACKAGES = "${PN}"
INHIBIT_PACKAGE_STRIP = "1"

do_install() {
	install -d ${D}/boot ${D}${datadir}/${PN}
	install -d ${D}/usr/share
	for file in *.mvi; do
                install -m 0644 $file ${D}${datadir}/${PN}
                ln -s ${PN}/$file ${D}${datadir}
		ln -sf ${datadir}/${PN}/$file ${D}/boot/$file;
        done
}

PACKAGE_ARCH := "${MACHINE_ARCH}"
FILES_${PN} = "/boot ${datadir} ${sysconfdir}"

inherit update-rc.d

INITSCRIPT_PARAMS = "start 5 S . stop 89 0 ."
INITSCRIPT_NAME = "${PN}"

SRC_URI += "file://${INITSCRIPT_NAME}.sysvinit"

do_install_append() {
        if [ -f ${WORKDIR}/${INITSCRIPT_NAME}.sysvinit ]; then
                install -d ${D}${INIT_D_DIR}
                install -m 0755 ${WORKDIR}/${INITSCRIPT_NAME}.sysvinit ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
        fi
}

