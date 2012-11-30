inherit image_types

UBI_VOLNAME = "rootfs"
MKUBIFS_ARGS = "-m 2048 -e 126976 -c ${MKFS_UBI_MAX_ERASE_BLK_COUNT} -F"
UBINIZE_ARGS = "-m 2048 -p 128KiB"

IMAGEDIR ?= "${MACHINE}"
EXTRA_IMAGECMD_COMPAT = "--eraseblock=0x20000 -n -l"

IMAGE_CMD_ubi_prepend = " \
        cp ${IMAGE_ROOTFS}/boot/vmlinux.gz ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.vmlinux.gz; \
        cp ${IMAGE_ROOTFS}/boot/initrd_cfe_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.initrd_cfe_auto.bin; \
        cp ${IMAGE_ROOTFS}/boot/splash_cfe_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.splash_cfe_auto.bin; \
        rm -f ${IMAGE_ROOTFS}/boot/vmlinux.gz; \
        rm -f ${IMAGE_ROOTFS}/boot/initrd_cfe_auto.bin; \
        rm -f ${IMAGE_ROOTFS}/boot/splash_cfe_auto.bin; \
"

IMAGE_CMD_ubi_append = " \
        mkdir -p ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}; \
        cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubi ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/root_cfe_auto.bin; \
        cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.vmlinux.gz ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/kernel_cfe_auto.bin; \
        cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.initrd_cfe_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/initrd_cfe_auto.bin; \
        touch ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/reboot.update; \
        cd ${DEPLOY_DIR_IMAGE}; \
        zip ${IMAGE_NAME}_usb.zip ${IMAGE_UNPACK_PATH}/*; \
        rm -rf vuplus; \
"
