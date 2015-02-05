PR .= "-vuplus2"

RPROVIDES += "python-pickle-native python-pprint-native"

do_install() {
	oe_runmake 'DESTDIR=${D}' install
	install -d ${D}${bindir}/
	install -m 0755 Parser/pgen ${D}${bindir}/

	# Make sure we use /usr/bin/env python
	for PYTHSCRIPT in `grep -rIl ${bindir}/python ${D}${bindir}`; do
		sed -i -e '1s|^#!.*|#!/usr/bin/env python|' $PYTHSCRIPT
	done

	ln -sf python ${D}${bindir}/python2

	install -d ${D}${bindir}/python-native
	ln -sf ${bindir}/python ${D}${bindir}/python-native/python
}

