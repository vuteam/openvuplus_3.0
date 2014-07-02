FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp9"

SRC_URI += "\
        file://linux_3.1.1_vusolo.patch \
        file://fix_cpu_proc_solo.patch \
"
