<!DOCTYPE html>
<html>
<head>
    <title>MAGAZINE</title>
</head>
<body>
<h4>Адресс клиента</h4>
<#list locations as location>
    <div>
        <p><b>${location.city}</b> ${location.street} ул. | <a href="/userLocation/${location.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Адресов нет</h3>
</#list>
<hr>
<h3>Добавить новый адресс</h3>
<form action="/userLocation/create" method="post" enctype="multipart/form-data">
    Название улицы: <input type="text" name="street"/><br><br>
    Номер дома: <input type="number" name="houseNumber"/><br><br>
    Номер подъезда: <input type="number" name="entrance"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Код дамофона: <input type="text" name="intercomCode"/><br><br>
    <input type="submit" value="Добавить адресс"/>
    <h1><a href="/">Главная</a></h1><hr>
</form>
</body>
</html>