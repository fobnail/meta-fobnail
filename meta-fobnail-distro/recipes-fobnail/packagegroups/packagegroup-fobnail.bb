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
  tpm2-tools \
  tpm2-tss \
  tpm2-abrmd \
  libtss2-mu \
  libtss2-tcti-device \
  libtss2-tcti-mssim \
"
