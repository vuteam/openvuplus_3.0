require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

SRCDATE = "20151019"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "14eac182b7f1981d346a209287abc91f"
SRC_URI[sha256sum] = "316bce068ee4937d8e03f1ac10018f021983b02f2afbe489b7000e3ccfda30ae"
