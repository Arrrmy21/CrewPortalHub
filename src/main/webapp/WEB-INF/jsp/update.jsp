<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
    <head>
        <title>
            Adding worker
        </title>
    </head>

    <body>

          <p>Edit worker's info: </p>
          <p>ID: ${id}</p>

        <form action="/worker/update/${id}" method = "post" >

           <p><input type="text" name = "name" placeholder="name" >
           <p><input type="text" name = "age" placeholder="age">
           <p><input type="text" name = "phoneNumber" placeholder="+380999">

           <p><input type="text" name = "location.city" placeholder="city">
           <p><input type="text" name = "location.country" placeholder="country">
           <p><input type="text" name = "location.receptionPhone" placeholder="reception phone">

           <p><input type="text" name = "yearIncome" placeholder="year income">
           <p><select name = "maritalStatus" placeholder="martial status">
            <option> Single </option>
            <option> Married </option>
           </select>

           <p><input type="submit" value="Enter"></p>

        </form>
    <p></p>

        <form action="/">
            <input type="submit" value = "Main page">
        </form>

    </body>
</html>

