<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<link href="css/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="css/signup.css" rel="stylesheet">
<script src="js/jquery-2.2.0.js"></script>
<script src="js/jquery.validate.js"></script>
<script src="js/additional-methods.min.js"></script>
<script>
$(function(){
  $("#Navbar").load("SignoutNavBar.jsp");
});
</script>
</head>
<body>
  <div id="Navbar"></div>
<%

String uname = (String)request.getAttribute("username");

if(uname!=null)
{
    %>
    <h1>Hi welcome <%=uname%> </h1>
<%
}
%>
</body>
</html>
