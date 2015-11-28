require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

SRCDATE = "20151128"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9c745fe165417610a4e7f91c682d77f2"
SRC_URI[sha256sum] = "a2fe8b521189dea5378dfa4bdf8a6125f10ac06c19e781c71dbb3c7c86056e85"
