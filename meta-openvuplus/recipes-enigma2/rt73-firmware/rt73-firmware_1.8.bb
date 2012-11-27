DESCRIPTION = "Firmware for rt73 based USB wifi adaptors"
LICENSE = "unknown"
LIC_FILES_CHKSUM = "file://LICENSE.ralink-firmware.txt;md5=682eac07428a4e8f138bc082f090ecac"

PR = "r1"

SRC_URI = "http://www.ralinktech.com.tw/data/RT71W_Firmware_V${PV}.zip"

S = "${WORKDIR}/RT71W_Firmware_V${PV}"

do_install() {
	install -d ${D}/${base_libdir}/firmware
	install -m 0644 rt73.bin ${D}/${base_libdir}/firmware/
}

FILES_${PN} = "${base_libdir}/firmware/"
PACKAGE_ARCH = "all"
