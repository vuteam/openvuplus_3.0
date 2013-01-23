PRINC = "1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://vuplus.patch"

SRC_URI[md5sum] = "3b2322695e9ee7bf447ebcdb85f93e83"
SRC_URI[sha256sum] = "639622180fe48dc7bb117ffbf263395d7ae47aac9819b8d9f83ff053ecf17bdd"

inherit autotools
