SUMMARY = "streamproxy manages streaming data to a Mobile device using enigma2"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
SRCREV = "37a3f198a22d90cdfebf07cf56409cf93a4e74ba"
PR = "r5"

SRC_URI = " \
           file://transcoding.patch;patch=1;pnum=1 \
"

SCHWERKRAFT_PROJECT = "streamproxy"

inherit autotools schwerkraft-git

do_install() {
        install -d ${D}/usr/bin
        install -m 0755 ${S}/src/streamproxy      ${D}/usr/bin/transtreamproxy
}

