<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="css/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <br>
    <div class="container-fluid">
        <div class="panel panel-primary">
            <div class="panel-heading" align="center">
                <h4><b><font color="black" style="font-family: Droid-sans;">MPO Login</font> </b></h4>
            </div>
            <div class="panel-body"align="center">

                <div class="container " style="margin-top: 10%; margin-bottom: 10%;">

                    <div class="panel panel-primary" style="max-width: 35%;" align="left">

                        <div class="panel-heading form-group">
                            <b><font color="black">Login</font> </b>
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
            <div class="panel-footer" align="center"><font style="color: #111">Copyright @2016 Z-Technologies </font></div>
        </div>
    </div>

</body>
</html>
