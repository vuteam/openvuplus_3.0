FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= "-vuplus2"

#do_install_append () {
#	touch ${D}${sysconfdir}/resolv.conf
#}
