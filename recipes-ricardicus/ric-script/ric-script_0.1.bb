DESCRIPTION = "Ricardicus ric-script interpreter"
HOMEPAGE = "https://ricardicus.se"
LICENSE = "CLOSED"

SRCREV = "6e15b737e1b0efcc80c8e73c1cdb3f98e36671b9"
SRC_URI = "git://git@github.com/Ricardicus/ric-script.git"

S = "${WORKDIR}/git"

inherit meson 

DEPENDS = "python3 meson-native"

MESON_BUILDTYPE_${PN} = "release"

USERADD_PACKAGES = "${PN}"

FILES_${PN} = "/usr/bin/ric"

IMAGE_INSTALL_append = " ric-script"


