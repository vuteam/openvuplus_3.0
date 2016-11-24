FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR .= "-bsp1"

SRC_URI_append_vuultimo4k = " \
	file://linux_dmx_source_dvr.patch \
"

