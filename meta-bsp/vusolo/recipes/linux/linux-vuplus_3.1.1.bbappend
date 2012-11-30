FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp9"

SRC_URI += "\
        file://linux_3.1.1_vusolo.patch;patch=1;pnum=1 \
        file://fix_cpu_proc_solo.patch;patch=1;pnum=1 \
"
