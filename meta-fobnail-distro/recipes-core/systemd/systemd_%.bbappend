# we promote the usage of chrony instead of the timesyncd - remove so it does
# not wast space
PACKAGECONFIG:remove = "timesyncd"

do_install:append() {
    rm ${WORKDIR}/image/lib/systemd/network/*
}
