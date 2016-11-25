require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

SRCDATE = "20161125"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c2d7e3f2bf16ef7322c48022e7ced3dc"
SRC_URI[sha256sum] = "bdfc49655b4e187e47fb76f430e9acbc7f3366bbcc12e778864dfa0e6b57432f"
