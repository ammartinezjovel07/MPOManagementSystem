<%
session.setAttribute("username", null);
session.invalidate();
response.sendRedirect("HomePage.jsp");
%>
