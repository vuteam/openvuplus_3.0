PR .= "-vuplus0"

#BOOTUP = "${@base_contains('PREFERRED_VERSION_linux-vuplus', '3.1.1', 'bootup_3.1', ' ', d)}"
#BOOTUP_vusolo2 = "${@base_contains('PREFERRED_VERSION_linux-vuplus', '3.3.6', 'bootup_3.1', ' ', d)}"
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
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"
