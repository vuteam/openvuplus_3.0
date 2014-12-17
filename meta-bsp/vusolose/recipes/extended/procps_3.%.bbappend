PR .= "-bsp0"

do_install_append() {
	echo "vm.min_free_kbytes=16384" >> ${D}/etc/sysctl.conf
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
