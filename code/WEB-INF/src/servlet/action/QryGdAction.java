package SystemCoding.control.action;

import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import SystemCoding.control.action.Action;
import SystemCoding.control.action.AddGdAction;
import SystemCoding.model.po.*;
import SystemCoding.model.service.TeacherService;
import SystemCoding.model.service.stringToMD5;

/**
 * @author cg
 * @version 1.0
 * @created 26-12��-2019 11:08:57
 */
public class QryGdAction implements Action {

	public QryGdAction(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param request
	 * @param response
	 */	
	public String execute(HttpServletRequest request, HttpServletResponse response){
		String user_input = request.getParameter("user_input");
		String type = request.getParameter("type");

		String msg = "false";
		
		Grade dg = new Grade();
		TeacherService ts = new TeacherService();
		ArrayList<Grade> grade_list = new ArrayList<Grade>();
		ArrayList<Teacher> tea_list = new ArrayList<Teacher>(); 
		if(type.equals("stu_id")){
			if(user_input.equals("")||user_input==null){
				msg = "false";
			}else{
				dg.setStu_id(Integer.parseInt(user_input));
				grade_list = ts.queryGradeById(dg);
				if(grade_list.size()>0){
					msg = "true";
				}else{
					msg = "false";
				}
			}
			
		}else if(type.equals("grade_name")){
			if(user_input.equals("")||user_input==null){
				msg = "false";
			}else{
				dg.setGrade_name(user_input);
				grade_list = ts.queryGradeByGradeName(dg);
				if(grade_list.size()>0){
					msg = "true";
				}else{
					msg = "false";
				}
			}
			
		}else if(type.equals("queryall")){
			grade_list = ts.queryAllGrade();
			if(grade_list.size()>0){
				msg = "true";
			}else{
				msg = "false";
			}
		}else if(type.equals("queryallTea")){
			tea_list = ts.queryAllTea();
			if(tea_list.size()>0){
				msg = "true2";
			}else{
				msg = "false";
			}
		}
		HttpSession session = request.getSession();
		if(msg.equals("true2")){
			session.setAttribute("grade_list",tea_list);
		}else{
			session.setAttribute("grade_list",grade_list);
		}
		return msg;
	}
}//end QryGdAction