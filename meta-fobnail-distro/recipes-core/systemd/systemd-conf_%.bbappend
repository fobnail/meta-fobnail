SRC_URI += " \
    file://fobnail_usb.network \
"

NETWORKCONFDIR = "$sysconfdir/systemd/network"

do_install:append(){
    # this append removes unused systemd configs that overrides our
    #   fobnail token configuration
    rm ${D}/lib/systemd/network/*

    install -d ${D}${NETWORKCONFDIR}
    install -m 755 ${WORKDIR}/fobnail_usb.network ${D}${NETWORKCONFDIR}
}
