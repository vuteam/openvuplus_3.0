require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

SRCDATE = "20161129"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c0f40f99c22ee1c9a38f53ed07a12dc0"
SRC_URI[sha256sum] = "2e6e9213fbe1690af302928a82e6178f947e514988e766a3903dd282f736a713"
