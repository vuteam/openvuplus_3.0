DESCRIPTION = "Vuplus: W-LAN Task for the Vuplus Distribution"
SECTION = "vuplus/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r8"

inherit task

DEPENDS_${PN} = "enigma2-plugins"
RDEPENDS_${PN} = "\
	${@base_contains("MACHINE_FEATURES", "vuwlan", "enigma2-plugin-systemplugins-wirelesslansetup", "enigma2-plugin-systemplugins-wirelesslan", d)} \
	wireless-tools \
	wpa-supplicant \
"

WIFI_FIRMWARES = "\
	rt73-firmware \
	zd1211-firmware \
	firmware-htc9271 \
	firmware-rt2561 \
	firmware-rtl8721u \
	firmware-rt3070 \
"

RALINK_MODULE = "${@base_version_less_or_equal('VUPLUS_KERNEL_VERSION', '3.1.1', 'rt3070', 'kernel-module-rt2800usb rt2870sta firmware-rt3070', d)}"

REALTEK_MODULE = "${@base_version_less_or_equal('VUPLUS_KERNEL_VERSION', '3.1.1', 'r8192cu', 'kernel-module-rtl8192cu', d)}"

KERNEL_WIFI_MODULES = " \
	kernel-module-ath9k-htc \
	kernel-module-carl9170 \
	kernel-module-prism2-usb \
	kernel-module-rt73usb \
	kernel-module-rt2500usb \
	kernel-module-r8192u-usb \
	kernel-module-rtl8192cu \
	kernel-module-rtl8187 \
	kernel-module-r8712u \
	kernel-module-w35und \
	kernel-module-zd1211rw \
	kernel-module-rt2800usb \
	kernel-module-llc \
	kernel-module-stp \
	kernel-module-bridge \
	kernel-module-hostap \
"

RDEPENDS_${PN}_append = "\
	${WIFI_FIRMWARES} \
	${KERNEL_WIFI_MODULES} \
	${RALINK_MODULE} \
	${REALTEK_MODULE} \
"
PACKAGE_ARCH = "${MACHINE_ARCH}"

