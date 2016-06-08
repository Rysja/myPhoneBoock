

<%--
  Created by IntelliJ IDEA.
  User: rysja
  Date: 02.06.16
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.sql.*" %>

<%@ page import="java.io.*,java.util.*,java.sql.* "%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
    <title>SELECT Operation</title>
</head>
<body>

<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://127.0.0.1:3306/phone_boock"
                   user="root"  password="4511426k"/>

<sql:query dataSource="${snapshot}" var="result">
    SELECT * from phon_list;
</sql:query>

<table border="1" width="100%">
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Phone Number</th>
        <th>Email</th>

    </tr>
    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.phon_name}"/></td>
            <td><c:out value="${row.phon_number}"/></td>
            <td><c:out value="${row.email}"/></td>

        </tr>
    </c:forEach>
</table>
<form method="post"
      action="ViewContacts">

    <center>
        <input type="SUBMIT" value="Back to main page">
    </center>
</form>

</body>
</html>
