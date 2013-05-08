PR .= "-splash1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_20130220.tar.gz file://splash_cfe_auto.bin"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7425b0 ${D}/boot/initrd_cfe_auto.bin
	install -m 0755 ${S}/splash_cfe_auto.bin ${D}/boot/splash_cfe_auto.bin
}

SRC_URI[md5sum] = "90f22e35a63dca8591d2e21fef417377"
SRC_URI[sha256sum] = "48d612d8383113008569dd422a7cafa8d0f6b5c6e77772dd73f77724ede205c6"
