LICENSE = "LGPLv2.1+"
PR .= "-vuplus0"



EXTRA_OECONF += "--disable-gpl --disable-nonfree --disable-version3"

PACKAGECONFIG = "bzip2"

RSUGGESTS_${PN} = ""
