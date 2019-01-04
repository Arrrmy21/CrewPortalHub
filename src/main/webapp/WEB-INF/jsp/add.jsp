<!DOCTYPE html>

<html>
    <head>
        <title>
            Adding worker
        </title>
    </head>
    <body>

        <form action="/worker/list">
            <input type="submit" value = "show workers">
        </form>

        <form action="addWorker" method = "post">
          <p>Fill in:</p>
           <p><input type="text" name = "name" placeholder="name">
           <p><input type="text" name = "age" placeholder="age">
           <p><input type="text" name = "phoneNumber" placeholder="+380999">
           <p><input type="text" name = "location" placeholder="location">
           <p><input type="text" name = "yearIncome" placeholder="year income">
           <p><input type="text" name = "martialStatus" placeholder="martial status">

           <p><input type="submit" value="Enter"></p>

         </form>

    </body>
</html>
