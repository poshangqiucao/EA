<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<h4 class="text-break text-center text-info bg-light justify-content-center align-items-center">管理员添加账号</h4>
<form action="../AddZcAction.action" class="text-center text-info bg-light border-white align-items-center" method="post">
      <label>用户id</label>
      <input class="form-control" type="number" name="tea_id" required="required">
      <label>密码</label>
      <input class="form-control" type="password" name="tea_password" required="required">
      <button class="btn btn-success text-left shadow-sm" type="submit">提交</button>
      <button class="btn btn-danger shadow-sm" type="reset">重置</button>
</form>