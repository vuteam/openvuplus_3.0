DESCRIPTION = "Linux kernel for vuplus"
SECTION = "kernel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

KV = "2.6.37"

PR = "r3"
SRCREV = ""

MODULE = "linux-2.6.37"

SRC_URI += " http://archive.vuplus.com/download/kernel/stblinux-2.6.37-3.1.tar.bz2 \
	file://dvb-core.patch;patch=1;pnum=1 \
	file://fix_cpu_proc.patch;patch=1;pnum=1 \
	file://brcm_disable_enet1.patch;patch=1;pnum=1 \
	file://bcmgenet_oobctrl.patch;patch=1;pnum=1 \
	file://brcm_mtd_mac.patch;patch=1;pnum=1 \
	file://${MACHINE}_defconfig \
        "

S = "${WORKDIR}/stblinux-2.6.37"

inherit kernel

FILES_kernel-vmlinux = "/boot/vmlinux-*"
FILES_kernel-image = "/boot/vmlinux.gz"

export OS = "Linux"
KERNEL_IMAGETYPE = "vmlinux"
KERNEL_OUTPUT = "vmlinux"
KERNEL_OBJECT_SUFFIX = "ko"


do_configure_prepend() {
        oe_machinstall -m 0644 ${WORKDIR}/${MACHINE}_defconfig ${S}/.config
        oe_runmake oldconfig
}

kernel_do_install_append() {
        install -d ${D}/${KERNEL_IMAGEDEST}
        install -m 0755 ${KERNEL_OUTPUT} ${D}/${KERNEL_IMAGEDEST}
        gzip ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}
}

pkg_postinst_kernel-image () {
        if [ -d /proc/stb ] ; then
                flash_erase /dev/mtd2 0 0
                nandwrite -p /dev/mtd2 /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
        fi
        rm -f /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
        true
}

SRC_URI[md5sum] = "dd7df66b5a28bd30c11fcd473a0169cf"
SRC_URI[sha256sum] = "bb1bc54ebafae37b384480f590ef201457b7ef24b064ee3477de80e257e05ff8"

