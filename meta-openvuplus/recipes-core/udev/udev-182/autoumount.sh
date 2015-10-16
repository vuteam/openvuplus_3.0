#!/bin/sh

get_mount_point() {
	mount |grep /dev/$1 |cut -d ' ' -f3
}

DEVICE=$1

if test -z $DEVICE; then
	exit 1
fi

MOUNTPOINT="$(get_mount_point $DEVICE)"

if test -n "${MOUNTPOINT}"; then
	echo "[udev] umount -l ${MOUNTPOINT}"
	umount -l ${MOUNTPOINT}
fi

