PR .= "-bsp1"

SRC_URI_append = " \
           file://analog.ttf \
           file://skin_user.xml \
           file://vfd_icons \
"

do_install_append() {
        install -m 0755 ${WORKDIR}/analog.ttf ${D}/usr/share/fonts/
        install -m 0755 ${WORKDIR}/skin_user.xml ${D}/usr/share/enigma2/defaults/
        install -d ${D}/usr/share/enigma2/vfd_icons/
        install -m 0755 ${WORKDIR}/vfd_icons/*.png ${D}/usr/share/enigma2/vfd_icons/
}
