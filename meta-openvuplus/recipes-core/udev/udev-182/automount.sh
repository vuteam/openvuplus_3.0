#!/bin/sh

get_mount_point() {
	mount |grep /dev/$1 |cut -d ' ' -f3
}

DEVICE=$1

if test -z $DEVICE; then
	exit 1
fi

if test -z "$(get_mount_point $DEVICE)"; then
	echo "[udev] mount /dev/$DEVICE"
	mount /dev/sda1
fi

