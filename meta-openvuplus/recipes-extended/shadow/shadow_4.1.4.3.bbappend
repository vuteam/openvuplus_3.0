PR .= "vuplus0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

pkg_postinst_${PN} () {
	for i in chpasswd chfn newgrp chsh groups vipw vigr ; do
		update-alternatives --install ${sbindir}/$i $i $i.${PN} 200
	done 

        if [ "x$D" != "x" ]; then
        	rootarg="--root=$D"
        else
        	rootarg=""
        fi

        pwconv $rootarg
        grpconv $rootarg
}

pkg_prerm_${PN} () {
        for i in chpasswd chfn newgrp chsh groups vipw vigr ; do
                update-alternatives --remove $i $i.${PN}
        done
}

