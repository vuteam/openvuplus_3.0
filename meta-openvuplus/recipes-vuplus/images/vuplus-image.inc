SUMMARY = "A Vuplus firmware image"

# packages to build for the feed
DEPENDS = " \
	gdb \
	lsof \
	ltrace \
	strace \
"

# build e2openplugins
DEPENDS += " \
        enigma2-plugin-extensions-openwebif \
        enigma2-plugin-extensions-remotestreamconvert \
        enigma2-plugin-extensions-addstreamurl \
        enigma2-plugin-systemplugins-autoshutdown \
"
DEPENDS += " \
	${@base_contains("VUPLUS_FEATURES", "webmanual", "vuplus-manual", "", d)} \
"
DEPENDS += " \
	${@base_contains("VUPLUS_FEATURES", "xbmc", "enigma2-plugin-extensions-xbmc", "", d)} \
"

#BAD_RECOMMENDATIONS += "libnss-mdns wpa-supplicant-passphrase"
BAD_RECOMMENDATIONS += "libnss-mdns"

TASK_CORE_BOOT ?= "task-core-boot"
TASK_VUPLUS_BASE ?= "task-vuplus-base"
TASK_VUPLUS_ENIGMA ?= "task-vuplus-enigma2"
TASK_ESSENCIAL ?= "task-vuplus-essential"
TASK_VUPLUS_DVBAPI ?= "task-vuplus-dvbapi"

IMAGE_INSTALL = " \
	${TASK_CORE_BOOT} ${ROOTFS_PKGMANAGE} \
	${TASK_VUPLUS_BASE} \
	${TASK_VUPLUS_DVBAPI} \
	${TASK_VUPLUS_ENIGMA} \
	${TASK_ESSENCIAL} \
"

# enable online package management
IMAGE_FEATURES += "package-management"

# we don't want any locales, at least not in the common way.
IMAGE_LINGUAS = ""

inherit image

vuplus_rootfs_postprocess() {
    # generate /etc/image-version
    IMAGE_DATE=`date +%Y%m%d%H%M`
    # 0: Release, 1: Experimental
    IMAGE_TYPE="1"
    # e.g. 400 for release 4.0.0, if IMAGE_TYPE=0
    IMAGE_VERSION="000"
    echo "version=${IMAGE_TYPE}${IMAGE_VERSION}${IMAGE_DATE}" > ${IMAGE_ROOTFS}/etc/image-version
}

ROOTFS_POSTPROCESS_COMMAND += "vuplus_rootfs_postprocess; "
