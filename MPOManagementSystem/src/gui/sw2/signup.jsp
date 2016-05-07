<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign up</title>
<link href="css/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="css/signup.css" rel="stylesheet">
<script src="js/jquery-2.2.0.js"></script>
<script src="js/jquery.validate.js"></script>
<script src="js/additional-methods.min.js"></script>
<script>

    $(function(){
        $("#Navbar").load("NavBar.jsp");
    });

	$(document).ready(function(){
		$(".SignUp").validate({
				rules: {
					SignUpFirstName: {
					    required: true,
                        minlength: 4,
					},
                    SignUpMiddleName:{
                        required: true,
                        minlength: 1,
                    },
                    SignUpLastName:{
                        required:true,
                        minlength:4,
                    },
					SignUpOrg: {
					    required: true,
					},
                    SignUpDept:{
                        required: true,
                    },
                    SignUpPosTitle:{
                        required: true,
                    },
                    SignUpDeptNum:{
                        required: true,
                        phoneUS: true,
                    },
                    SignUpWorkNum:{
                        required: true,
                        phoneUS: true,
                    },
                    SignUpEmail:{
                        required: true,
                        email: true
                    },
                    SignUpUsername:{
                        required: true,
                        minlength: 5,
                    },
					SignUpPassword: {
					    required: true,
					    minlength: 5,
                    },
                    ConfirmSignUpPassword:  {
					    required: true,
					    minlength: 5,
                        equalTo: "#SignUpPassword"
                    }
                },
				messages: {
					SignUpFirstName: {
                        required: "Please enter first name",
                        minlength: "Must be more than 4 characters"
                    },
                    SignUpMiddleName:{
                        required: "Please enter middle inital",
                        minlength: "Must be 1 character"
                    },
                    SignUpLastName:{
                        required: "Please enter last name",
                        minlength: "Must be more than 4 characters"
                    },
					SignUpOrg: "Please enter organization name",
                    SignUpDept: "Please enter organization name",
                    SignUpPosTitle: "Please enter organization name",
                    SignUpDeptNum: {
                        required: "Please enter department phone number",
                    },
                    SignUpWorkNum:{
                        required: "Please enter work phone number",
                    },
                    SignUpEmail:{
                        required: "Please enter email",
                    },
                    SignUpUsername:{
                        required: "Please enter username",
                        minlength: "Must be more than 5 characters"
                    },
					SignUpPassword: {
                        required: "Please enter password name",
                        minlength: "Must be more than 5 characters"
                    },
                    ConfirmSignUpPassword: {
                        required: "Please enter password name",
                        minlength: "Must be more than 5 characters",
                        equalTo: "Must be equal to password"
                    }
                },
			});
        });
</script>
</head>
<body>

    <div id="Navbar"></div>

    <br>
    <div class="container-fluid">
                <div class="container">
                    <div class="panel panel-default" style="max-width:400px;margin-left:auto; margin-right:auto;" align="left">

                        <div class="panel-heading form-group" align="center">
                            <b><font color="black">Sign up</font> </b>
                        </div>

                        <div class="panel-body" >

                        <form action="registration.jsp" class="SignUp" method="post" novalidate="novalidate" >
                            <div class="form-group">
                                <input
                                    type="text" class="form-control" name="SignUpFirstName" id="SignUpUserName"
                                    placeholder="Enter First Name" required="required">

                            </div>
                            <div class="form-group">
                                <input
                                    type="text" class="form-control" name="SignUpMiddleName" id="SignUpMiddleName"
                                    placeholder="Enter Middle inital" required="required">

                            </div>
                            <div class="form-group">
                                <input
                                    type="text" class="form-control" name="SignUpLastName" id="SignUpLastName"
                                    placeholder="Enter Last Name" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpOrg" id="SignUpOrg"
                                    placeholder="Enter Organization Name" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpDept" id="SignUpDept"
                                    placeholder="Enter Department Name" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpPosTitle" id="SignUpPosTitle"
                                    placeholder="Enter Position title" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpDeptNum" id="SignUpDeptNum"
                                    placeholder="Enter Department contact number" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpWorkNum" id="SignUpWorkNum"
                                    placeholder="Enter Work contact number" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpEmail" id="SignUpEmail"
                                    placeholder="Enter Email" required="required">

                            </div>
                            <div class="form-group">
                                 <input
                                    type="text" class="form-control" name="SignUpUsername" id="SignUpUsername"
                                    placeholder="Enter Username" required="required">

                            </div>
                            <div class="form-group">
                                <input
                                    type="password" class="form-control" name="SignUpPassword" id="SignUpPassword"
                                    placeholder="Password" required="required">
                            </div>
                            <div class="form-group">
                                 <input
                                    type="password" class="form-control" name="ConfirmSignUpPassword" id="ConfirmSignUpPassword"
                                    placeholder="Retype Password" required="required">
                            </div>
                            <button type="submit" style="width: 100%; font-size:1.1em;" class="btn btn-large btn btn-success btn-lg btn-block" ><b>Sign up</b></button>

                        </form>

                        </div>
                    </div>

                </div>

            </div>
    </div>

</body>
</html>
