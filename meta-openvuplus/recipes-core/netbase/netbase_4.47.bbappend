FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= "-vuplus1"

do_install_append () {
	touch ${D}${sysconfdir}/resolv.conf
}
