<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear employee, you are welcome </h2>

<br>
<br>
<br>

Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Department: ${employee.department}
<br><br>
Car: ${employee.car}
<br><br>
Language:
<ul>
<c:forEach var="lang" items="${employee.languages}">
    <li>${lang}</li>
</c:forEach>
</ul>
</body>
</html>