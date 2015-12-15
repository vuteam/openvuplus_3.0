FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= "-vuplus1"

SRC_URI += " \
        file://no-ldconfig.patch \
        file://ctypes-error-handling-fix.patch \
        file://04-default-is-optimized.patch \
        file://99-ignore-optimization-flag.patch \
	file://pgettext.patch \
	file://urllib2_create_unverified_context.patch \
"

EXTRA_OECONF += " \
	ac_cv_file__dev_ptmx=yes \
	ac_cv_file__dev_ptc=no \
	ac_cv_no_strict_aliasing_ok=yes \
	ac_cv_pthread=yes \
	ac_cv_cxx_thread=yes \
	ac_cv_sizeof_off_t=8 \
"
