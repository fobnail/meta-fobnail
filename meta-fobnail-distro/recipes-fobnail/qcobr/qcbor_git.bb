# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/laurencelundblade/QCBOR;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git${SRCPV}"
#LIBVER = "1.0"
SRCREV = "44754f738c6534a4304a83d4c6e97b3d3193d887"

S = "${WORKDIR}/git"

FILES:${PN} += " \
    /usr/local/include/qcbor \
"

INSANE_SKIP:${PN}-dev += "dev-elf ldflags"

#/usr/local/lib/libqcbor.so 

#FILES:${PN}-staticdev += " 
#    /usr/local/lib/libqcbor.a 
#"

#FILES:${PN}-dev += " 
#    ${libdir}/libqcbor.so 
#"

inherit cmake autotools pkgconfig

CFLAGS += " \
    -DUSEFULBUF_DISABLE_ALL_FLOAT \
"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:

#do_configure:prepend(){
#    cd ${S}
#}

do_compile:prepend(){
    cd ${S}
#    make
}

#do_compile:append(){
#    make so
#}

do_install(){
    cd ${S}

    install -d ${D}${libdir}
    #install -m 755 ${S}/libqcbor.so ${D}${libdir}/
    install -m 755 ${S}/libqcbor.a ${D}${libdir}/


    install -d ${D}${includedir}/qcbor
	install -m 644 ${S}/inc/*.h ${D}${includedir}
    install -m 644 ${S}/inc/qcbor/*.h ${D}${includedir}/qcbor
#    pwd
}
