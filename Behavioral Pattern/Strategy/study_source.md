# Strategy Pattern - Encryption

## De bai

Ung dung can xu ly nhieu cach ma hoa khac nhau. Thuat toan ma hoa duoc chon dong khi chay.

## Thanh phan

`EncryptionStrategy`

- Interface chung cho cac thuat toan ma hoa.
- Co `encrypt(text)`.

`AesEncryption`, `RsaEncryption`, `Base64Encryption`

- Cac concrete strategy.
- Moi class la mot cach ma hoa rieng.

`Encryptor`

- La context.
- Giu tham chieu den `EncryptionStrategy`.
- Khi can ma hoa, no goi `strategy.encrypt(text)`.

`Client`

- Chon strategy nao thi set strategy do vao `Encryptor`.

## Cach noi ngan gon

Bai nay minh khong viet if/else trong `Encryptor` de chon AES, RSA hay Base64. Minh tao interface `EncryptionStrategy`, moi cach ma hoa la mot class rieng. `Encryptor` chi giu strategy hien tai va goi `encrypt()`. Muon doi cach ma hoa thi client set strategy khac vao.
