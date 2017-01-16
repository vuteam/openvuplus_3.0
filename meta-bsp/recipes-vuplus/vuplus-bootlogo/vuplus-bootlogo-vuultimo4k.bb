require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

PR = "${INC_PR}.3"
SRCDATE = "20170112"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7445d0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "e9b7f1f9350d92ed06c45bc9933b1ec6"
SRC_URI[sha256sum] = "8d844e0c44d458ede6837d499504fff328e9d869af88515c684036cf6d52f176"
