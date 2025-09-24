# Changelog

## 3.0.0 - 2025-09-22

### Changed (2)

- Added parameter `collateralAmount`
    - affected methods:
        - `flexibleLoanBorrow()` (`POST /sapi/v2/loan/flexible/borrow`)
- Added parameter `loanAmount`
    - affected methods:
        - `flexibleLoanBorrow()` (`POST /sapi/v2/loan/flexible/borrow`)

## 2.1.1 - 2025-08-07
- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-06-02

### Removed (8)

- `flexibleLoanCollateralRepayment()` (`POST /sapi/v2/loan/flexible/repay/collateral`)
- `cryptoLoanAdjustLtv()` (`POST /sapi/v1/loan/adjust/ltv`)
- `cryptoLoanBorrow()` (`POST /sapi/v1/loan/borrow`)
- `cryptoLoanCustomizeMarginCall()` (`POST /sapi/v1/loan/customize/margin_call`)
- `cryptoLoanRepay()` (`POST /sapi/v1/loan/repay`)
- `getCollateralAssetsData()` (`GET /sapi/v1/loan/collateral/data`)
- `getLoanOngoingOrders()` (`GET /sapi/v1/loan/ongoing/orders`)
- `getLoanableAssetsData()` (`GET /sapi/v1/loan/loanable/data`)

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
