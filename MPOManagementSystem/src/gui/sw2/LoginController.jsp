<%@ page import ="src.user.RegularUser" %>
<%
    String username = request.getParameter("LoginUserName");
    String password = request.getParameter("LoginPassword");

    Boolean success = verifyCredentials(username, password);
    if (success) {
         session.setAttribute("username", username);
         response.sendRedirect("UserPage.jsp");
     } else {
         response.sendRedirect("loginError.jsp");
     }
%>
