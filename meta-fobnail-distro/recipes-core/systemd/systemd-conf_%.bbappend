FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://10-fobnail_usb.network \
"

do_install:append(){
    # this append removes unused systemd configs that overrides our
    #   fobnail token configuration
    rm ${D}/lib/systemd/network/*

    install -d ${D}${sysconfdir}/systemd/network
    install -m 755 ${WORKDIR}/10-fobnail_usb.network ${D}${sysconfdir}/systemd/network
}

FILES:${PN} += " \
    ${sysconfdir}/systemd/network/10-fobnail_usb.network \
"
