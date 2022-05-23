SUMMARY = "Fobnail packagegroup"
DESCRIPTION = "Fobnail packagegroup"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
  ${PN}-system \
"

RDEPENDS:${PN}-system = " \
  packagegroup-core-base-utils \
  chrony \
  chronyc \
  tpm2-tools \
  fobnail-attester \
  kexec-tools \
"
