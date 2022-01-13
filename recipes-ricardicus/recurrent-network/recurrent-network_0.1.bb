DESCRIPTION = "Ricardicus recurrent neural net"
HOMEPAGE = "https://hem.ricardicus.se"
LICENSE = "CLOSED"

SRCREV = "afc85c15014dfec79a970069e3e992679d2fdfcd"
SRC_URI = "git://git@github.com/Ricardicus/recurrent-neural-net.git"

S = "${WORKDIR}/git"

inherit meson

DEPENDS = "python3 meson-native"

MESON_BUILDTYPE_${PN} = "release"

USERADD_PACKAGES = "${PN}"

FILES_${PN} = "/usr/bin/net"

IMAGE_INSTALL_append = " recurrent-network"
