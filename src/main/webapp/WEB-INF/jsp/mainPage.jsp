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

        <table style="border: 1px solid; width: 100%; text-align:center">
         <thead style="background:#d3dce3">
          <tr>
           <th>Name</th>
           <th>Phone number</th>
           <th>Location ID</th>
           <th>Tools</th>
           <th>Tools</th>
          </tr>
         </thead>

         <tbody style="background:#ccc">

         <c:forEach var="worker" items="${listOfWorkers}">
           <tr>
            <td> <a href = "worker/get/${worker.id}"> ${worker.name} </a> </td>
            <td>${worker.phoneNumber}</td>
            <td> <a href = "worker/location/${worker.id}"> workerId </a> </td>
            <td> <a href = "worker/update/${worker.id}"> update </a> </td>
            <td> <a href = "worker/remove/${worker.id}"> remove </a> </td>
           </tr>
           </c:forEach>

         </tbody>
        </table>

    </body>
</html>
