SRCDATE = "20150113"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "5ebb1c74553b836b22a41ef485b46e27"
SRC_URI[sha256sum] = "598747ddf461ef6cd43bffd246427251d2338da040240e15602b8e72c0735369"
