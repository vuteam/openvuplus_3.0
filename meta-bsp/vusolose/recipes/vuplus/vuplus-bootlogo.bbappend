PR .= "-splash3"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCDATE = "20140728"
SRC_URI_append = " http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz file://splash_cfe_auto.bin"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7241b0 ${D}/boot/initrd_cfe_auto.bin
        install -m 0755 ${S}/splash_cfe_auto.bin ${D}/boot/splash_cfe_auto.bin
}

SRC_URI[md5sum] = "908f5bd70cb3d6be3b002393fc7e797a"
SRC_URI[sha256sum] = "cf0d93b11468636c3a1d3f6a3beea50f6027a59aabf0f73109367755bcd00add"

