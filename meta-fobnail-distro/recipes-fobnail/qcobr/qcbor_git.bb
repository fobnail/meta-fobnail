DESCRIPTION = " \
    QCBOR is a powerful, commercial-quality CBOR encoder/decoder that \
    implements these RFCs: RFC8949, RFC7049, RFC8742, RFC8943 \
"

HOMEPAGE = "https://github.com/laurencelundblade/QCBOR"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/laurencelundblade/QCBOR;protocol=https;branch=master"

PV = "1.0+git${SRCPV}"
SRCREV = "44754f738c6534a4304a83d4c6e97b3d3193d887"

S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${D}${includedir}/qcbor \
"

INSANE_SKIP:${PN}-dev += "ldflags"

inherit cmake autotools pkgconfig

CFLAGS += " \
    -DUSEFULBUF_DISABLE_ALL_FLOAT \
"

do_compile:prepend(){
    cd ${S}
}

do_install(){
    cd ${S}

    install -d ${D}${libdir}
    install -m 755 ${S}/libqcbor.a ${D}${libdir}/

    install -d ${D}${includedir}/qcbor
	install -m 644 ${S}/inc/*.h ${D}${includedir}
    install -m 644 ${S}/inc/qcbor/*.h ${D}${includedir}/qcbor
}
