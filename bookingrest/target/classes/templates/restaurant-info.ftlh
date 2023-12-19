<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${restaurant.name}</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 20px;
            padding: 20px;
            background-color: #f8f8f8;
        }

        h1 {
            color: #333;
        }

        h4 {
            color: #333;
        }

        img {
            max-height: 150px;
            margin-bottom: 10px;
        }

        b {
            color: #333;
        }

        form {
            margin-top: 20px;
        }

        input[type="submit"] {
            padding: 8px 15px;
            background-color: #d9534f;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #c9302c;
        }
    </style>
</head>
<body>
<h1>${restaurant.name}</h1>
<hr>
<h4>Подробная информация о ресторане</h4>

<#list images as img>
    <img src="/images/${img.id}" alt="Restaurant Image"/><br><br>
</#list>

<b>Название ресторана:</b> ${restaurant.name}<br>
<b>Описание ресторана:</b> ${restaurant.description}<br>

<hr>


<form action="/reservation/reserve" method="post">
    <label for="people_for_reservation">На сколько человек:</label>
    <input type="number" name="people_for_reservation" required>

    <label for="reservationDateTime">Дата бронирования:</label>
    <input type="datetime-local" name="reservationDateTime" required>

    <input type="hidden" name="restaurant_id" value="${restaurant.restaurant_id}">

    <label for="user">Ваше ID:</label>
    <input type="number" name="user" required>

    <input type="submit" value="Забронировать место">
</form>
<hr>
<hr>
<form action="/restaurant/delete/${restaurant.restaurant_id}" method="post">
    <input type="submit" value="Удалить ресторан">
</form>

</body>
</html>
