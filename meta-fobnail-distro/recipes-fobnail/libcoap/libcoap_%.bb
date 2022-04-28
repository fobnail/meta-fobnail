# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   COPYING
#   ext/tinydtls/LICENSE
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e44b3af4925ec58e9f49b9ff143b5493 \
                    file://COPYING;md5=faed8f005d476edd3f250599a4bb9a75 \
                    file://ext/tinydtls/LICENSE;md5=ffb073dbb36e7ec5e091047332f302c5"

SRC_URI = "gitsm://github.com/obgm/libcoap.git;protocol=https;branch=release-4.3.0"

# Modify these as desired
PV = "4.3.0+git${SRCPV}"
SRCREV = "1da37b9abbe871675d5939395b498324ccc8ecfe"

#PROVIDES = "libcoap"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: MbedTLS TinyDTLS Doxygen
DEPENDS += "openssl gnutls libtool"

inherit cmake autotools
#pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECONF = " \
--disable-tests \
--disable-documentation \
--disable-manpages \
--disable-dtls \
--disable-shared \
--enable-fast-install \
"

do_configure:prepend() {
    cd ${S}
    touch ar-lib
}

do_compile:prepend() {
    cd ${S}
}

do_install:prepend() {
    cd ${S}
}
