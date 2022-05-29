<!DOCTYPE html>
<html>
<head>
    <title>MAGAZINE</title>
</head>
<body>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post" enctype="multipart/form-data">
    Вид товара: <input type="text" name="title"/><br><br>
    Название товара: <input type="text" name="name"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Магазин: <input type="text" name="magazine"/><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>