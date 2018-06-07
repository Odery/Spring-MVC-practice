<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New Student Form</title>
</head>
<body>

<form:form action="submit" modelAttribute="student">
    First Name<span style="color: red">*</span>: <form:input path="firstName"/>
    <form:errors path="firstName" cssStyle="color: red"/>
    <br/><br/>

    Last Name<span style="color: red">*</span>: <form:input path="lastName"/>
    <form:errors path="lastName" cssStyle="color: red"/>
    <br/><br/>

    Number<span style="color: red">*</span>: <form:input path="num"/>
    <form:errors path="num" cssStyle="color: red"/>
    <br/><br/>

    Country:
    <form:select path="country">
        <form:options items="${data.countries}"/>
    </form:select>
    <form:errors path="country" cssStyle="color: red"/>
    <br/><br/>

    Gender: <form:radiobuttons path="gender" items="${data.gender}"/>
    <br/><br/>

    Languages: <form:checkboxes path="lang" items="${data.language}"/>
    <br/><br/>

    <input type="submit" value="Submit">
</form:form>

</body>
</html>
