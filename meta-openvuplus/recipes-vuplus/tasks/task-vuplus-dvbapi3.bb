DESCRIPTION = "Vuplus: DVB API v3 Task for the Vuplus Distribution"
SECTION = "vuplus/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

inherit task

PROVIDES = "\
  task-vuplus-dvbapi \
  ${PACKAGES}\
"

#
# task-vuplus-dvbapi3
#
RPROVIDES_${PN} = "task-vuplus-dvbapi"
DESCRIPTION_${PN} = "Vuplus: DVB API v3 Dependencies"
RDEPENDS_${PN} = "\
  dvbsnoop \
  dvbtraffic \
  sctzap \
 "
# vuplus-dvb-tools is included to task-vuplus-enigma2.inc with showiframe.
