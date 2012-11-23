DESCRIPTION = "Bootlogo support"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28"

IMAGES_VERSION = "1"
BINARY_VERSION = "7"

PV = "${BINARY_VERSION}.${IMAGES_VERSION}"
PR = "r5"

SRC_URI = "file://bootlogo.mvi file://backdrop.mvi file://bootlogo_wait.mvi file://switchoff.mvi"

S = "${WORKDIR}/"

MVI = "bootlogo backdrop bootlogo_wait"

do_install() {
	install -d ${D}/boot
	install -d ${D}/usr/share
	for i in ${MVI}; do
		install -m 0755 ${S}/$i.mvi ${D}/usr/share/$i.mvi;
		ln -sf /usr/share/$i.mvi ${D}/boot/$i.mvi;
	done;
}

PACKAGE_ARCH := "${MACHINE_ARCH}"
FILES_${PN} = "/boot /usr/share"
