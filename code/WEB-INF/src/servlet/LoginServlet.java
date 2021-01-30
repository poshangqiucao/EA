import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import SystemCoding.model.service.TeacherService;
import SystemCoding.model.service.stringToMD5;
import SystemCoding.model.po.Teacher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
/**
 * @author cheng
 * @version 1.0
 * @created 29-11��-2019 19:34:02
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	public LoginServlet(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		doPost(request, response);
	}

	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String tea_id = request.getParameter("tea_id");
		String tea_password = request.getParameter("tea_password");
		String input_code = request.getParameter("code"); 
		HttpSession session = request.getSession();
		System.out.println((String)session.getAttribute("code"));
		String code = (String)session.getAttribute("code");
		// input_code.toLowerCase().equals(code.toLowerCase())
		if(true){
			if(tea_id.equals("")||tea_password.equals("")||(!stringToMD5.isNumeric(tea_id))){
				response.sendRedirect("pages/login.jsp");
			}else{
				Teacher tea = new Teacher();
				tea.setTea_id(Integer.parseInt(tea_id));
				tea.setTea_password(tea_password);
				TeacherService ts = new TeacherService();
				if(ts.login(tea)){
					session.setAttribute("isLogin","true");
					session.setAttribute("tea_id",tea_id);
					response.sendRedirect("pages/tea_main.jsp");
				}else{
					response.sendRedirect("pages/login.jsp");
				}
			}
		}else{
			response.sendRedirect("pages/login.jsp");
		}
		
	}

	
}//end LoginServlet

