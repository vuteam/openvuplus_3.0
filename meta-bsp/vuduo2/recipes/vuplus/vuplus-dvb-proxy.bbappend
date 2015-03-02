SRCDATE = "20150226"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "6e07a39bf39437da8fc09c985e8a5a67"
SRC_URI[sha256sum] = "7433ebd220625b03b992d75a02bff46f0dbb8481f098dc6b662d70a3e6f4dc0d"
