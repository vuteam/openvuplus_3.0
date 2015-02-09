PR .= "-vuplus1"

SRC_URI += " \
	file://99_vuplus.rules \
"

do_install_append () {
	rm ${D}${sysconfdir}/udev/rules.d/*.rules || /bin/true
	install -m 0755 ${WORKDIR}/99_vuplus.rules ${D}${sysconfdir}/udev/rules.d
	sed -i s@udev_run=\"\/var\/run\/udev\"@\#udev_run=\"\/var\/run\/udev\"@ -i ${D}${sysconfdir}/udev/udev.conf
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
