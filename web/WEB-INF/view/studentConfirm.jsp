<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>New Student Confirmed!</title>
</head>
<body>
Student confirmed: ${student.firstName} ${student.lastName} <br/>
Country: ${student.country}, Gender: ${student.gender} <br/>
Languages: ${student.showLang()}
</body>
</html>
