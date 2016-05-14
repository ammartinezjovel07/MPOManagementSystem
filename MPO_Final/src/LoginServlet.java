

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.Account;
import user.RegularUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		String username = request.getParameter("LoginUserName") ;
		String password = request.getParameter("LoginPassword");
		
		
		
		RegularUser ru = new RegularUser();
		Account account = new Account();
		account = ru.verifyCredentials(username, password);
		if (account ==null)
		{
			response.sendRedirect("common_pages/loginError.jsp");
		}
		else
		{
			request.getSession().invalidate();
			request.getSession().setAttribute("username", username);
			response.sendRedirect("users/UserPage.jsp");
		}	
	}

}
