require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

PR = "${INC_PR}.2"
SRCDATE = "20161011"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7439b0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "4f25e392d807d95c8ddf65b55555a4ab"
SRC_URI[sha256sum] = "9286713a2d2b6cf65ee5926f2d26ff44089b344f208d801bf9687b38125fb71b"
