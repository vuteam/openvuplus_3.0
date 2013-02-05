PR .= "-vuplus6"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI_append = " \
	file://turnoff_power \
	file://hotplug_br \
	file://make_mac_sector \
	file://mountrun.sh \
"

do_install_append() {
	rm ${D}${sysconfdir}/*.d/*save-rtc.sh

	install -d ${D}/usr/bin	
	install -m 0755 ${WORKDIR}/turnoff_power     ${D}/usr/bin
	install -m 0755 ${WORKDIR}/hotplug_br        ${D}/usr/bin
	install -m 0755 ${WORKDIR}/make_mac_sector   ${D}/usr/bin

	install -m 0755 ${WORKDIR}/mountrun.sh ${D}${sysconfdir}/init.d
        ln -s ../init.d/mountrun.sh ${D}${sysconfdir}/rcS.d/S02mountrun.sh

	# rename umountnfs script because it should run before network is disabled
        mv ${D}${sysconfdir}/rc0.d/S31umountnfs.sh ${D}${sysconfdir}/rc0.d/K31umountnfs.sh || /bin/true
        mv ${D}${sysconfdir}/rc6.d/S31umountnfs.sh ${D}${sysconfdir}/rc6.d/K31umountnfs.sh || /bin/true
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"
