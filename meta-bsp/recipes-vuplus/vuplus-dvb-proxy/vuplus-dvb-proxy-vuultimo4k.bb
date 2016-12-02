require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

SRCDATE = "20161202"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "813606250d8c605ca94d2f0b030bb827"
SRC_URI[sha256sum] = "66f5c50cf49d3e4e2d8f795fd39fed782824629bed17a8b12b06be92659b5e43"
