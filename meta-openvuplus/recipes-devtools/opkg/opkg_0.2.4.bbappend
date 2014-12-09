PR .= "-vuplus0"

SRC_URI += " \
	file://0001-pkg_hash_fetch_conflicts-move-iteration-over-conflic.patch \
	file://0002-pkg_hash_fetch_conflicts-take-into-account-conflicts.patch \
	file://0003-opkg_remove-auto-delete-.pyo-files.patch \
	file://0004-Makefile.am-remove-g-and-O-compiler-flags.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
