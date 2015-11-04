require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

SRCDATE = "20151104"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "a8748a99cb5649a116a4a21a15df7f09"
SRC_URI[sha256sum] = "b173e2f47ad15bf705209c19291dd7ef0b992de6cb41a87b660679ca44848939"
