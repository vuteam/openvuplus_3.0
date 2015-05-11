require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vuultimo)$"

PR = "${INC_PR}.0"

SRC_URI += "\
        file://splash_cfe_auto.bin \
"

do_install_append() {
        install -m 0755 ${S}/splash_cfe_auto.bin ${D}/boot/splash_cfe_auto.bin
}
