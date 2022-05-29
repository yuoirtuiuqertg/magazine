<!DOCTYPE html>
<html>
<head>
    <title>MAGAZINE</title>
</head>
<body>
<h1>MAGAZINE
<h4>Товары </h4>

<#list baskets as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. </p>

    </div>

<#else>
    <h3>Товаров нет</h3>
</#list>
    <h2>Cумма Заказа : ${price}</h2>
    <h1><a href="/">Главная</a></h1><hr>
<hr>
    <form action="/basket/delete" method="post" enctype="multipart/form-data">
        <input type="submit" value="Удалить"/>
    </form>
</body>
</html>