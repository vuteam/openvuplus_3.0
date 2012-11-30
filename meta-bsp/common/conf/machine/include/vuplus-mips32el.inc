# vuplus-mips32el.inc

VUPLUS_KERNEL_VERSION ?= "3.1.1"
LINUXLIBCVERSION ?= "2.6.31"
#OLDEST_KERNEL = "2.6.31"

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el"

require conf/machine/include/vuplus.inc
require conf/machine/include/tune-mips32.inc
