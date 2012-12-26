DESCRIPTION = "vuplus web manual"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

SRC_DATE = "20121018_p1"

PR = "${SRC_DATE}_r0"
SRC_URI = "http://code.vuplus.com/download/build.fc3abf29fb03f797e78f907928125638/embedded/vuplus_manual/${MACHINE}_${SRC_DATE}.tar.gz"

INHIBIT_PACKAGE_STRIP = "1"
S = "${WORKDIR}/${MACHINE}"

do_compile() {
}

do_install() {
        install -d ${D}/usr/local/manual
        install -d ${D}/usr/local/manual/image
	for f in *.html; do
                install -m 0644 ${WORKDIR}/${MACHINE}/$f ${D}/usr/local/manual/;
        done

	for f in *.jpeg; do
                install -m 0644 ${WORKDIR}/${MACHINE}/image/$f ${D}/usr/local/manual/image/;
	done
	for f in *.jpg; do
                install -m 0644 ${WORKDIR}/${MACHINE}/image/$f ${D}/usr/local/manual/image/;
	done
        for f in *.png; do
                install -m 0644 ${WORKDIR}/${MACHINE}/image/$f ${D}/usr/local/manual/image/;
        done
}

PACKAGE_ARCH := "${MACHINE_ARCH}"

PACKAGES = "${PN}"
FILES_${PN} = "/"

SRC_URI[md5sum] = "099122a07aa40142c0dee5fd2bbf9cc2"
SRC_URI[sha256sum] = "8e5b4857bae757e8ef28c88a290408ed59035298510ac0242cc959678babf4c3"
