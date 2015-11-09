PR .= "-vuplus14"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI_append = " \
	file://turnoff_power \
	file://make_mac_sector \
"

SRC_URI_append_mipsel = " \
	file://hotplug_br \
"

do_configure_prepend() {
        sed -i 's/tty0/ttyS0/' ${WORKDIR}/banner.sh
}

do_install_append() {
	rm ${D}${sysconfdir}/*.d/*save-rtc.sh

	install -d ${D}/usr/bin	
	install -m 0755 ${WORKDIR}/turnoff_power     ${D}/usr/bin
	install -m 0755 ${WORKDIR}/make_mac_sector   ${D}/usr/bin

	# rename umountnfs script because it should run before network is disabled
        mv ${D}${sysconfdir}/rc0.d/S31umountnfs.sh ${D}${sysconfdir}/rc0.d/K31umountnfs.sh || /bin/true
        mv ${D}${sysconfdir}/rc6.d/S31umountnfs.sh ${D}${sysconfdir}/rc6.d/K31umountnfs.sh || /bin/true
}

do_install_append_mipsel() {
	install -m 0755 ${WORKDIR}/hotplug_br        ${D}/usr/bin
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"
