LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ff626c483f6f10b69ee67274daf0775"

SRC_URI = " \
    git://github.com/fobnail/fobnail-attester;protocol=https;branch=main \
    file://0001-Makefile-fix-to-build-in-Yocto.patch \
"

PROVIDES:${PN} += "fobnail-attester"

DEPENDS = "openssl tpm2-tss libcoap qcbor"

PV = "1.0+git${SRCPV}"
SRCREV = "0b7085ff80a3417d079888c88f10578e8120ce88"

S = "${WORKDIR}/git"

INSANE_SKIP:${PN} = "ldflags"

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/bin/fobnail-attester ${D}${bindir}
}