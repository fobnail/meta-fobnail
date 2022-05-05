DESCRIPTION = " \
    libcoap is a C implementation of a lightweight application-protocol for \
    devices that are constrained their resources such as computing power, RF \
    range, memory, bandwidth, or network packet sizes. \
"

HOMEPAGE = "https://libcoap.net"

LICENSE = "BSD 2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e44b3af4925ec58e9f49b9ff143b5493 \
                    file://COPYING;md5=faed8f005d476edd3f250599a4bb9a75 \
                    file://ext/tinydtls/LICENSE;md5=ffb073dbb36e7ec5e091047332f302c5"

SRC_URI = "gitsm://github.com/obgm/libcoap.git;protocol=https;branch=release-4.3.0"

PV = "4.3.0"
SRCREV = "1da37b9abbe871675d5939395b498324ccc8ecfe"

S = "${WORKDIR}/git"

DEPENDS += "openssl gnutls libtool"

inherit cmake autotools

EXTRA_OECONF = " \
--disable-tests \
--disable-documentation \
--disable-manpages \
--disable-dtls \
--disable-shared \
--enable-fast-install \
"

do_configure:prepend() {
    # enter to the ${WORKDIR}/git to avoid incorrect path errors
    cd ${S}
    # autogen.sh bugfix from https://github.com/obgm/libcoap/commit/0f76881802af5e06e6ee69e07e6c8aca7598adbf
    # it is not available in libcoap 4.3.0 version
    touch ar-lib
}

do_compile:prepend() {
    # enter to the ${WORKDIR}/git to avoid incorrect path errors
    cd ${S}
}

do_install:prepend() {
    cd ${S}
    # enter to the ${WORKDIR}/git to avoid incorrect path errors
}
