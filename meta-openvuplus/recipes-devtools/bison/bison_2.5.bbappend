PR .= "-vuplus1"

SRC_URI_virtclass-native += " \
            file://bison_remove_gets.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
