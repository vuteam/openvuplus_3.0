KERNEL_WIFI_MODULES := "${@oe_filter_out('^(kernel-module-r8192u-usb)$', '${KERNEL_WIFI_MODULES}', d)} "
KERNEL_WIFI_MODULES := "${@oe_filter_out('^(kernel-module-rtl8192cu)$', '${KERNEL_WIFI_MODULES}', d)} "
