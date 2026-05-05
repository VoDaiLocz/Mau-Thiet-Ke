# Command Pattern - Smart Office System

## De bai

Bai nay dung file `Bai tap Command pattern.docx`.

He thong can co:

- Den: bat, tat, chinh do sang.
- Rem: keo len, ha xuong, dung tai vi tri bat ky.
- May chieu: che do lam viec, che do phim, tat.
- Macro: mot nut co the chay nhieu lenh.
- Undo: mot nut hoan tac thao tac vua lam.
- Log: luu lich su thao tac.

## Thanh phan

`Command`

- Interface chung cho moi lenh.
- Co `execute()`, `undo()`, `getName()`.

`TouchPanel`

- Invoker.
- Chi biet `Command`, khong biet chi tiet den, rem, may chieu.
- Goi `pressButton()` thi command tu thuc thi.
- Giu `history` de undo va `logs` de in lich su.

`LightingSystem`, `Blinds`, `Projector`

- Receiver.
- La doi tuong that su biet cach lam viec.

`LightCommand`, `BlindsCommand`, `ProjectorCommand`

- Concrete command.
- Moi command giu tham chieu den receiver tuong ung.
- Truoc khi chay thi luu trang thai cu de `undo()`.

`MacroCommand`

- Gom nhieu command con.
- `execute()` chay lan luot cac command.
- `undo()` hoan tac nguoc lai thu tu da chay.

## Cach noi ngan gon

Bai nay minh dong goi moi yeu cau thanh mot object `Command`. `TouchPanel` khong goi truc tiep den, rem hay may chieu, no chi goi `execute()` tren command. Command moi la thang giu receiver that va goi method that tren receiver. Neu can hoan tac, command dung trang thai cu da luu de `undo()`. `MacroCommand` gom nhieu command lai thanh mot kich ban, vi du bat dau hop thi ha rem, tat den va bat may chieu che do lam viec.

Neu them thiet bi moi, minh tao receiver moi va command moi, sau do gan vao `TouchPanel` bang `setCommand()`. Khong can sua code cua `TouchPanel`.
