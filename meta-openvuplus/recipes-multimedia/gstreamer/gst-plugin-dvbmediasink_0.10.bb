SUMMARY = "Plugin for gstreamer: dvbmediasink"
SECTION = "multimedia"
MAINTAINER = "Felix Domke <tmbinc@openembedded.org>"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = "file://src/gstdvbaudiosink.c;md5=ff43a6c1ca9ddb6ccf04c23191984c95 \
		    file://src/gstdvbvideosink.c;md5=47b480d423a11f2cef5ba7cf32ca5a91"

DEPENDS = "gstreamer gst-plugins-base"

#SRCREV="15a323fd769d4546bc454bfd81848aa43d655f3d"
#SRCREV="1bc9f47255396df4b3119a02790c4e864566560a"
SRCREV="c870a546eec7b84acb689775b23cf8f5b0489479"
SRCDATE="20110210"
BRANCH="master"
PV = "0.10+git${SRCDATE}"
PR = "r7"

inherit autotools pkgconfig
SRC_URI = "git://schwerkraft.elitedvb.net/dvbmediasink/dvbmediasink.git;protocol=git;branch=${BRANCH};tag=${SRCREV}"

SRC_URI_append_vuplus = " \
                file://fix_dvbaudiosink_async_opt.patch;patch=1;pnum=1 \
                file://fix_dvbvideosink_dm8000_padtemplate.patch;patch=1;pnum=1 \
                "

S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/gstreamer-0.10/*.so"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la"
FILES_${PN}-staticdev += "${libdir}/gstreamer-0.10/*.a"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
