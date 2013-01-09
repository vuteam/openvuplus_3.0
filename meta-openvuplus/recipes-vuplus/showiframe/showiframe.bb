DESCRIPTION = "Small utilities specific to the Vuplus dvb receiver (for DVB v3)"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://showiframe.c;md5=496e2fde81bc40a9879de703aa926fd6"

PV = "1.81"
PR = "r2"

SRC_URI = "file://showiframe.c"

S = "${WORKDIR}"

do_compile() {
        ${CC} -o showiframe showiframe.c
}

do_install() {
        install -d ${D}/${bindir}/
        install -m 0755 ${S}/showiframe ${D}/${bindir}/
}
