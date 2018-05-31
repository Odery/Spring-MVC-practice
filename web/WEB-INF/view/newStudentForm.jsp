<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New Student Form</title>
</head>
<body>

<form:form action="submit" modelAttribute="student">
    First Name: <form:input path="firstName"/>
    <br/><br/>

    Last Name: <form:input path="lastName"/>
    <br/><br/>

    Country:
    <form:select path="country">
        <form:options items="${data.countries}"/>
    </form:select>
    <br/><br/>

    Gender: <form:radiobuttons path="gender" items="${data.gender}"/>
    <br/><br/>

    Languages: <form:checkboxes path="lang" items="${data.language}"/>
    <br/><br/>

    <input type="submit" value="Submit">
</form:form>

</body>
</html>
