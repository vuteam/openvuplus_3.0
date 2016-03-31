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
DEPENDS += " \
	${@base_contains("VUPLUS_FEATURES", "kodi", "enigma2-plugin-extensions-kodi", "", d)} \
"

#BAD_RECOMMENDATIONS += "libnss-mdns wpa-supplicant-passphrase"
BAD_RECOMMENDATIONS += "libnss-mdns"

PACKAGEGROUP_CORE_BOOT ?= "packagegroup-core-boot"
PACKAGEGROUP_VUPLUS_BASE ?= "packagegroup-vuplus-base"
PACKAGEGROUP_VUPLUS_ENIGMA ?= "packagegroup-vuplus-enigma2"
PACKAGEGROUP_ESSENCIAL ?= "packagegroup-vuplus-essential"

IMAGE_INSTALL = " \
	${PACKAGEGROUP_CORE_BOOT} ${ROOTFS_PKGMANAGE} \
	${PACKAGEGROUP_VUPLUS_BASE} \
	${PACKAGEGROUP_VUPLUS_ENIGMA} \
	${PACKAGEGROUP_ESSENCIAL} \
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
