# vuplus.inc

GLIBC_EXTRA_OECONF = "--with-tls --with-__thread"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "kernel"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "vuplus-bootlogo"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "vuplus-dvb-modules"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "task-vuplus-essential"
MACHINE_FEATURES += "kernel26 alsa pci wifi vuwlan"

PREFERRED_PROVIDER_virtual/kernel = "linux-vuplus"

PREFERRED_VERSION_linux-vuplus = "${VUPLUS_KERNEL_VERSION}"

KERNEL_IMAGETYPE = "vmlinux"
KERNEL_OUTPUT = "${KERNEL_IMAGETYPE}"

EXTRA_IMAGEDEPENDS += "vuplus-makenfi-native"

