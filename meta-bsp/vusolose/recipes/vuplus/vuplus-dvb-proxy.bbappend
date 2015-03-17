SRCDATE = "20150317"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "bbd29f3c5a7915cae04ffeb6cf89a6cc"
SRC_URI[sha256sum] = "7231bf1fa368c684127f0a031bb11d5339dc366cd8563857a5fd029b85020018"
