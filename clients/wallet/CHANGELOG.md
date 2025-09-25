# Changelog

## 3.0.0 - 2025-09-22

### Changed (1)

- Modified response for `depositHistory()` (`GET /sapi/v1/capital/deposit/hisrec`):
    - item property `travelRuleStatus` added
- Modified response for `allCoinsInformation()` (`GET /sapi/v1/capital/config/getall`):
    - `networkList`: item property `withdrawTag` added

## 2.1.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-06-11

### Added (1)

- `fetchAddressVerificationList()` (`GET /sapi/v1/addressVerify/list`)

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
