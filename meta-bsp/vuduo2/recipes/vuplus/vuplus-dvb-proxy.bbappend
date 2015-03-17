SRCDATE = "20150317"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "630c5b0a6737e650e6ec6e049081ece2"
SRC_URI[sha256sum] = "aa3ac0d8bb1b4c9cf94a2da5bc98fcc592af277c846a62493661d051166a2462"
