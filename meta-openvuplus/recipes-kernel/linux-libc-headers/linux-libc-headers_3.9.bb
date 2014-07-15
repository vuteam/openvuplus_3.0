require linux-libc-headers.inc

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v3.0/linux-${PV}.tar.bz2"
SRC_URI += "file://scripts-Makefile.headersinst-install-headers-from-sc.patch"



