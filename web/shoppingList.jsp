<%-- 
    Document   : shoppingList
    Created on : Oct 12, 2017, 9:05:46 AM
    Author     : Xin Xin Huang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop List Page</title>
    </head>
    <body>
        <h1>
            <center>Shopping List
        </h1>
        <hr />
        <p>Hello ${usern}</p>
        <a href ="ShoppingList?action=logout">Logout</a>      
        <hr />     
            </center>
     
        <form action="ShoppingList?action=additems" method="post">
        <p>ADD ITEM:
        <input type="text" name="items">
        <input type="submit" value="add"> 
        </p>
        </form>
        
        <c:forEach items="${shoplist}" var="items" varStatus="status">
            <input type="radio" name="itemlist" value="${status.index}"> ${items}
            <br>
        </c:forEach>
        
        
    </body>
</html>
