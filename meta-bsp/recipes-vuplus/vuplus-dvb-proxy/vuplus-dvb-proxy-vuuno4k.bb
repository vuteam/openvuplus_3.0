require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuuno4k)$"

SRCDATE = "20161215"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5d765892677d4cac08b24f8d68361c13"
SRC_URI[sha256sum] = "b16e3d1e392abcdbb2b8562beb072ca508e23919c9a3134c99671be7387754e2"
