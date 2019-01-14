<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <head>
        <title>
            Main page
        </title>
    </head>
    <body>
        <p>Allowed actions:</p>

        <form action="/worker/add">
            <input type="submit" value = "add worker">
        </form>

        <form action="/showWorkers">
            <input type="submit" value = "show workers">
        </form>

        <form action="/location">
            <input type="submit" value = "location">
        </form>

        <table style="border: 1px solid; width: 100%; text-align:center">
         <thead style="background:#d3dce3">
          <tr>
           <th>Name</th>
           <th>Phone number</th>
           <th>Location</th>
          </tr>
         </thead>
         <tbody style="background:#ccc">
         <c:forEach items="${listOfWorkers}" var="worker">

          <c:if test="${!empty listOfWorkers}">
           <c:forEach items="${worker}" var="worker">
           <tr>
            <td><c:out value="${worker.id}" /></td>
            <td><c:out value="${worker.name}" /></td>
            <td><c:out value="${worker.age}" /></td>
           </tr>
           </c:forEach>
          </c:if>

          <c:if test="${empty worker.location}">
           <tr>
            <td><c:out value="${worker.location.city}" /></td>
            <td><c:out value="${worker.location.country}" /></td>
            <td><c:out value="${worker.age}" /></td>

           </tr>
          </c:if>

         </c:forEach>
         </tbody>
        </table>

    </body>
</html>
