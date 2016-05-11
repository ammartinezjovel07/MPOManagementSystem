package user.Account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class SignupController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String fname = request.getParameter("SignUpFirstName");
      String mname = request.getParameter("SignUpMiddleName");
      String lname = request.getParameter("SignUpLastName");
      String org = request.getParameter("SignUpOrg");
      String dept = request.getParameter("SignUpDept");
      String postitle = request.getParameter("SignUpPosTitle");
      String deptnum = request.getParameter("SignUpDeptNum");
      String worknum = request.getParameter("SignUpWorkNum");
      String email = request.getParameter("SignUpEmail");
      String username = request.getParameter("SignUpUsername");
      String password = request.getParameter("SignUpPassword");

      Boolean success = createAccount(fname, mname, lname, org, dept, postitle, deptnum, worknum, email, username, password, "", "",false);
      if (success) {
          response.sendRedirect("registrationSuccessful.jsp");
      } else {
          response.sendRedirect("loginError.jsp");
      }
	}

}
