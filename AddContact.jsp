<%--
  Created by IntelliJ IDEA.
  User: rysja
  Date: 31.05.16
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddContact</title>

</head>
<body>
<form method="post"
      action="AddContacts">
    <h1 align="center">Phone Boock</h1>
    <p> Please fill out these fields</p>
    Name: <input type="text" name="name"/> <br/>

    <p>Please input phone number no more than 12 digits </p>
    Phone number: <input type="tel" name="tel"  > <br/><-- таксь кажись тре поміняти на лонг а то інт малий


    Email: <input type="text" name="email"/> <br/>

    <br><br>
    <center>
        <input type="SUBMIT" value="Select">
    </center>
</form>
</body>
</html>
