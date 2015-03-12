SRCDATE = "20150302"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "9d3c926e9452e0ed922b7cd4f3d8bdb9"
SRC_URI[sha256sum] = "ab684371e5fdf365d19ac602e903c5f355d09fcd595814b13cb54118a4bf129e"
