require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

PR = "${INC_PR}.2"
SRCDATE = "20170112"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7439b0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "f54c8fec94279a4752b2104423e69c82"
SRC_URI[sha256sum] = "e231a804420d2cb8bf387f5044c9f450abfb2a6ffe6f561400732ddd761d219f"
