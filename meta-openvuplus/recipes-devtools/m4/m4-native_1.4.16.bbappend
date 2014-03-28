PR .= "-vuplus1"

SRC_URI += " \
            file://m4_remove_gets.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
