<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0" style="width: 250px;">
            <div class="container-fluid d-flex flex-column p-0">
                <a class="navbar-brand text-center d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                    <div class="sidebar-brand-icon rotate-n-15"></div>
                    <div class="sidebar-brand-text mx-3"></div><span data-bs-hover-animate="swing">GMS</span></a>
                <hr class="sidebar-divider my-0">
                <ul class="nav navbar-nav text-light" id="accordionSidebar"></ul>
                <div class="text-center d-none d-md-inline"></div>
                <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
                    <div class="container-fluid d-flex flex-column p-0">
                        <ul class="nav navbar-nav text-light" id="accordionSidebar">
                            <li class="nav-item" role="presentation"></li>
                            <hr class="sidebar-divider">
                            <div class="sidebar-heading">
                                <p class="mb-0">管理功能</p>
                            </div>
                            <li class="nav-item" role="presentation">
                                <div><a class="btn btn-link nav-link" data-toggle="collapse" aria-expanded="false" aria-controls="collapse-1" href="#collapse-1" role="button"><i class="fas fa-cog"></i>&nbsp;<span>教师</span></a>
                                    <div class="collapse" id="collapse-1">
                                        <div class="bg-white border rounded py-2 collapse-inner">
                                            <h6 class="collapse-header">功能项</h6>
                                            <a class="collapse-item" href="tea_main.jsp">添加成绩</a>
                                            <a class="collapse-item" href="tea_update.jsp">修改成绩</a>
                                            <a class="collapse-item" href="tea_query.jsp">查询成绩</a>
                                            <a class="collapse-item" href="tea_del.jsp">删除成绩</a> 
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <hr class="sidebar-divider">
                            <li class="nav-item" role="presentation">
                                <div><a class="btn btn-link nav-link" data-toggle="collapse" aria-expanded="false" aria-controls="collapse-1" href="#collapse-1" role="button"><i class="fas fa-cog"></i>&nbsp;<span>管理员</span></a>
                                    <div class="collapse" id="collapse-1">
                                        <div class="bg-white border rounded py-2 collapse-inner">
                                            <h6 class="collapse-header">功能项</h6>
                                            <a class="collapse-item" href="admin_addzc.jsp">添加账号</a>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <hr class="sidebar-divider">
                            <li class="nav-item" role="presentation">
                                <div><a class="btn btn-link nav-link" data-toggle="collapse" aria-expanded="false" aria-controls="collapse-1" href="#collapse-1" role="button"><i class="fas fa-cog"></i>&nbsp;<span>院长</span></a>
                                    <div class="collapse" id="collapse-1">
                                        <div class="bg-white border rounded py-2 collapse-inner">
                                            <h6 class="collapse-header">功能项</h6>
                                            <a class="collapse-item" href="tea_all.jsp">查询老师账号</a> 
                                            <a class="collapse-item" href="tea_query.jsp">查询全院学生成绩</a>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <hr class="sidebar-divider">
                            <li class="nav-item" role="presentation">
                                <div><a class="btn btn-link nav-link" data-toggle="collapse" aria-expanded="false" aria-controls="collapse-1" href="#collapse-1" role="button"><i class="fas fa-cog"></i>&nbsp;<span>辅导员</span></a>
                                    <div class="collapse" id="collapse-1">
                                        <div class="bg-white border rounded py-2 collapse-inner">
                                            <h6 class="collapse-header">功能项</h6>                                       
                                            <a class="collapse-item" href="tea_query.jsp">查询全部成绩</a> 
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <hr class="sidebar-divider">
                            <li class="nav-item" role="presentation">
                                <div><a class="btn btn-link nav-link" data-toggle="collapse" aria-expanded="false" aria-controls="collapse-1" href="#collapse-1" role="button"><i class="fas fa-cog"></i>&nbsp;<span>学生</span></a>
                                    <div class="collapse" id="collapse-1">
                                        <div class="bg-white border rounded py-2 collapse-inner">
                                            <h6 class="collapse-header">功能项</h6>
                                            <a class="collapse-item" href="tea_query.jsp">查询成绩</a> 
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <hr class="sidebar-divider">
                        </ul>
                        <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
                        <hr class="sidebar-divider my-0">
                    </div>
               </nav>
      </div>
</nav>
    