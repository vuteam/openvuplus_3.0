PR .= "-vuplus3"

SRC_URI += "file://busybox-telnetd.xinetd.in \
            file://busybox-telnetd@.service \
            file://busybox-telnetd.socket \
            file://0001-ifupdown-support-post-up-pre-down-hooks.patch \
            file://0002-ifupdown-code-shrink.patch \
            file://0003-ifupdown-remove-interface-from-state_list-if-iface_u.patch \
            file://0004-ifupdown-support-metric-for-static-default-gw.patch \
            file://0005-ifupdown-improve-compatibility-with-Debian.patch \
            file://0006-get_linux_version_code-don-t-fail-on-3.0-foo.patch \
            file://0001-work-around-linux-ext2_fs.h-breakage.patch \
            file://0002-Create-and-use-our-own-copy-of-linux-ext2_fs.h.patch \
            file://0003-Drop-include-bb_linux_ext2_fs.h-use-existing-e2fspro.patch \
            file://mount_single_uuid.patch \
"

inherit systemd xinetd

do_install_append() {
        if grep -q "CONFIG_CRONTAB=y" ${WORKDIR}/defconfig; then
                install -d ${D}${sysconfdir}/cron/crontabs
        fi
        install -d ${D}${systemd_unitdir}/system
        ln -sf /dev/null ${D}${systemd_unitdir}/system/busybox-telnetd.service
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SYSTEMD_PACKAGES += "${PN}-systemd"
SYSTEMD_SERVICE_${PN}-systemd = "busybox-telnetd.socket"

XINETD_PACKAGES = "${PN}-xinetd"
XINETD_SERVICE_${PN}-xinetd = "busybox-telnetd"
