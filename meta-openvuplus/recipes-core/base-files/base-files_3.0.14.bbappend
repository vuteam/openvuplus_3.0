PR .= "-vuplus3"

do_install_append() {
        ln -s media/hdd ${D}/hdd

        rm -r ${D}/mnt
        ln -s media ${D}/mnt

        ln -s var/run ${D}/run
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


