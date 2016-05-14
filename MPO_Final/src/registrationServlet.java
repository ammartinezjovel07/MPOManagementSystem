

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.Account;


/**
 * Servlet implementation class mainServlet
 */
@WebServlet("/signup")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String fname = request.getParameter("SignUpFirstName");
		   
		   //need middle initial
		    String mname = request.getParameter("SignUpMiddleName");
		    char mInitial = mname.charAt(0);
		    
		    String lname = request.getParameter("SignUpLastName");
		    String org = request.getParameter("SignUpOrg");
		    String dept = request.getParameter("SignUpDept");
		    String postitle = request.getParameter("SignUpPosTitle");
		    //department name
		    String deptnum = request.getParameter("SignUpDeptNum");
		    //work contact name
		    String worknum = request.getParameter("SignUpWorkNum");
		    String email = request.getParameter("SignUpEmail");
		    String username = request.getParameter("SignUpUsername");
		    String password = request.getParameter("SignUpPassword");
		    
		    String userType = "";
		    Boolean isApproved = false;
		    
		   // response.sendRedirect("registration/registrationSuccessful.jsp");
		    Account account = new Account(fname, mInitial, lname, org, dept, postitle, deptnum, worknum, email, username, password, userType, isApproved);
		    Boolean success = account.createAccount(fname, mInitial, lname, org, dept, postitle, deptnum, worknum, email, username, password, userType, isApproved);
		   if (success) {
			   
		       response.sendRedirect("users/registrationSuccessful.jsp");
		   } else {
		       response.sendRedirect("common_pages/loginError.jsp");
		    }
	}

}
