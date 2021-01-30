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
 * @created 26-12��-2019 11:09:01
 */
public class AddGdAction implements Action {

	public AddGdAction(){

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
		String grade_normal = request.getParameter("grade_normal");
		String grade_middle = request.getParameter("grade_middle");
		String grade_end = request.getParameter("grade_end");

		System.out.println("AddGdAction.action");
		
		// HttpSession session = request.getSession();
		String msg = "false";
	
		Grade dg = new Grade();
		TeacherService ts = new TeacherService();
		if(stu_id.equals("")||grade_name.equals("")||(!stringToMD5.isNumeric(stu_id))){
				msg = "false";
			}else{
				dg.setGrade_normal(Double.parseDouble(grade_normal));
				dg.setGrade_middle(Double.parseDouble(grade_middle));
				dg.setGrade_end(Double.parseDouble(grade_end));
				dg.setGrade_name(grade_name);
				dg.setStu_id(Integer.parseInt(stu_id));
				if(ts.addGrade(dg)){
					msg = "true";
				}else{
					msg = "false";
				}
			}
		HttpSession session = request.getSession();
		session.setAttribute("msg",msg);
		return msg;
	}
}//end AddGdAction