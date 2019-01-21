<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
    <head>
        <title>
            Profile page
        </title>
    </head>

    <body>
        <c:foreach var="worker" items="${worker}">
          <p>Worker's info:</p>

           <p>ID: ${worker.id}</p>
           <p>Name: ${worker.name}</p>
           <p>Phone number: ${worker.phoneNumber}</p>
           <p>Age: ${worker.age}</p>
           <p>Year income: ${worker.yearIncome}</p>
           <p>Marital status: ${worker.maritalStatus}</p>

         </c:foreach>
    <p></p>

        <form action="/">
            <input type="submit" value = "Main page">
        </form>

    </body>
</html>

