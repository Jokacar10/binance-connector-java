# Changelog

## 5.0.0 - 2025-09-22

### Changed (1)

#### REST API

- Modified response for `accountInformationV3()` method (`GET /fapi/v3/account`):
  - `assets`: item property `marginAvailable` deleted

## 4.0.1 - 2025-08-07
- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 4.0.0 - 2025-07-16

### Added (1)

- Support User Data Streams.

### Changed (1)

- Update `binance/common` module to version `1.4.0`.

## 3.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.
- Added `messageMaxSize` configuration for websocket.

## 3.0.0 - 2025-06-24

### Changed (1)

#### REST API

- Modified response for `exchangeInformation()` method (`GET /fapi/v1/exchangeInfo`):
    - `assets`.`autoAssetExchange`: type `integer` → `string`
    - `symbols`.`filters`.`multiplierDecimal`: type `integer` → `string`
- Fixed cases where the response can be an object or an array

## 2.0.0 - 2025-06-02
### Removed (1)

#### REST API

- `historicalBlvtNavKlineCandlestick()` (`GET /fapi/v1/lvtKlines`)

### Changed (1)

#### REST API

- Add `price` and `weight` to `constituents` object.

## 1.2.0 - 2025-05-13

- Add proxy authentication for websocket

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
