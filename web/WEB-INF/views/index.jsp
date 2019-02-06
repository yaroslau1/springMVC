<!-- обратите внимание на spring тэги -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
  <title>Index Page</title>
</head>

<body>
<spring:form method="post"  modelAttribute="userJSP" action="check-user">

  Name: <spring:input path="name"/> (path="" - указывает путь, используемый в modelAttribute=''. в нашем случае User.name)  <br/>
  Password: <spring:input path="password"/>   <br/>
  <spring:button>Next Page</spring:button>

</spring:form>

<table border="1">
    <thead>
    <tr>
        <th>City Name</th>
        <th>Population</th>
        <th>Country Code</th>
        <th colspan=2>Action</th>
    </tr>
    </thead>
    <c:forEach items="${requestScope.cities}" var="cityName">
        <tr>
            <td><c:out value="${cityName.getName()}" /></td>
            <td><c:out value="${cityName.getPopulation()}" /></td>
            <td><c:out value="${cityName.getCountryCode()}" /></td>
        </tr>
    </c:forEach>
</table>

</body>

</html>
