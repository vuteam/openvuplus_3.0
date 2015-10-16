require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

PR = "${INC_PR}.6"
SRCDATE = "20150901"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7366b0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "825b9e90b49742358ec162db13e75d9d"
SRC_URI[sha256sum] = "d5fa2dd43cca9070e0be857ddbc57ed82b918a23c5daa9b4243aeee4c33e3911"
