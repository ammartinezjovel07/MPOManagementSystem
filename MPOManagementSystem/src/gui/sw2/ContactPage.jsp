<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MPO home</title>
<link href="css/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-2.2.0.js"></script>
<script src="js/jquery.validate.js"></script>
  <script>
    $(function(){
      $("#Navbar").load("NavBar.jsp");
    });

    $(document).ready(function(){
      $('#cancel').click(function(){
        window.location.href = 'ContactPage.jsp';
        return false;
      }),

  		$("#comment").validate({
  				rules: {
  					CommentName: {
  					       required: true,
                   minlength: 4
  					},
  				  CommentEmail: {
  					       required: true,
                   email: true
  					},
            CommentPhone: {
  					       required: true,
                   minlength: 11
  					},
  					CommentMessage: {
  					       required: true,
            }
          },
  				messages: {
  					CommentName: {
                required: "Please enter a name",
                minlength: "Must be more than 4 characters"
            },
  					CommentEmail: "Please enter email",
            CommentPhone: {
                required: "Please enter full name",
                minlength: "Must be a phone number like this +1(XXX) XXX-XXXX"
            },
  					CommentMessage: {
                required: "Please enter a comment"
            }
          },
  			});
    });
    </script>
</head>
<body>

<div id="Navbar"></div>

<form action="CommentServlet" method="post" class="form-horizontal" role="form" id="comment" novalidate="novalidate">
    <div class="form-group">
      <div class="col-sm-4">
        <input class="form-control" type="text" name="CommentName" id="CommentName" placeholder="Name">
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-4">
        <input class="form-control" type="text" name="CommentEmail" id="CommentEmail" placeholder="E-mail">
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-4">
        <input class="form-control" type="text" name="CommentPhone" id="CommentPhone" placeholder="Phone No.">
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-7">
        <textarea class="form-control" rows="7" name="CommentMessage" id="CommentMessage" placeholder="Messages"></textarea>
      </div>
    </div>
    <button type="submit" class="btn btn-default" id="cancel">Cancel</button>
    <button type="submit" class="btn btn-default">Send</button>
  </form>



</body>
</html>
