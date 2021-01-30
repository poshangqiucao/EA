<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page errorPage="err.jsp" %>

<!DOCTYPE html>
<html>
<%@ include file="block/header.jsp" %>
<body id="page-top">
    <div id="wrapper">
        <%@ include file="block/left_nav.jsp" %>
        <div class="d-flex flex-column" id="content-wrapper">
            <div id="content">
                <%@ include file="block/person_info.jsp" %>                        	
                <%@ include file="action/queryAllTea.jsp" %>
        	</div>
        <%@ include file="block/footer.jsp" %>
    	</div>
    <a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
   </div>
</body>
</html>