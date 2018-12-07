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

        <form action="/CrewPortal-0.0.1-SNAPSHOT/addworker" method = "get">
          <p>Fill in:</p>
           <p><input type="text" name = "username" placeholder="name">
           <p><input type="submit" value="Enter"></p>

         </form>

    </body>
</html>
