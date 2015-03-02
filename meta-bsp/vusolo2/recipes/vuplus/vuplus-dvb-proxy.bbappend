SRCDATE = "20150226"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "9af5eda260d4f8413fd63841cf3b70d3"
SRC_URI[sha256sum] = "3ce7522b358a1b439221e533ec2bb993991928127d855e2d180880e841854a2b"
