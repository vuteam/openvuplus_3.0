inherit image_types

IMAGEDIR ?= "${MACHINE}"

IMAGE_CMD_tar_prepend = " \
        mkdir -p ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}; \
        cp ${IMAGE_ROOTFS}/tmp/zImage ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/kernel_auto.bin; \
        cp ${IMAGE_ROOTFS}/boot/initrd_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/initrd_auto.bin; \
        cp ${IMAGE_ROOTFS}/boot/splash_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/splash_auto.bin; \
        touch ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/force.update; \
        rm -f ${IMAGE_ROOTFS}/tmp/zImage; \
        rm -f ${IMAGE_ROOTFS}/boot/initrd_auto.bin; \
        rm -f ${IMAGE_ROOTFS}/boot/splash_auto.bin; \
	cd ${IMAGE_ROOTFS}; \
	tar -cvf ${DEPLOY_DIR_IMAGE}/rootfs.tar -C ${IMAGE_ROOTFS} .; \
        mv ${DEPLOY_DIR_IMAGE}/rootfs.tar ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/rootfs.tar; \
        bzip2 ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/rootfs.tar; \
        cd ${DEPLOY_DIR_IMAGE}; \
        zip ${IMAGE_NAME}_usb.zip ${IMAGE_UNPACK_PATH}/*; \
        rm -rf vuplus; \
"

