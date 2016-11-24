require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

SRCDATE = "20161123"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "319c8c33de8f70269b5d579a61de9191"
SRC_URI[sha256sum] = "86b41fb6e8ce63772feb9ffbe2c4c43745347c14735a813a7c0cffbd9742fd61"
