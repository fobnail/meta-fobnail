LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e44b3af4925ec58e9f49b9ff143b5493 \
                    file://COPYING;md5=faed8f005d476edd3f250599a4bb9a75 \
                    file://ext/tinydtls/LICENSE;md5=ffb073dbb36e7ec5e091047332f302c5"

SRC_URI = "gitsm://github.com/obgm/libcoap.git;protocol=https;branch=release-4.3.0"

PV = "4.3.0+git${SRCPV}"
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
    cd ${S}
    touch ar-lib
}

do_compile:prepend() {
    cd ${S}
}

do_install:prepend() {
    cd ${S}
}
