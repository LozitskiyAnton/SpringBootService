<html>
<head>
    <title>Title</title>
    <link href="css/styles.css" rel="stylesheet" type="text/css">
</head>

<#--<div class="form-style-2">-->
<#--    <div class="form-style-2-heading">-->
<#--        Please signUp-->
<#--    </div>-->
<#--    <form method="post" action="/users">-->
<#--        <label for ="firstName" > First name-->
<#--            <input class="input-field" type = "text" id="firstName" name="firstName" >-->
<#--        </label>-->
<#--        <label for="lastName"> Last Name-->
<#--            <input type = "text" id="lastName" name="lastName" >-->
<#--        </label>-->
<#--        <input type="submit" value="Add user">-->
<#--    </form>-->
<#--</div>-->

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <#list usersFromServer as user>
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
            </tr>
        </#list>


    </table>
</div>
</body>
</html>