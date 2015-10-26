require libgles.inc

COMPATIBLE_MACHINE = "^(vusolo4k)$"

SRCDATE = "20151019"
SRCDATE_PR = "r1"
PV="15.2"

do_install() {
        install -d ${D}${libdir}
        install -m 0755 ${S}/lib/*.so ${D}${libdir}
        install -m 0755 ${S}/lib/libliveMedia.so.1.2.1 ${D}${libdir}
        install -m 0755 ${S}/lib/libgroupsock.so.0.0.0 ${D}${libdir}
        install -m 0755 ${S}/lib/libUsageEnvironment.so.0.0.0 ${D}${libdir}
        install -m 0755 ${S}/lib/libBasicUsageEnvironment.so.0.0.1 ${D}${libdir}
        ln -s libv3ddriver.so ${D}${libdir}/libEGL.so
        ln -s libv3ddriver.so ${D}${libdir}/libGLESv2.so

        ln -s libliveMedia.so.1.2.1 ${D}${libdir}/libliveMedia.so.1
        ln -s libgroupsock.so.0.0.0 ${D}${libdir}/libgroupsock.so.0
        ln -s libUsageEnvironment.so.0.0.0 ${D}${libdir}/libUsageEnvironment.so.0
        ln -s libBasicUsageEnvironment.so.0.0.1 ${D}${libdir}/libBasicUsageEnvironment.so.0

        install -d ${D}${includedir}
        cp -a ${S}/include/* ${D}${includedir}/
}


SRC_URI[md5sum] = "3eb1afc52dad87ffd5bf1f45aecd55da"
SRC_URI[sha256sum] = "c63f02e0f5c99797c67c1d0e361de2aab86eab67f4dcc8d1dc21b332b15d1e0d"
