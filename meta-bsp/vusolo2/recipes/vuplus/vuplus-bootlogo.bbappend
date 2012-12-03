PR .= "-splash0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://initrd_cfe_auto.bin file://splash_cfe_auto.bin"

do_install_append() {
	install -m 0755 ${S}/initrd_cfe_auto.bin ${D}/boot/initrd_cfe_auto.bin
        install -m 0755 ${S}/splash_cfe_auto.bin ${D}/boot/splash_cfe_auto.bin
}
