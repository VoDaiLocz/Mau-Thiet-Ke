# Observer Pattern - Social Media Feed

## De bai

Mang xa hoi don gian: khi mot connection cap nhat status, feed cua nguoi theo doi duoc thong bao va hien thi status moi.

## Thanh phan

`Subject`

- Interface cho doi tuong bi theo doi.
- Co `registerObserver`, `removeObserver`, `notifyObservers`.

`Observer`

- Interface cho doi tuong nhan thong bao.
- Co `update(userName, status)`.

`Connection`

- La subject.
- Giu `userName`, `status` va danh sach observer.
- Khi `setStatus()`, no goi `notifyObservers()`.

`SocialMediaFeed`

- La observer.
- Khi nhan update, no them status vao danh sach feed.

`Client`

- Tao connection va feed.
- Dang ky feed theo doi connection.

## Cach noi ngan gon

Bai nay `Connection` la doi tuong duoc quan sat. `SocialMediaFeed` dang ky theo doi `Connection`. Moi lan `Connection` doi status, no khong can biet feed xu ly ra sao, no chi goi `notifyObservers()`. Cac observer tu nhan update va cap nhat feed cua minh.
