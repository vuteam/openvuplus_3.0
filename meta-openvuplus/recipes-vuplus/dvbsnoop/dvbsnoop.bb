DEPENDS = "dreambox-dvbincludes"
DESCRIPTION = "DVBsnoop by rasc@users.sourceforge.net"
MAINTAINER = "Felix Domke <tmbinc@elitdvb.net>"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

PR = "r1"

SRC_REV = "master"

SRC_URI = "git://git.code.sf.net/p/tuxbox-cvs/apps;protocol=git;tag=${SRC_REV} \
           file://acinclude.m4"
	   
S = "${WORKDIR}/git/dvb/dvbsnoop"

inherit autotools pkgconfig

bindir = "/usr/bin"
sbindir = "/usr/sbin"

EXTRA_OECONF = "--with-target=cdk"
