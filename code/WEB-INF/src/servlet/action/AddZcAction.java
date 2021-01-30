package SystemCoding.control.action;
import javax.servlet.http.HttpServletResponse;
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
 * @created 26-12��-2019 11:09:01
 */
public class AddZcAction implements Action {

	public AddZcAction(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param request
	 * @param response
	 */
	public String execute(HttpServletRequest request, HttpServletResponse response){
		String tea_id = request.getParameter("tea_id");
		String tea_password = request.getParameter("tea_password");
		

		System.out.println("AddZcAction.action");
		
		// HttpSession session = request.getSession();
		String msg = "false";
	
		Teacher tc = new Teacher();
		TeacherService ts = new TeacherService();
        if(tea_id.equals("")||tea_password.equals("")||(!stringToMD5.isNumeric(tea_id))){
				msg = "false";
			}else{
                tc.setTea_id(Integer.parseInt(tea_id));
                tc.setTea_password(tea_password);
				if(ts.addTea(tc)){
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