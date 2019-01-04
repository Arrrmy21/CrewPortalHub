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

        <c:url var="addUrl" value="/worker/add" />
        <table style="border: 1px solid; width: 100%; text-align:center">
         <thead style="background:#d3dce3">
          <tr>
           <th>Worker Id</th>
           <th>Worker Name</th>
           <th>Last Name</th>
           <th>Money</th>
           <th colspan="2"></th>
           <th>CC Type</th>
           <th>CC Number</th>
           <th colspan="3"></th>
          </tr>
         </thead>
         <tbody style="background:#ccc">
         <c:forEach items="${persons}" var="person">
          <c:url var="editUrl" value="/krams/main/record/edit?id=${person.id}" />
          <c:url var="deleteUrl" value="/krams/main/record/delete?id=${person.id}" />

          <c:if test="${!empty person.creditCards}">
           <c:forEach items="${person.creditCards}" var="creditCard">
           <tr>
            <td><c:out value="${person.id}" /></td>
            <td><c:out value="${person.firstName}" /></td>
            <td><c:out value="${person.lastName}" /></td>
            <td><c:out value="${person.money}" /></td>
            <td><a href="${editUrl}"><img src="${editImgUrl}"></img></a></td>
            <td><a href="${deleteUrl}"><img src="${deleteImgUrl}"></img></a></td>

            <td><c:out value="${creditCard.type}" /></td>
            <td><c:out value="${creditCard.number}" /></td>
            <c:url var="addCcUrl" value="/krams/main/creditcard/add?id=${person.id}" />
            <c:url var="editCcUrl" value="/krams/main/creditcard/edit?pid=${person.id}&cid=${creditCard.id}" />
            <c:url var="deleteCcUrl" value="/krams/main/creditcard/delete?id=${creditCard.id}" />
            <td><a href="${addCcUrl}">+</a></td>
            <td><a href="${editCcUrl}"><img src="${editImgUrl}"></img></a></td>
            <td><a href="${deleteCcUrl}"><img src="${deleteImgUrl}"></img></a></td>
           </tr>
           </c:forEach>
          </c:if>

          <c:if test="${empty person.creditCards}">
           <tr>
            <td><c:out value="${person.id}" /></td>
            <td><c:out value="${person.firstName}" /></td>
            <td><c:out value="${person.lastName}" /></td>
            <td><c:out value="${person.money}" /></td>
            <td><a href="${editUrl}"><img src="${editImgUrl}"></img></a></td>
            <td><a href="${deleteUrl}"><img src="${deleteImgUrl}"></img></a></td>

            <td>N/A</td>
            <td>N/A</td>
            <c:url var="addCcUrl" value="/krams/main/creditcard/add?id=${person.id}" />
            <td><a href="${addCcUrl}">+</a></td>
            <td></td>
            <td></td>
           </tr>
          </c:if>

         </c:forEach>
         </tbody>
        </table>

        <c:if test="${empty persons}">
         No records found.
        </c:if>

        <p><a href="${addUrl}">Create new record</a></p>


    </body>
</html>
