<#ftl  encoding='UTF-8'>
<#--<#import "/spring.ftl" as spring/>-->
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/styles.css" >
<#--    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="all" />-->
<#--    <#include "css/styles.css">-->
<#--    <#include "css/bootstrap.css">-->
</head>
<body>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Зарегистрируйтесь!
    </div>
    <form method="post" action="/signUp">
        <label for="login">Логин
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br>
        <label for="password">Пароль
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <label for="first-name">Имя
            <input class="input-field"  id="first-name" name="firstName">
        </label>
        <label for="last-name">Фамилия
            <input class="input-field"  id="last-name" name="lastName">
        </label>
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="remember-me">Запомнить меня</label>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>