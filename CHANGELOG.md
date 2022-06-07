# Changelog
Description of changes in meta layers for system image used in the Fobnail
Project. Able to run on PC Engines apu2.

## [Unreleased]

## [0.2.2] - 2022-06-07
### Fixed

- root password on production image
- Fobnail Attester logging

## [0.2.1] - 2022-06-06
### Updated

- GRUB updated
- Landing Zone replaced by Secure Kernel Loader

## [0.2.0] - 2022-05-23
### Added

- `kexec` tools package
- systemd service config file to run `fobnail-attester` on autostart

### Updated
- trenchboot kernel references (kexec support)

## [0.1.2] - 2022-05-06
### Added

- Integration with `fobnail-attester`

## [0.1.1] - 2022-04-20
### Added

- TPM support with `tpm2-tools` software

## [0.1.1] - 2022-04-13
### Added

- Initial version of meta layer for system image used in the Fobnail Project

[Unreleased]: https://github.com/fobnail/meta-fobnail/compare/v0.2.2...HEAD
[0.2.2]: https://github.com/fobnail/meta-fobnail/compare/v0.2.1...v0.2.2
[0.2.1]: https://github.com/fobnail/meta-fobnail/compare/v0.2.0...v0.2.1
[0.2.0]: https://github.com/fobnail/meta-fobnail/compare/v0.1.2...v0.2.0
[0.1.2]: https://github.com/fobnail/meta-fobnail/compare/v0.1.1...v0.1.2
[0.1.1]: https://github.com/fobnail/meta-fobnail/compare/v0.1.0...v0.1.1
[0.1.0]: https://github.com/fobnail/meta-fobnail/compare/3274b50a7b5d5a18f97c19412e06e98a7bcdb0d3...v0.1.0

