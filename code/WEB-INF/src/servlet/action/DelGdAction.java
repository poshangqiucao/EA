package SystemCoding.control.action;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import SystemCoding.control.action.Action;
import SystemCoding.control.action.AddGdAction;
import SystemCoding.model.po.Grade;
import SystemCoding.model.service.TeacherService;
import SystemCoding.model.service.stringToMD5;

/**
 * @author cg
 * @version 1.0
 * @created 26-12��-2019 11:08:56
 */
public class DelGdAction implements Action {

	public DelGdAction(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param request
	 * @param response
	 */
	public String execute(HttpServletRequest request, HttpServletResponse response){
		String stu_id = request.getParameter("stu_id");
		String grade_name = request.getParameter("grade_name");
		String msg = "false";
		
		Grade dg = new Grade();
		TeacherService ts = new TeacherService();
		
		if(stu_id.equals("")||grade_name.equals("")||(!stringToMD5.isNumeric(stu_id))){
			msg = "false";
		}else{
			dg.setGrade_name(grade_name);
			dg.setStu_id(Integer.parseInt(stu_id));
			if(ts.delGrade(dg)){
				msg = "true";
			}else{
				msg = "false";
			}
		}
		return msg;
	}
}//end DelGdAction