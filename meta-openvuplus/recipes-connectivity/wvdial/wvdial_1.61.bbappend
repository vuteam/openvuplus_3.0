PR .= "-vuplus0"

SRC_URI += " \
           file://wvdial-vuplus_001.patch \
          "

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

