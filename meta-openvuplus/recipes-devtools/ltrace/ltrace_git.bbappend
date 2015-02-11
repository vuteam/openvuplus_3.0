PR .= "-vuplus0"

SRC_URI += "file://ltrace_fix_compile_error_initialize_linkmap.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

