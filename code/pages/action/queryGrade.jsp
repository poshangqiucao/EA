<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="SystemCoding.model.po.*"%>
<h4 class="text-break text-center text-info bg-light justify-content-center align-items-center">查询结果</h4>
<div class="table-responsive">
    <table class="table">
        <thead>
            <tr>
                <th>学号</th>
                <th>科目</th>
                <th>平时成绩</th>
                <th>期中成绩</th>
                <th>期末成绩</th>
                <th>总成绩</th>
            </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Grade> grade_list =(ArrayList<Grade>)session.getAttribute("grade_list");
            if(grade_list!=null){
                for(int i = 0;i<grade_list.size();i++){
                    out.print("<tr>");
                    out.print("<td>"+grade_list.get(i).getStu_id()+"</td>");
                    out.print("<td>"+grade_list.get(i).getGrade_name()+"</td>");
                    out.print("<td>"+grade_list.get(i).getGrade_normal()+"</td>");
                    out.print("<td>"+grade_list.get(i).getGrade_middle()+"</td>");
                    out.print("<td>"+grade_list.get(i).getGrade_end()+"</td>");
                    out.print("<td>"+grade_list.get(i).getGrade()+"</td>");
                    out.print("<tr>");
                }
            }
            
        %>
        </tbody>
    </table>
</div>  