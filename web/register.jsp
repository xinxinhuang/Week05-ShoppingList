<%-- 
    Document   : register
    Created on : Oct 12, 2017, 9:05:37 AM
    Author     : Xin Xin Huang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Login Page</title>
    </head>
    <body>
        <h1><center>Shopping List</center></h1>
        <hr />
        <form action="ShoppingList?action=register" method ="POST">
            <center>
            USERNAME: <input type="text" name="usern">
            <input type ="submit" name="register" value="Register Name">
            </center>
        </form>
    </body>
</html>
