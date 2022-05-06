# we promote the usage of chrony instead of the timesyncd - remove so it does
# not wast space
PACKAGECONFIG:remove = "timesyncd"

do_install:append() {
    # this append removes unused systemd configs that overrides our
    #   fobnail token configuration
    rm ${D}/lib/systemd/network/*
}
