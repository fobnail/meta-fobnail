# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ff626c483f6f10b69ee67274daf0775"

SRC_URI = " \
    git://github.com/fobnail/fobnail-attester;protocol=https;branch=main \
    file://0001-Makefile-fix-to-build-in-Yocto.patch \
"

PROVIDES:${PN} += "fobnail-attester"

DEPENDS = "openssl tpm2-tss libcoap qcbor"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "0b7085ff80a3417d079888c88f10578e8120ce88"

S = "${WORKDIR}/git"

INSANE_SKIP:${PN} = "ldflags"
#INSANE_SKIP:${PN}-dev = "ldflags"

#CFLAGS += "-pthread"
#LDFLAGS += "-lpthread"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

#do_configure:prepend () {
#    cd ${S}
#    git submodule update --init --recursive
#}

do_install() {
    #cd ${S}
    #echo "${S}/bin/fobnail-attester"

    install -d ${D}${bindir}
    install -m 755 ${S}/bin/fobnail-attester ${D}${bindir}

}
