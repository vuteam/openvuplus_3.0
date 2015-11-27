require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

SRCDATE = "20151127"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "906b79fd2b67fd75a8671707ab4eed5a"
SRC_URI[sha256sum] = "b493069276098bc2aa8c0952456385a313f7667c283c57a7aff71a4dcad8fb4d"
