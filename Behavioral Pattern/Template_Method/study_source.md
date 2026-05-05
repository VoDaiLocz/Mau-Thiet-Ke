# Template Method Pattern - Pizza Recipe

## De bai

Hai cong thuc pizza co nhieu buoc trung nhau. Dung Template Method de loai bo code lap.

## Thanh phan

`PizzaRecipe`

- Abstract class.
- Co method template `printRecipe()`.
- Method nay co dinh thu tu cac buoc: chuan bi bot, them sauce, them topping, nuong.

`addToppings()`

- La buoc thay doi.
- Duoc khai bao abstract de lop con tu dinh nghia.

`CheesePizzaRecipe`, `VeggiePizzaRecipe`

- Lop con.
- Chi override phan topping khac nhau.

## Cach noi ngan gon

Bai nay cac cong thuc pizza co chung khung xu ly. Minh dua khung do vao `PizzaRecipe.printRecipe()`. Cac buoc chung thi de san trong lop cha, con buoc nao khac nhau nhu topping thi de lop con override. Nhu vay khong lap lai toan bo quy trinh cho tung loai pizza.
