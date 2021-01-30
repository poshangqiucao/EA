<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<h4 class="text-break text-center text-info bg-light justify-content-center align-items-center">修改成绩</h4>
<form action="../UpGdAction.action" class="text-center text-info bg-light border-white align-items-center" method="post">
      <label>学号</label>
      <input class="form-control" type="number" name="stu_id" required="required">
      <label>课程名</label>
      <input class="form-control" type="text" name="grade_name" required="required">
      <label>平时成绩</label>
      <input class="form-control" type="number" name="grade_normal" required="required">
      <label>期中成绩</label>
      <input class="form-control" type="number" name="grade_middle" required="required">
      <label>期末成绩</label>
      <input class="form-control" type="number" name="grade_end" required="required">
      <button class="btn btn-success text-left shadow-sm" type="submit">提交</button>
      <button class="btn btn-danger shadow-sm" type="reset">重置</button>
</form>