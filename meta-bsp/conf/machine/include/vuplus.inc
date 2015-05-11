# vuplus.inc

GLIBC_EXTRA_OECONF = "--with-tls --with-__thread"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "kernel-image"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "vuplus-bootlogo"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "${@base_contains("VUPLUS_FEATURES", "dvbproxy", "vuplus-dvb-proxy", "vuplus-dvb-modules", d)}"
MACHINE_FEATURES += "kernel26 alsa pci wifi"

MACHINE_FEATURES_BACKFILL_CONSIDERED = "rtc"

PREFERRED_PROVIDER_virtual/kernel = "linux-vuplus-${MACHINE}"

PREFERRED_VERSION_linux-vuplus-${MACHINE} = "${VUPLUS_KERNEL_VERSION}"

KERNEL_IMAGETYPE = "vmlinux"
KERNEL_OUTPUT = "${KERNEL_IMAGETYPE}"

EXTRA_IMAGEDEPENDS += "vuplus-makenfi-native"

