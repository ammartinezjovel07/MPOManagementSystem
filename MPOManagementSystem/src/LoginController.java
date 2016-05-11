import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.*;


public class LoginController extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("LoginUserName");
    String password = request.getParameter("LoginPassword");

    HttpSession session = request.getSession(false);

    RegularUser ru = new RegularUser();
    Account account  = new Account();


    account = ru.verifyCredentials(username, password);
    if (account != null) {
        session.setAttribute("username", username);
        response.sendRedirect("gui/sw2/UserPage.jsp");
    }else{
        response.sendRedirect("gui/sw2/loginError.jsp");
    }
	}

}
