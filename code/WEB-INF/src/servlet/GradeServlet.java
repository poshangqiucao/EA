package SystemCoding.control.servlet;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import SystemCoding.control.action.*;
import SystemCoding.model.po.Grade;
import SystemCoding.model.service.TeacherService;
import SystemCoding.model.service.stringToMD5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;


/**
 * @author cheng
 * @version 1.0
 * @created 15-12��-2019 18:26:40
 */
// @WebServlet("GradeServlet")
public class GradeServlet extends HttpServlet {

	public GradeServlet(){

	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	/**
	 * 
	 * @param request
	 * @param response    response
	 * @exception ServletException,IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException,IOException{
		doPost(request, response);
	}

	/**
	 * 
	 * @param request
	 * @param response    response
	 * @exception ServletException,IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException,IOException{


		
		// HttpSession session = request.getSession();
		// String isLogin = (String)session.getAttribute("isLogin");
		// if(!isLogin.equals("true")){
		// 	response.sendRedirect("pages/login.jsp");
		// }

		String path = request.getRequestURI();
		String name = path.substring(path.indexOf("/"),path.indexOf("."));
		Action action = null;
		String return_path = "pages/tea_main.jsp";
		
		if(name.equals("/gms/AddGdAction")){
			action = new AddGdAction();
			return_path = "pages/tea_main.jsp";
		}else if(name.equals("/gms/DelGdAction")){
			action = new DelGdAction();
			return_path = "pages/tea_del.jsp";
		}else if(name.equals("/gms/UpGdAction")){
			action = new UpGdAction();
			return_path = "pages/tea_update.jsp";
		}else if(name.equals("/gms/QryGdAction")){
			action = new QryGdAction();
			return_path = "pages/tea_query.jsp";
		} 
		
		String msg = action.execute(request, response);
		
		if(msg.equals("true")){
			response.sendRedirect(return_path);
		}else{
			response.sendRedirect("pages/err.jsp");
		}
		
		


		// String stu_id = request.getParameter("stu_id");
		// String grade_name = request.getParameter("grade_name");
		// String grade = request.getParameter("grade");
		// String oper_type = request.getParameter("oper_type");

		// System.out.println(oper_type);
		
		// HttpSession session = request.getSession();
		// String msg = "false";
	
		// Grade dg = new Grade();
		// TeacherService ts = new TeacherService();


		// if(oper_type!=null){
		// 	if(oper_type.equals("addGrade")||oper_type.equals("updateGrade")){
		// 		if(stu_id.equals("")||grade_name.equals("")||grade.equals("")||(!stringToMD5.isNumeric(stu_id))){
		// 			msg = "false";
		// 		}else{

		// 			dg.setGrade(Float.parseFloat(grade));
		// 			dg.setGrade_name(grade_name);
		// 			dg.setStu_id(Integer.parseInt(stu_id));

		// 			if(oper_type.equals("addGrade")){
		// 				if(ts.addGrade(dg)){
		// 					msg = "true";
		// 				}else{
		// 					msg = "false";
		// 				}
		// 			}else{
		// 				if(ts.updateGrade(dg)){
		// 					msg = "true";
		// 				}else{
		// 					msg = "false";
		// 				}
		// 			}
					
		// 		}
		// 		session.setAttribute("msg",msg);
		// 		response.sendRedirect("pages/Grade.jsp");
		// 	}else if(oper_type.equals("delGrade")){
		// 		if(stu_id.equals("")||grade_name.equals("")||(!stringToMD5.isNumeric(stu_id))){
		// 			msg = "false";
		// 		}else{
		// 			dg.setGrade_name(grade_name);
		// 			dg.setStu_id(Integer.parseInt(stu_id));
		// 			if(ts.delGrade(dg)){
		// 				msg = "true";
		// 			}else{
		// 				msg = "false";
		// 			}
		// 		}
		// 		session.setAttribute("msg",msg);
		// 		response.sendRedirect("pages/Grade.jsp");
		// 	}else if(oper_type.equals("queryGrade")){
		// 		double score = 0.0;
		// 		if(stu_id.equals("")||grade_name.equals("")||(!stringToMD5.isNumeric(stu_id))){
		// 			msg = "false";
		// 		}else{
		// 			dg.setGrade_name(grade_name);
		// 			dg.setStu_id(Integer.parseInt(stu_id));
		// 			score = ts.queryGrade(dg);
		// 			if(score == 0.0){
		// 				msg = "false";
		// 			}else{
		// 				msg = "true";
		// 			}
		// 		}
		// 		session.setAttribute("grade",String.valueOf(score));
		// 		session.setAttribute("msg",msg);
		// 		response.sendRedirect("pages/Grade.jsp");		
		// 	}
		// }
	}
}//end addGradeServlet