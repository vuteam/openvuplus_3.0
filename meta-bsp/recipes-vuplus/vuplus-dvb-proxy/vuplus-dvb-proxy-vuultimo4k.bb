require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

SRCDATE = "20161130"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "4dceb603e34a372b66d1f70be95b9a61"
SRC_URI[sha256sum] = "a65c2a59feed26337ddfe3b9c1b0744db3fbf4149a063578a9aed890c738ed93"
