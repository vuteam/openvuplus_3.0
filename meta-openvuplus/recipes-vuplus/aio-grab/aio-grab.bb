DESCRIPTION="AiO screen grabber"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"

PR = "r1"
PV = "0.8+cvs${SRCDATE}"
SRCDATE = "20101123"

SRC_URI="cvs://anonymous@cvs.schwerkraft.elitedvb.net/cvsroot/aio-grab;module=aio-grab;method=pserver"
SRC_URI_append_vuplus = "\
	file://aio-grab_vuplus.patch;patch=1"

S = "${WORKDIR}/aio-grab"

inherit autotools pkgconfig
