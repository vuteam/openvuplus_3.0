FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
	file://gstreamer10_dvbmediasink_vuplus.patch \
"

PR .= "-vuplus1"

DVBMEDIASINK_CONFIG = "--with-wmv --with-pcm --with-eac3"

# Do not strip binary
#INHIBIT_PACKAGE_STRIP = "1"
#do_strip[noexec] = "1"
#do_strip="no"
#do_strip(){
#        pass
#}

