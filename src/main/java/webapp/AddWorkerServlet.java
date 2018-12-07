package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addworker.jsp")
public class AddWorkerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String phoneNumber = req.getParameter("phoneNumber");

        String age = req.getParameter("age");
        String yearIncome = req.getParameter("yearIncome");
        String maritalStatus = req.getParameter("maritalStatus");


    }
}
