FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= "-bsp4"

SRC_URI_append_vusolo = " \
	file://enigma2_vuplus_misc.patch \
"

SRC_URI_append_vuultimo = " \
	file://analog.ttf \
	file://skin_user.xml \
	file://vfd_icons \
"

SRC_URI_append_vuduo2 = " \
	file://skin_user_vuduo2.xml \
	file://vfd_icons_vuduo2 \
"

SRC_URI_append_vusolose = " \
	file://enigma2_vuplus_remove_pvr_action.patch \
"

SRC_URI_append_vuzero = " \
	file://enigma2_vuplus_remove_pvr_action.patch \
"

do_install_append_vuultimo() {
        install -m 0755 ${WORKDIR}/analog.ttf ${D}/usr/share/fonts/
        install -m 0755 ${WORKDIR}/skin_user.xml ${D}/usr/share/enigma2/defaults/
        install -d ${D}/usr/share/enigma2/vfd_icons/
        install -m 0755 ${WORKDIR}/vfd_icons/*.png ${D}/usr/share/enigma2/vfd_icons/
}

do_install_append_vuduo2() {
                install -m 0755 ${WORKDIR}/skin_user_vuduo2.xml ${D}/usr/share/enigma2/defaults/skin_user.xml
                install -d ${D}/usr/share/enigma2/vfd_icons/
                install -m 0755 ${WORKDIR}/vfd_icons_vuduo2/*.png ${D}/usr/share/enigma2/vfd_icons/
}

