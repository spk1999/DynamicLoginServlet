<%-- 
    Document   : register
    Created on : Aug 22, 2018, 10:45:15 AM
    Author     : COD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="reg.jsp" method="get">
            <p>First Name
                <input type="text" name="fname"></p>
            <p>Last Name
                <input type="text" name="lname"></p>
            <p>Email 
                <input type="text" name="email"></p>
            <p>Password 
                <input type="password" name="password"></p>
            <input type="submit" value="Register"/>
            Already Registered !! Login <a href="login.jsp"> Here </a>
            
        </form>
    </body>
</html>
