require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolose)$"

SRCDATE = "20151124"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "405ee2d88ae4285ca2e10dbccfd0e131"
SRC_URI[sha256sum] = "fc9e93f369d109f12cd71eb5a6e70c99f3bcaa0f110a8603e346ffcb7427c8fb"
