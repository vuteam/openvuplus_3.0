FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV = "1e99787f3387d3dd1e6167af73597674bf8fe37d"

SRC_URI += "\
	file://gstreamer10_dvbmediasink_vuplus.patch \
"

PR .= "-vuplus3"

DVBMEDIASINK_CONFIG = "--with-wmv --with-pcm --with-eac3"

