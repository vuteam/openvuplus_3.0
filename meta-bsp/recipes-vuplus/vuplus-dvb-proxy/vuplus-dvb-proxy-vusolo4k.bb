require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

SRCDATE = "20151201"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "208233efd91d4568febefe7cfa92327b"
SRC_URI[sha256sum] = "76e43753a2c4202254843676d4e3036211a19b54419e6e67e1821ef47cd9e316"
