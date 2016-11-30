require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

SRCDATE = "20161130"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "4e5600bfeb57d473e899a3c21701fdaa"
SRC_URI[sha256sum] = "d371ffc427affdad21780dd293e7b09836125be70ae036aa6331ac20bcee0929"
