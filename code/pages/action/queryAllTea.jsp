<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="SystemCoding.model.po.*"%>
<%@ page import="SystemCoding.model.service.*"%>
<h4 class="text-break text-center text-info bg-light justify-content-center align-items-center">查询结果</h4>
<div class="table-responsive">
    <table class="table">
        <thead>
            <tr>
                <th>教师ID</th>
                <th>教师姓名</th>
            </tr>
        </thead>
        <tbody>
        <%
            
            ArrayList<Teacher> tea_list = (ArrayList<Teacher>)session.getAttribute("grade_list");
            if(tea_list!=null){
                for(int i = 0;i<tea_list.size();i++){
                    out.print("<tr>");
                    out.print("<td>"+tea_list.get(i).getTea_id()+"</td>");
                    out.print("<td>"+tea_list.get(i).getTea_name()+"</td>");
                    out.print("<tr>");
                }
            }
            
        %>
        <tr>
            <td>201701</td>
            <td>李华</td>
        </tr>
        <tr>
            <td>201702</td>
            <td>李明</td>
        </tr>
        <tr>
            <td>201703</td>
            <td>李丽</td>
        </tr>
        <tr>
            <td>201704</td>
            <td>李晨</td>
        </tr>
       
        </tbody>
    </table>
</div>  