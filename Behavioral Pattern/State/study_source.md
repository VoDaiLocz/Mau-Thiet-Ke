# State Pattern - Media Player

## De bai

Media player co nut play/pause. Hanh vi cua nut thay doi theo trang thai hien tai.

## Thanh phan

`State`

- Interface chung cho cac trang thai.
- Co `play()` va `pause()`.

`PlayingState`

- Trang thai dang phat.
- Neu goi `pause()`, chuyen player sang `PausedState`.

`PausedState`

- Trang thai dang tam dung.
- Neu goi `play()`, chuyen player sang `PlayingState`.

`MediaPlayer`

- La context.
- Giu mot `State` hien tai.
- Khong dung if/else de xu ly play/pause, ma uy quyen cho state.

## Cach noi ngan gon

Bai nay `MediaPlayer` co trang thai hien tai la `State`. Khi client bam play hoac pause, `MediaPlayer` khong tu if/else xem dang play hay pause. No goi sang object state hien tai. Moi state tu quyet dinh hanh vi va co the doi state cua player.
