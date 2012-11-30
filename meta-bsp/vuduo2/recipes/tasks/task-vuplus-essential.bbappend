KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-dvb-ttusb-budget)$', '${KERNEL_DVB_MODULES}', d)} "
KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-tda18212)$', '${KERNEL_DVB_MODULES}', d)} "
KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-xc4000)$', '${KERNEL_DVB_MODULES}', d)} "
KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-drxd)$', '${KERNEL_DVB_MODULES}', d)} "
KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-dvb-usb-technisat-usb2)$', '${KERNEL_DVB_MODULES}', d)} "
KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-em28xx-dvb)$', '${KERNEL_DVB_MODULES}', d)} "

