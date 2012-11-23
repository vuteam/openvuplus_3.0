DESCRIPTION = "Hardware drivers for VuPlus"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

KV = "${@base_contains('PREFERRED_VERSION_linux-vuplus', '2.6.18', '2.6.18', '3.1.1', d)}"
PV = "${KV}"

RDEPENDS_2.6.18 = "kernel (${KV}) kernel-module-firmware-class kernel-module-input kernel-module-evdev kernel-module-i2c-core kernel-module-snd kernel-module-snd-pcm"
RDEPENDS_3.1 = "kernel (${KV})" 

RDEPENDS = "\
  ${@base_contains('PREFERRED_VERSION_linux-vuplus', '2.6.18', '${RDEPENDS_2.6.18}', '${RDEPENDS_3.1}', d)} \
"

PR = "r19-${SRCDATE}"

#hack
DEPENDS = " module-init-tools"
RDEPENDS_append_vuplus = " module-init-tools-depmod"

PREFERRED_GCC_VERSION = "4.4.3"

SRC_URI = "http://archive.vuplus.com/download/drivers/vuplus-dvb-modules-${MACHINE}-${PV}-${PREFERRED_GCC_VERSION}-${SRCDATE}.tar.gz "

S = "${WORKDIR}"

do_install() {
        install -d ${D}/lib/modules/${KV}/extra
        for f in *.ko; do
                install -m 0644 ${WORKDIR}/$f ${D}/lib/modules/${KV}/extra/$f;
        done
	if [ "${KV}" = "3.1.1" ]; then
		install -d ${D}/etc/modules-load.d
		echo -e "${MODULES_NAME}" > ${D}/etc/modules-load.d/${PN}.conf
		echo -e "${MODULES_NAME}" > ${D}/etc/modules
	fi
}

pkg_postinst_vuplus-dvb-modules () {
        if [ -d /proc/stb ]; then
                depmod -ae
        fi
        true
}

PACKAGE_ARCH := "${MACHINE_ARCH}"
FILES_${PN} = "/"
