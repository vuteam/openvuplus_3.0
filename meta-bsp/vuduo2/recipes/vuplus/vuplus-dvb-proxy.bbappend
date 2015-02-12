SRCDATE = "20150113"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "53e47f210025250f95b314c8deb83302"
SRC_URI[sha256sum] = "9775def1dfb10ed5856ba53787c337878608e16180cf1470a2e1d897b59f5d53"
