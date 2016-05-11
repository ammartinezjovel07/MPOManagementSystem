import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.Account;
import user.RegularUser;


/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("LoginUserName");
    String password = request.getParameter("LoginPassword");

    HttpSession session = request.getSession(false);

    Boolean success = verifyCredentials(username, password);
    if (success) {
        session.setAttribute("username", username);
        response.sendRedirect("UserPage.jsp");
    }else{
        response.sendRedirect("loginError.jsp");
    }
	}

}
