<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
    <head>
        <title>
            Adding worker
        </title>
    </head>

    <body>
    <h4>Fill in: </h4>
        <form action="/worker/add" method = "post" >
        <table>
           <tr><td> Name: </td><td><input type="text" name = "name"/></td></tr>
           <tr><td> Age: </td><td><input type="number" name = "age"/></td></tr>
           <tr><td> Phone number: </td><td><input type="number" name = "phoneNumber"/ de></td></tr>

           <tr><td> City: </td><td><input type="text" name = "location.city"/></td></tr>
           <tr><td> Country: </td><td><input type="text" name = "location.country"/></td></tr>
           <tr><td> Reception phone: </td><td><input type="number" name = "location.receptionPhone"/></td></tr>

           <tr><td> Year income: </td><td><input type="number" name = "yearIncome" min="0"/></td></tr>
           <tr><td> Marital status: </td><td>
           <select name = "maritalStatus">
           <option> Single </option>
           <option> Married </option>
           </select>

           <tr><td><input type="submit" value="Enter"></p>
        </table>
        </form>

    <p></p>

        <form action="/">
            <input type="submit" value = "Main page">
        </form>

    </body>
</html>

