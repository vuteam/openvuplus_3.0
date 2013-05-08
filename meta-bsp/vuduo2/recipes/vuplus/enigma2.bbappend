FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR.= "-bsp2"

SRC_URI_append = " \
		file://skin_user_vuduo2.xml \
		file://vfd_icons_vuduo2 \
"

do_install_append_vuduo2() {
		install -m 0755 ${WORKDIR}/skin_user_vuduo2.xml ${D}/usr/share/enigma2/defaults/skin_user.xml
		install -d ${D}/usr/share/enigma2/vfd_icons/
		install -m 0755 ${WORKDIR}/vfd_icons_vuduo2/*.png ${D}/usr/share/enigma2/vfd_icons/
}

