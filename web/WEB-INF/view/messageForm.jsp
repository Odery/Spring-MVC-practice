<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Submit You Message</title>
</head>
<body>
<form:form action="submit" modelAttribute="student">
    First Name: <form:input path="firstName"/>
    <br/><br/>
    Last Name: <form:input path="lastName"/>
    <br/><br/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
