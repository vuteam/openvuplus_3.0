SUMMARY = "DVB / MPEG stream analyzer"
AUTHOR = "Rainer Scherg <rasc@users.sourceforge.net>"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

PR = "r2"

#SRCREV = "5138f15c66dba10642376f01cbc799bdbaaebc4a"
SRC_URI = "git://git.code.sf.net/p/tuxbox-cvs/apps;protocol=git;tag=master"
 
S = "${WORKDIR}/git/dvb/dvbsnoop"

inherit autotools

