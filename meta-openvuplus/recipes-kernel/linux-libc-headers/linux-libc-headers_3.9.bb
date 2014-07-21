require linux-libc-headers.inc

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v3.0/linux-${PV}.tar.bz2"
SRC_URI += "file://scripts-Makefile.headersinst-install-headers-from-sc.patch"

SRC_URI[md5sum] = "2220321a0a14d86200322e51dd5033e2"
SRC_URI[sha256sum] = "97e48f31ed2197f4e7e4938d4fab8da522cf80e60c6ce69668b0805904499305"



