
PR .= "-vuplus0"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://default_sqlite_caches.diff"

do_install_append() {
        install -d ${D}/usr/bin
        mv ${D}/usr/sbin/minidlnad ${D}/usr/bin/minidlna
        rm -rf {D}/usr/sbin
}
