require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

PR = "${INC_PR}.8"
SRCDATE = "20170112"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7366c0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "b3e6a9df20211076adbe2f33b8bbad87"
SRC_URI[sha256sum] = "c471b241f7d14ae401bfdd940307739d38b94213286a450078321def04f717a0"
