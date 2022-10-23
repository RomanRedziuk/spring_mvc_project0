<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are WELCOME!</h2>

<br>
<br>
<br>

Your name: ${employee.name}
<br>
<br>
Your surname: ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department: ${employee.department}
<br>
<br>
Office location: ${employee.officeLocation}
<br>
<br>
Language(s):
<ul>

    <c:forEach var="lang" items="${employee.languages}">

        <li> ${lang} </li>

    </c:forEach>

</ul>


<br>
<br>
Phone Number: ${employee.phoneNumber}
<br>
<br>
Email: ${employee.email}


</body>

</html>