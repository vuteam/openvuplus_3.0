PR .= "-vuplus4"

BOOTUP = "bootup_3.1" 

SRC_URI_append = " \
	file://turnoff_power \
	file://hotplug_br \
	file://make_mac_sector \
	file://${BOOTUP} \
"

do_install_append() {
	rm ${D}${sysconfdir}/*.d/*save-rtc.sh

	install -d ${D}/usr/bin	
	install -m 0755 ${WORKDIR}/turnoff_power     ${D}/usr/bin
	install -m 0755 ${WORKDIR}/hotplug_br        ${D}/usr/bin
	install -m 0755 ${WORKDIR}/make_mac_sector   ${D}/usr/bin
	install -m 0755 ${WORKDIR}/${BOOTUP}         ${D}${sysconfdir}/init.d/bootup
	ln      -sf     ../init.d/bootup             ${D}${sysconfdir}/rcS.d/S05bootup

	# rename umountnfs script because it should run before network is disabled
        mv ${D}${sysconfdir}/rc0.d/S31umountnfs.sh ${D}${sysconfdir}/rc0.d/K31umountnfs.sh || /bin/true
        mv ${D}${sysconfdir}/rc6.d/S31umountnfs.sh ${D}${sysconfdir}/rc6.d/K31umountnfs.sh || /bin/true
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"
