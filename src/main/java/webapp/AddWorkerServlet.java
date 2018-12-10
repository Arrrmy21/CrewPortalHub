package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/worker/add")
public class AddWorkerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/views/addWorker.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String phoneNumber = req.getParameter("phoneNumber");

        String age = req.getParameter("age");
        String yearIncome = req.getParameter("yearIncome");
        String maritalStatus = req.getParameter("maritalStatus");

        PrintWriter out = resp.getWriter();
        out.println("add worker");
        out.println("Name: " + name);
        out.println("Age: " + age);
        out.println("martial status: " + maritalStatus);
        out.println("location: " + location);
    }
}
