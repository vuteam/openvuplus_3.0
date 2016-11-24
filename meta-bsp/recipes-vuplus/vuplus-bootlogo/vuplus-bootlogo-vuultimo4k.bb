require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

PR = "${INC_PR}.3"
SRCDATE = "20161011"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7445d0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "997063e4f91d4b301fe476e65aca56a6"
SRC_URI[sha256sum] = "ab6d4b4364333817f0a47d1e07d2214e732f96c7bafa94ce56619ac27c68f0ef"
