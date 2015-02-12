SRCDATE = "20150113"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "af6a79ba8c1df1b6c502c5891ace8186"
SRC_URI[sha256sum] = "fb8e7ad8d2116f8f01b36e11c60d42fcd966d76211499b8810b1784caa8f901e"
