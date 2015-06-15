<%-- 
    Document   : index
    Created on : Jun 4, 2015, 4:42:07 PM
    Author     : Oksana_Moroz
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TheatreSystem</title>
    </head>
    <body>
        <form method="post" action="/next_page">
            <table>
                <tr>
                    <td>Login:</td>
                    <td><input type="text" name="login"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Sign in"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
