PR .= "-vuplus1"

SRC_URI += " \
            file://0011-mount-don-t-pass-option-auto-to-kernel.patch \
            file://mount_single_uuid.patch \
	    file://inetd \
	    file://inetd.conf \
"

DEPENDS += "mtd-utils"

PACKAGES =+ "${PN}-inetd"
INITSCRIPT_PACKAGES += "${PN}-inetd"
INITSCRIPT_NAME_${PN}-inetd = "inetd.${BPN}"
CONFFILES_${PN}-inetd = "${sysconfdir}/inetd.conf"
FILES_${PN}-inetd = "${sysconfdir}/init.d/inetd.${BPN} ${sysconfdir}/inetd.conf"
RDEPENDS_${PN}-inetd += "${PN}"

RRECOMMENDS_${PN} += "${PN}-inetd"

do_install_append() {
        if grep -q "CONFIG_CRONTAB=y" ${WORKDIR}/defconfig; then
                install -d ${D}${sysconfdir}/cron/crontabs
        fi
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

