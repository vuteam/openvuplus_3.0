PR .= "-vuplus0"

do_install() {
    install -d ${D}${sbindir} ${D}${sysconfdir}/init.d
    install -m 0755 ${S}/hostapd ${D}${sbindir}
    install -m 0755 ${S}/hostapd_cli ${D}${sbindir}
    install -m 755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/hostapd
}

