<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="css/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.2.0.js"></script>
    <script src="js/jquery.validate.js"></script>
    <script>
    $(function(){
        $("#Navbar").load("NavBar.jsp");
    });
    </script>
</head>
<body>

    <div id="Navbar"></div>

    <br>
    <div class="container-fluid">
                <div class="container ">
                    <div class="panel panel-default" style="max-width:400px;margin-left:auto; margin-right:auto;" align="left">
                        <div class="panel-heading form-group" align="center">
                            <b><font color="black">Log in</font> </b>
                        </div>

                        <div class="panel-body" >

                        <form action="LoginServlet" method="post" >
                            <div class="form-group">
                                <label for="exampleInputEmail1">User Name</label> <input
                                    type="text" class="form-control" name="LoginUserName" id="LoginUserName"
                                    placeholder="Enter User Name" required="required">

                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label> <input
                                    type="password" class="form-control" name="LoginPassword" id="LoginPassword"
                                    placeholder="Password" required="required">
                            </div>
                            <button type="submit" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" ><b>Login</b></button>

                        </form>

                        </div>
                    </div>

                </div>

            </div>
</body>
</html>
