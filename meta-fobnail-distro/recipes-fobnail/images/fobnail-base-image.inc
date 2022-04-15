DESCRIPTION = "fobnail image"

IMAGE_FEATURES += "ssh-server-openssh"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " \
  packagegroup-fobnail-system \
"

do_image_wic[depends] += " \
  secure-kernel-loader:do_deploy \
"

WKS_FILE_DEPENDS:remove = "grub-efi"

WKS_FILE_DEPENDS:append = " grub-tb"
