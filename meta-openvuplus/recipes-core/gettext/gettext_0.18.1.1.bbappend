PR .= "-vuplus1"

SRC_URI += " \
            file://gettext_remove_gets.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
