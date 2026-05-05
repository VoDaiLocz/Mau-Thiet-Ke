# Iterator Pattern - Inventory

## De bai

Tao iterator de in ra chi nhung item dang con hang.

## Thanh phan

`Item`

- Doi tuong san pham.
- Co `name` va `inStock`.

`ItemIterator<T>`

- Interface iterator.
- Quy dinh `hasNext()` va `next()`.

`Inventory`

- La aggregate, chua danh sach item.
- Cung cap `inStockIterator()`.
- Client khong can biet ben trong dung `List`, array hay collection nao.

`InStockItemIterator`

- Iterator cu the.
- Bo qua item het hang.
- Chi tra ve item co `inStock = true`.

## Cach noi ngan gon

Bai nay minh tao `Inventory` de chua cac `Item`, nhung client khong lap truc tiep qua list. Thay vao do client xin mot `ItemIterator`. Iterator nay tu biet cach di qua danh sach va bo qua cac item het hang, nen client chi can goi `hasNext()` va `next()`.
