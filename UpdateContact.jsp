<%--
  Created by IntelliJ IDEA.
  User: rysja
  Date: 02.06.16
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update contact</title>
</head>
<body>
<form method="post"
      action="UpdateContact">
    <h1 align="center">Phone Boock</h1>
    <p>
        Please select from the list the desired action:


        <select name="UpdateDropList" size="1">

            <option value="Update E-mail">Update E-mail</option>

            <option value="Update Name">Update Name</option>

            <option value="Update Number">Update Number</option>



        </select>


        <br><br>
    <center>
        <input type="SUBMIT">
    </center>
</form>
</body>
</html>
