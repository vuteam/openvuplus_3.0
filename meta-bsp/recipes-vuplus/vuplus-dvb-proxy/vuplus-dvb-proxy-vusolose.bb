require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolose)$"

SRCDATE = "20161130"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "a9c949fb84d771e13819b0886bd721e9"
SRC_URI[sha256sum] = "b20e4216120847dd4c0aeb161ce1e91bae940d05bc15f9a74bb6eb193085af96"
