SUMMARY = "fobnail packagegroup"
DESCRIPTION = "fobnail packagegroup"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
  ${PN}-system \
"

RDEPENDS:${PN}-system = " \
  packagegroup-core-base-utils \
  chrony \
  chronyc \
"
