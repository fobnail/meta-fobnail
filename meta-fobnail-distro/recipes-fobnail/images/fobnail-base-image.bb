require fobnail-base-image.inc

inherit extrausers

EXTRA_USERS_PARAMS = "usermod -p '${PASSWD}' root;"
