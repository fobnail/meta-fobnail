# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   external/trussed/LICENSE-APACHE
#   external/formats/der/LICENSE-APACHE
#   external/formats/der/derive/LICENSE-APACHE
#   external/formats/tai64/LICENSE-APACHE
#   external/formats/tls_codec/LICENSE-APACHE
#   external/formats/spki/LICENSE-APACHE
#   external/formats/pkcs5/LICENSE-APACHE
#   external/formats/pkcs7/LICENSE-APACHE
#   external/formats/x509/LICENSE-APACHE
#   external/formats/x501/LICENSE-APACHE
#   external/formats/ssh-key/LICENSE-APACHE
#   external/formats/pem-rfc7468/LICENSE-APACHE
#   external/formats/sec1/LICENSE-APACHE
#   external/formats/pkcs8/LICENSE-APACHE
#   external/formats/pkcs1/LICENSE-APACHE
#   external/formats/pkcs10/LICENSE-APACHE
#   external/formats/base16ct/LICENSE-APACHE
#   external/formats/const-oid/LICENSE-APACHE
#   external/formats/base64ct/LICENSE-APACHE
#   external/nrf-hal/LICENSE-APACHE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ff626c483f6f10b69ee67274daf0775 \
                    file://external/trussed/LICENSE-APACHE;md5=ec0681e08ef3ade1a3447c2490cfc6b9 \
                    file://external/trussed/LICENSE-MIT;md5=7b988247ccd66e34ecb4f32b113e617a \
                    file://external/formats/der/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/der/LICENSE-MIT;md5=428db2d549235fafb31906820ae77df5 \
                    file://external/formats/der/derive/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/der/derive/LICENSE-MIT;md5=428db2d549235fafb31906820ae77df5 \
                    file://external/formats/tai64/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/tai64/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/tls_codec/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/tls_codec/LICENSE-MIT;md5=776a0c5a456bda5963e9e142fbc96bb1 \
                    file://external/formats/spki/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/spki/LICENSE-MIT;md5=ea1276dd9451d8a11b870fce51cc6d8a \
                    file://external/formats/pkcs5/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/pkcs5/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/pkcs7/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/pkcs7/LICENSE-MIT;md5=776a0c5a456bda5963e9e142fbc96bb1 \
                    file://external/formats/x509/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/x509/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/x501/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/x501/LICENSE-MIT;md5=428db2d549235fafb31906820ae77df5 \
                    file://external/formats/ssh-key/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/ssh-key/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/pem-rfc7468/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/pem-rfc7468/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/sec1/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/sec1/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/pkcs8/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/pkcs8/LICENSE-MIT;md5=776a0c5a456bda5963e9e142fbc96bb1 \
                    file://external/formats/pkcs1/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/pkcs1/LICENSE-MIT;md5=66089406d4d1efd8a063b66ca217462a \
                    file://external/formats/pkcs10/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/pkcs10/LICENSE-MIT;md5=428db2d549235fafb31906820ae77df5 \
                    file://external/formats/base16ct/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/base16ct/LICENSE-MIT;md5=52b84bf64140a82f709c2ea1f00a1486 \
                    file://external/formats/const-oid/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/const-oid/LICENSE-MIT;md5=5e35482afd7e851e1578b6e7ce9e212e \
                    file://external/formats/base64ct/LICENSE-APACHE;md5=a02fef6dccf840318474c108a8281b77 \
                    file://external/formats/base64ct/LICENSE-MIT;md5=0b2fd18071f5f9cae753b5071275a2a4 \
                    file://external/nrf-hal/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://external/nrf-hal/LICENSE-MIT;md5=40bb1a2b1e26d590df194b1538cc843f"

SRC_URI = "gitsm://github.com/fobnail/fobnail;protocol=https;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "be92a104c3b1f69260bb2a279a1e2349933d23ba"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
	:
}

