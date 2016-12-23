require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

SRCDATE = "20161223"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5d4812194c4b3f7c753632367e052756"
SRC_URI[sha256sum] = "d8cd01b0dfc71524bd2aa1e31e140fad7382841dc00a53b6c8d342948babda87"
