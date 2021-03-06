DESCRIPTION = "Vuplus: W-LAN package group for the Vuplus Distribution"
SECTION = "vuplus/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r20"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

DEPENDS_${PN} = "enigma2"
RDEPENDS_${PN} = "\
	enigma2-plugin-systemplugins-wirelesslansetup \
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

KERNEL_WIFI_MODULES = " \
	kernel-module-ath9k-htc \
	kernel-module-carl9170 \
	kernel-module-prism2-usb \
	kernel-module-rt73usb \
	kernel-module-rt2500usb \
	kernel-module-rtl8187 \
	kernel-module-r8712u \
	kernel-module-w35und \
	kernel-module-zd1211rw \
	kernel-module-llc \
	kernel-module-stp \
	kernel-module-bridge \
	kernel-module-hostap \
	kernel-module-rt2800usb \
"

KERNEL_WIFI_MODULES += "${@base_version_less_or_equal('VUPLUS_KERNEL_VERSION', '3.1.1', 'kernel-module-r8192u-usb', '', d)}"

LEGACY_MODULES = " \
	r8192cu \
	rt3070 \
"

RDEPENDS_${PN}_append = "\
	${WIFI_FIRMWARES} \
	${KERNEL_WIFI_MODULES} \
	${LEGACY_MODULES} \
	rt2870sta \
	${@base_conditional("MACHINE", "vuultimo4k", "vuplus-wifi-util-vuultimo4k", "", d)} \
"

