SUMMARY = "Vuplus: Essential packages"
SECTION = "vuplus/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "virtual/kernel"
RDEPENDS_${PN} = '${ESSENTIAL_RDEPENDS}'

RRECOMMENDS_${PN} = '${ESSENTIAL_RRECOMMENDS}'

RDEPENDS_${PN} += '${KERNEL_DVB_MODULES}'

PR = "r1"

inherit task

PACKAGE_ARCH = "${MACHINE_ARCH}"

ESSENTIAL_RDEPENDS = " \
        kernel-module-stv0299 \
"

ESSENTIAL_RRECOMMENDS = " \
        kernel-module-autofs4 \
        kernel-module-cdrom \
        kernel-module-cifs \
        kernel-module-nls-cp850 \
        kernel-module-nls-iso8859-1 \
        kernel-module-nls-iso8859-15 \
        kernel-module-ntfs \
        kernel-module-reiserfs \
        kernel-module-sr-mod \
        kernel-module-usbhid \
	kernel-module-ext2 \
"

KERNEL_DVB_MODULES = " \
        kernel-module-em28xx-dvb \
        kernel-module-dvb-usb-a800 \
        kernel-module-dvb-usb-af9005 \
        kernel-module-af9013 kernel-module-mt2060 kernel-module-qt1010 kernel-module-tda18271 kernel-module-mxl5005s kernel-module-mc44s803 kernel-module-tda18218 kernel-module-mxl5007t kernel-module-dvb-usb-af9015 \
        kernel-module-mxl5007t kernel-module-tda18218 \
        kernel-module-tda10021 kernel-module-tda10023 kernel-module-mt352 kernel-module-zl10353 kernel-module-tda18212 kernel-module-cx24116 kernel-module-stv0900 kernel-module-stv6110 kernel-module-stv6110x kernel-module-isl6423 kernel-module-dvb-usb-anysee \
        kernel-module-zl10353 kernel-module-qt1010 kernel-module-dvb-usb-au6610 \
        kernel-module-dvb-usb-az6027 \
        kernel-module-zl10353 kernel-module-mxl5005s  kernel-module-dvb-usb-ce6230 \
        kernel-module-lgdt330x kernel-module-mt352 kernel-module-zl10353 kernel-module-tuner-xc2028 kernel-module-tuner-simple kernel-module-mxl5005s kernel-module-max2165 kernel-module-lgs8gxx kernel-module-atbm8830 kernel-module-dvb-usb-cxusb kernel-module-drxd \
        kernel-module-dvb-usb-cinergyt2 \
        kernel-module-mt352 kernel-module-nxt6000 kernel-module-dvb-usb-digitv \
        kernel-module-mt2060 kernel-module-mt2266 kernel-module-tuner-xc2028 kernel-module-xc5000 kernel-module-xc4000 kernel-module-s5h1411 kernel-module-lgdt3305 kernel-module-mxl5007t kernel-module-dvb-usb-dib0700 \
        kernel-module-dvb-usb-dibusb-mb \
        kernel-module-dvb-usb-dibusb-mc \
        kernel-module-zl10353 kernel-module-qt1010 kernel-module-dvb-usb-dtv5100 \
        kernel-module-dvb-usb-dtt200u \
        kernel-module-si21xx kernel-module-stv0299 kernel-module-stv0288 kernel-module-stb6000 kernel-module-cx24116 \
        kernel-module-mt312 kernel-module-zl10039 kernel-module-ds3000 kernel-module-stv0900 kernel-module-stv6110 kernel-module-dvb-usb-dw2102 \
        kernel-module-ec100 kernel-module-mxl5005s kernel-module-dvb-usb-ec168 \
        kernel-module-zl10353 kernel-module-qt1010 kernel-module-dvb-usb-gl861 \
        kernel-module-dvb-usb-gp8psk \
        kernel-module-mt352 kernel-module-qt1010 kernel-module-tda1004x kernel-module-tda827x kernel-module-dvb-usb-m920x \
        kernel-module-stv0299 kernel-module-dvb-usb-opera \
        kernel-module-stv090x kernel-module-dvb-usb-technisat-usb2 \
        kernel-module-tda826x kernel-module-tda10086 kernel-module-tda827x kernel-module-lnbp21 kernel-module-dvb-usb-ttusb2 \
        kernel-module-dvb-ttusb-budget \
        kernel-module-dvb-usb-nova-t-usb2 \
        kernel-module-mt352 kernel-module-dvb-usb-umt-010 \
        kernel-module-dvb-usb-vp702x \
	kernel-module-dvb-usb-vp7045 \
	kernel-module-smsdvb kernel-module-smsusb \
"

