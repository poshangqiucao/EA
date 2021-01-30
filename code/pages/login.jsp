<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page errorPage="err.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="../css/login.css">
<script src="../js/login.js"></script>
</head>
<body>
	<h1>学生成绩管理系统</h1>
	<h3>教师登录</h3>
	<div id="login_from">
		<form action="../LoginServlet" method="POST">
			<label>教师ID：</label>
			<input type="text" name="tea_id" class="input_class">
			<br>
			<br>
			<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
			<input type="password" name="tea_password" class="input_class">
			<br>
			<br>
			<label>验证码：</label>
			<input type="text" name="code" class="input_class">
			<br>
			<!-- <img alt="验证码" src="../CodeServlet"> -->
			<img id="pic" src="../CodeServlet" οnclick="chk_image()" alt="验证码" class="code">
			<br>
			<br>
			<input type="submit" value="登录">
			<input type="reset" value="清空">
		</form>
	</div>
</body>
</html>