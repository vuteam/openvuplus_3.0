FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= "-bsp0"

SRC_URI_append = " \
		file://enigma2_vuplus_remove_pvr_action.patch \
"

