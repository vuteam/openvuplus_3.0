# vuplus-mips32el.inc

VUPLUS_KERNEL_VERSION ?= "3.13.5"

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el"

require conf/machine/include/vuplus.inc
require conf/machine/include/tune-mips32.inc
