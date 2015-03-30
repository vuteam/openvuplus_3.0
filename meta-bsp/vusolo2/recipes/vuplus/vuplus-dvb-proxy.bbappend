SRCDATE = "20150317"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "a91d808dfdc799011778cd997444938b"
SRC_URI[sha256sum] = "a588df43683f2a6bf7c1e02fc4d352734c19a6badfce3e8df61945c62e7eb8cd"
