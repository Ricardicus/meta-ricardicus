DESCRIPTION = "Ricardicus ric-script interpreter"
HOMEPAGE = "https://ricardicus.se"
LICENSE = "CLOSED"

SRCREV = "96cfa72892079c4f6d6610bc6dac42bd273ea422"
SRC_URI = "git://git@github.com/Ricardicus/ric-script.git"

S = "${WORKDIR}/git"

inherit meson 

DEPENDS = "python3 meson-native"

MESON_BUILDTYPE_${PN} = "release"

USERADD_PACKAGES = "${PN}"

FILES_${PN} = "/usr/bin/ric"

IMAGE_INSTALL_append = " ric-script"


