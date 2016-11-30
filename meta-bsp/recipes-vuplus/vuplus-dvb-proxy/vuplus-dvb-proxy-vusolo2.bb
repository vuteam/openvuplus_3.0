require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo2)$"

SRCDATE = "20161130"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f36c5f1705a7e7a2de0074d3f861265c"
SRC_URI[sha256sum] = "98404f399d03175a09af170057747fe6d1390696da046bdc06e0707938349d18"
