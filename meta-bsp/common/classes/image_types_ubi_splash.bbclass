inherit image_types

UBI_VOLNAME = "rootfs"
MKUBIFS_ARGS = "-m 2048 -e 126976 -c ${MKFS_UBI_MAX_ERASE_BLK_COUNT} -F"
UBINIZE_ARGS = "-m 2048 -p 128KiB"

IMAGEDIR ?= "${MACHINE}"
EXTRA_IMAGECMD_COMPAT = "--eraseblock=0x20000 -n -l"

IMAGE_CMD_ubi_prepend = " \
	cp ${IMAGE_ROOTFS}/tmp/vmlinux.gz ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.vmlinux.gz; \
	cp ${IMAGE_ROOTFS}/boot/splash_cfe_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.splash_cfe_auto.bin; \
	rm -f ${IMAGE_ROOTFS}/tmp/vmlinux.gz; \
	rm -f ${IMAGE_ROOTFS}/boot/splash_cfe_auto.bin; \
	mkfs.jffs2 --root=${IMAGE_ROOTFS}/boot --faketime \
	--disable-compressor=lzo --compression-mode=size \
	--output=${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.boot.jffs2 \
	${EXTRA_IMAGECMD_COMPAT}; rm -rf ${IMAGE_ROOTFS}/boot/*; \
"

IMAGE_CMD_ubi_append = " \
	vfi3 ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubi ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.boot.jffs2 ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.vmlinux.gz > ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi; \
	mkdir -p ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}; \
	cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubi ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/root_cfe_auto.jffs2; \
	cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.boot.jffs2 ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/boot_cfe_auto.jffs2; \
	cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.vmlinux.gz ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/kernel_cfe_auto.bin; \
	cp ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.splash_cfe_auto.bin ${DEPLOY_DIR_IMAGE}/${IMAGE_UNPACK_PATH}/splash_cfe_auto.bin; \
        cd ${DEPLOY_DIR_IMAGE}; \
        zip ${IMAGE_NAME}_usb.zip ${IMAGE_UNPACK_PATH}/*; \
        rm -rf vuplus; \
"
