require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

PR = "${INC_PR}.7"
SRCDATE = "20160226"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7366b0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "8ca9150fec96c9409b142ec9a4b7891e"
SRC_URI[sha256sum] = "9d8dfbb14e98f42c76f12e80814e06dec33f4a1f93f31b3f279f95f86aa9b8fc"
