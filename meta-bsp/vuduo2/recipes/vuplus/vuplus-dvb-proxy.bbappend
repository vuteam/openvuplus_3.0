SRCDATE = "20150302"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "9633342a561268a08509e636e832fd9f"
SRC_URI[sha256sum] = "4ae626ecd7be77f913a246e550325868330725cfd5666af4755d9ea887cf9165"
