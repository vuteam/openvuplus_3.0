require vuplus-bootlogo.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

PR = "${INC_PR}.8"
SRCDATE = "20160229"

SRC_URI += "\
	http://archive.vuplus.com/download/kernel/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz \
	file://splash_auto.bin \
"

do_install_append() {
	install -m 0755 ${S}/vmlinuz-initrd-7366b0 ${D}/boot/initrd_auto.bin
	install -m 0755 ${S}/splash_auto.bin ${D}/boot/splash_auto.bin
}

SRC_URI[md5sum] = "061ee14a4c87f0fca5ca7eae578d2454"
SRC_URI[sha256sum] = "b2dd96a85454bff1272db6628659aebc18cb7ad5bb001ce130bc9724f4b5ef79"
