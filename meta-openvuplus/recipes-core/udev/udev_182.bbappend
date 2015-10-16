PR .= "-vuplus2"

SRC_URI += " \
	file://99_vuplus.rules \
	file://automount.sh \
	file://autoumount.sh \
"

do_install_append () {
	rm ${D}${sysconfdir}/udev/rules.d/*.rules || /bin/true
	install -m 0755 ${WORKDIR}/99_vuplus.rules ${D}${sysconfdir}/udev/rules.d
	install -m 0755 ${WORKDIR}/automount.sh ${D}${sysconfdir}/udev
	install -m 0755 ${WORKDIR}/autoumount.sh ${D}${sysconfdir}/udev
	sed -i s@udev_run=\"\/var\/run\/udev\"@\#udev_run=\"\/var\/run\/udev\"@ -i ${D}${sysconfdir}/udev/udev.conf
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
