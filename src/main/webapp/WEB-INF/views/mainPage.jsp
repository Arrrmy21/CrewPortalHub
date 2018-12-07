<!DOCTYPE html>

<html>
    <head>
        <title>
            Main page
        </title>
    </head>
    <body>
        <p>Allowed actions:</p>

        <form action="/CrewPortal-0.0.1-SNAPSHOT/addworker">
            <input type="submit" value = "add worker">
        </form>

        <form action="/CrewPortal-0.0.1-SNAPSHOT/showWorkers">
            <input type="submit" value = "show workers">
        </form>

        <form action="/CrewPortal-0.0.1-SNAPSHOT/location">
            <input type="submit" value = "location">

            <table>
                  <c:forEach items="${TAREWEIGHT}" var="tareWeight" varStatus="loop">
                <c:set var="barCode" value="${BARCODE[loop.index]}" />
                <tr>
                  <td><c:out value="${tareWeight}" /></td>
                  <td><c:out value="${barCode}" /></td>
                </tr>
              </c:forEach>
            </table>
        </form>
    </body>
</html>
