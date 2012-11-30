KERNEL_DVB_MODULES := "${@oe_filter_out('^(kernel-module-dvb-ttusb-budget)$', '${KERNEL_DVB_MODULES}', d)} "

