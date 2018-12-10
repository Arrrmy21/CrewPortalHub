<!DOCTYPE html>

<html>
    <head>
        <title>
            Adding worker
        </title>
    </head>
    <body>

        <form action="/CrewPortal-0.0.1-SNAPSHOT/showWorkers">
            <input type="submit" value = "show workers">
        </form>

        <form action="/CrewPortal-0.0.1-SNAPSHOT/worker" method = "post">
          <p>Fill in:</p>
           <p><input type="text" name = "name" placeholder="name">
           <p><input type="text" name = "age" placeholder="age">
           <p><input type="text" name = "phone number" placeholder="+380999">
           <p><input type="text" name = "location" placeholder="location">
           <p><input type="text" name = "year income" placeholder="year income">
           <p><input type="text" name = "martialStatus" placeholder="martial status">

           <p><input type="submit" value="Enter"></p>

         </form>

    </body>
</html>
