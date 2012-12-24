SUMMARY = "A Vuplus firmware image"

# packages to build for the feed
#DEPENDS = " \
#	gdb \
#	lsof \
#	ltrace \
#	strace \
#"

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

#BAD_RECOMMENDATIONS += "libnss-mdns wpa-supplicant-passphrase"
BAD_RECOMMENDATIONS += "libnss-mdns"

TASK_CORE_BOOT ?= "task-core-boot"
TASK_VUPLUS_BASE ?= "task-vuplus-base"
TASK_VUPLUS_ENIGMA ?= "task-vuplus-enigma2"
TASK_ESSENCIAL ?= "task-vuplus-essential"

# packages to drag into the image
#IMAGE_INSTALL = " \
#	${TASK_CORE_BOOT} ${ROOTFS_PKGMANAGE} \
#	${TASK_VUPLUS_BASE} \
#	${TASK_VUPLUS_DVBAPI} \
#	${TASK_VUPLUS_ENIGMA} \
#"

IMAGE_INSTALL = " \
	${ROOTFS_PKGMANAGE} \
	${TASK_CORE_BOOT} \
	${TASK_VUPLUS_BASE} \
	${TASK_VUPLUS_ENIGMA} \
	${TASK_ESSENCIAL} \
"

IMAGE_PKGTYPE = "ipk"

# enable online package management
IMAGE_FEATURES += "package-management"

# we don't want any locales, at least not in the common way.
IMAGE_LINGUAS = ""

inherit image

vuplus_rootfs_postprocess() {
    curdir=$PWD
    cd ${IMAGE_ROOTFS}

    # generate /etc/image-version
    IMAGE_VERSION="000"
    IMAGE_DATE=`date +%Y%m%d%H%M`
    IMAGE_TYPE="1"
    echo "version=${IMAGE_TYPE}${IMAGE_VERSION}${IMAGE_DATE}" > ${IMAGE_ROOTFS}/etc/image-version
    echo "comment=${DISTRO_NAME}" >> ${IMAGE_ROOTFS}/etc/image-version
    echo "target=9" >> ${IMAGE_ROOTFS}/etc/image-version
    echo "creator=OpenEmbedded <oe@vuplus.com>" >> ${IMAGE_ROOTFS}/etc/image-version
    echo "url=http://www.vuplus.com/" >> ${IMAGE_ROOTFS}/etc/image-version
    echo "catalog=http://www.vuplus.com/" >> ${IMAGE_ROOTFS}/etc/image-version

    # because we're so used to it
    ln -s opkg usr/bin/ipkg || true
    ln -s opkg-cl usr/bin/ipkg-cl || true

    cd $curdir
}

ROOTFS_POSTPROCESS_COMMAND += "vuplus_rootfs_postprocess; "

export NFO = '${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo'

generate_nfo() {
    VER=`grep Version: "${IMAGE_ROOTFS}/usr/lib/ipkg/info/enigma2.control" | cut -b 10-26`
    echo "DvbApp2: ${VER}" > ${NFO}
    echo "Machine: Vuplus ${MACHINE}" >> ${NFO}
    DATE=`date +%Y-%m-%d' '%H':'%M`
    echo "Date: ${DATE}" >> ${NFO}
    echo "Issuer: Vuplus" >> ${NFO}
    echo "Link: ${DISTRO_FEED_URI}" >> ${NFO}
    if [ "${DESC}" != "" ]; then
        echo "Description: ${DESC}" >> ${NFO}
        echo "${DESC}" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.desc
    fi
    MD5SUM=`md5sum ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi | cut -b 1-32`
    echo "MD5: ${MD5SUM}" >> ${NFO}
}

do_rootfs_append() {
    generate_nfo
}
