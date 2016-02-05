<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!-- <link rel="stylesheet" type="text/css" href="css/login.css"> -->
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="js/login/login.js"></script>
<title>Login Page</title>
</head>
<body>
<form name="frm">
<div	
  class="fb-like"
  data-share="true"
  data-width="450"
  data-show-faces="true"
  data-size="large"
  >
</div>
<br><br>

<br><br>

<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
</fb:login-button>

<div id="status">
</div>
</form>
</body>
</html>