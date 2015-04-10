FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
	file://gstreamer10_dvbmediasink_vuplus.patch \
"

PR .= "-vuplus2"

DVBMEDIASINK_CONFIG = "--with-wmv --with-pcm --with-eac3"

