<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page errorPage="err.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>addGrade</title>
<link rel="stylesheet" type="text/css" href="../css/addGrade.css">
</head>
<body>
	<h1>管理学生成绩</h1>
	<%
		String tea_id = (String)session.getAttribute("tea_id");
		if(tea_id!=null){
			out.print("<h3>"+"欢迎您"+tea_id+"!"+"</h3>");
		}
	%>
	<div id="addGrade" class="choose">
		<form action="../AddGdAction.action" method="POST">
			<label>学号：</label>
			<input type="text" name="stu_id" class="addgrade_class">
			<br>
			<br>
			<label>课程名：</label>
			<!-- <input type="text" name="grade_name"> -->
			<select name="grade_name" class="addgrade_class">
				<option value="软件工程">软件工程</option>
				<option value="JSP程序设计">JSP程序设计</option>
				<option value="安卓开发">安卓开发</option>
				<option value="大数据开发">大数据开发</option>
				<option value="c++程序设计">c++程序设计</option>
				<option value="计算机网络">计算机网络</option>
			</select>
			<br>
			<br>
			<label>总分数：</label>
			<input type="number" name="grade" min="0" max="100" step="0.1" class="addgrade_class">
			<br>
			<br>
			<label class="radio"><input name="oper_type" type="radio" value="addGrade" />录入</label> 
			<label class="radio"><input name="oper_type" type="radio" value="updateGrade" />修改 </label> 
			<label class="radio"><input name="oper_type" type="radio" value="delGrade" />删除 </label>
			<label class="radio"><input name="oper_type" type="radio" value="queryGrade" checked />查询 </label>
			<br>
			<br>
			<input type="submit" value="提交">
			<input type="reset" value="重置">
		</form>
		<%
			String msg = (String)session.getAttribute("msg");
			String score = (String)session.getAttribute("grade");
			if(msg!=null){
				if(msg.equals("true")){
					out.print("<h3>操作成功！</h3>");
				}else{
					out.print("<h3>操作失败！</h3>");
				}
			}
			if(score!=null){
				if(score.equals("0.0")){
					out.print("<h3>"+"未录入此课程分数！"+"</h3>");
				}else{
					out.print("<h3>"+"此课程总成绩："+"<b>"+score+"</b>"+"分</h3>");
				}
			}
		%>
	</div>
	
</body>
</html>