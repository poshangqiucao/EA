<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
           <div class="container-fluid"><button class="btn btn-link d-md-none rounded-circle mr-3" id="sidebarToggleTop" type="button"><i class="fas fa-bars"></i></button>
	             <form action="../QryGdAction.action" class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
	                 <div class="input-group"><input class="bg-light form-control form-control-lg border-0 small" type="text" name="user_input" placeholder="Search for ...">
	                     <div class="input-group-append">
		                     <button class="btn btn-primary btn-sm py-0" type="submit">
		                     <i class="fas fa-search"></i>
		                     </button>
		                     <select class="shadow-sm form-control" name="type" required="required">
		                     <option value="stu_id" >按学号查</option>
		                     <option value="grade_name">按课程名查</option>
							 <option value="queryall">查询全部</option>
							 <option value="queryallTea">查询教师</option>
	                     </select>
	                     </div>
	                 </div>
	             </form>
               <ul class="nav navbar-nav flex-nowrap ml-auto">
                   <li class="nav-item dropdown no-arrow" role="presentation">
                       <li class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">
						   <span class="d-none d-lg-inline mr-2 text-gray-600 small"><%out.print((String)session.getAttribute("tea_id"));%></span>
						   <img class="border rounded-circle img-profile" src="assets/img/avatars/avatar1.jpeg"></a>
                           <div class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu">
							   <!-- <a class="dropdown-item" role="presentation" href="#"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Profile</a>
							   <a class="dropdown-item" role="presentation" href="#"><i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Settings</a>
                               <a class="dropdown-item" role="presentation" href="#"><i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Activity log</a> -->
							   <div class="dropdown-divider"></div>
							   <a class="dropdown-item" role="presentation" href="login.jsp">
							   <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;退出</a></div>
           				</li>
           		</li>
           </ul>
   </div>
</nav>    
