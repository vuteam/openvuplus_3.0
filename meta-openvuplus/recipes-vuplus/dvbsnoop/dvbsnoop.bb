DEPENDS = "dreambox-dvbincludes"
DESCRIPTION = "DVBsnoop by rasc@users.sourceforge.net"
MAINTAINER = "Felix Domke <tmbinc@elitdvb.net>"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
SRCDATE = "20081001"
PV = "0.0+cvs${SRCDATE}"
PR = "r0"

SRC_URI = "cvs://anoncvs@cvs.tuxbox.org/cvs/tuxbox;module=apps/dvb/dvbsnoop;method=ext \
           file://acinclude.m4"
	   
S = "${WORKDIR}/dvbsnoop"

inherit autotools pkgconfig

bindir = "/usr/bin"
sbindir = "/usr/sbin"

EXTRA_OECONF = "--with-target=cdk"
