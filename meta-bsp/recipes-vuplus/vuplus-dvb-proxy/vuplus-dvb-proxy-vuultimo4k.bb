require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuultimo4k)$"

SRCDATE = "20161206"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5afa4e09039b52d0f785a6771140baf1"
SRC_URI[sha256sum] = "0aff4df25f562fe9caf2024c86b10ff1f7d9e7e202792272e4b53c2a999045bd"
