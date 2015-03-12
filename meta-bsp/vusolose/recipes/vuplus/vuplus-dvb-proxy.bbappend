SRCDATE = "20150302"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "73e636c13d545a7421055adecdff0efa"
SRC_URI[sha256sum] = "0548027af76eeda4c2b8ae4e178115b89d3188a8d19362d3f132358aa01f8cc8"
