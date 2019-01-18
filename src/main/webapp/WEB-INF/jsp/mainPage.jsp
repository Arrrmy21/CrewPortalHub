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
           <th>Location ID</th>
          </tr>
         </thead>

         <tbody style="background:#ccc">

         <c:forEach var="worker" items="${listOfWorkers}">
           <tr>
            <td>${worker.name}</td>
            <td>${worker.phoneNumber}</td>
            <td> <a href = "worker/location/${worker.location.locationID}"> ${worker.location.locationID} </a> </td>
           </tr>
           </c:forEach>

         </tbody>
        </table>

    </body>
</html>
