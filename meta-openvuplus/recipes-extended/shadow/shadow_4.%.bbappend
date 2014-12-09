PR .= "-vuplus0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

# remove passwd login
ALTERNATIVE_${PN} = "passwd chfn newgrp chsh groups chpasswd login vipw vigr su"

