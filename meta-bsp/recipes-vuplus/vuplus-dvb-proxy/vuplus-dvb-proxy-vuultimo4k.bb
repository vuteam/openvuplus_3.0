require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

SRCDATE = "20161129"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b82e9ca63d54c0e53680d3e18d1860da"
SRC_URI[sha256sum] = "7ef6488bc4b9a0aff220880796d735e1661a567d3be2cd341823023d0a7e3704"
