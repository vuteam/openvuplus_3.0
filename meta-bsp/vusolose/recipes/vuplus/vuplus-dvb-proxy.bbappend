SRCDATE = "20150226"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "e23b3984bb0ed902aab2f2ae766b6a58"
SRC_URI[sha256sum] = "b174c070e3bcf09cadf0f88d22b4cc7db8ebe4f811a8fe7617393953ad3e0f63"
