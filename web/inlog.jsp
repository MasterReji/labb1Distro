<%-- 
    Document   : inlog
    Created on : 2016-sep-27, 11:36:29
    Author     : Reimondo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebShop </title>
    </head>

    <h1>Hello World!</h1>
    <html>
        <body>

            <form action="validate.jsp" method="post">
                Username:<br>
                <input type="text" name="username" maxlength="255">
                <br>
                password:<br>
                <input type="password" name="password" maxlength="255">
                <br><br>
                <input type="submit" value="Sign in">
                <input type="reset" value = "Clear">
            </form>
    </html>
</body>
</html>
