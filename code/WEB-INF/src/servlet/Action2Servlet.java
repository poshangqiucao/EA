package SystemCoding.control.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import SystemCoding.control.action.Action2MappingManager;
import javax.servlet.ServletException;
import SystemCoding.control.action.Result;
import java.lang.reflect.Method;
import SystemCoding.control.action.Action2Mapping;
/**
 * @author cheng
 * @version 1.0
 * @created 29-11��-2019 19:34:02
 */
// @WebServlet("/Action2Servlet")
public class Action2Servlet extends HttpServlet{

	private Action2MappingManager actionMappingManager;

	public Action2Servlet(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		try {
	
		    String uri = request.getRequestURI();
		    String actionName=uri.substring(uri.lastIndexOf("/")+1, uri.indexOf(".action"));
	
		    Action2Mapping actionMapping = actionMappingManager.getAction2Mapping(actionName);
		    String className = actionMapping.getClassName();
		    String method = actionMapping.getMethod();
	
		    Class<?> clazz = Class.forName(className);
		    Object obj = clazz.newInstance(); 
		    Method m = clazz.getDeclaredMethod(method, HttpServletRequest.class,HttpServletResponse.class );
	
		    String returnFlag =  (String) m.invoke(obj, request, response);
		    Result result = actionMapping.getResults().get(returnFlag);
		    String type = result.getType();
		    String page = result.getPage();
	
		    if ("redirect".equals(type)) {
		        response.sendRedirect(request.getContextPath() + page);
		    } else {
		        request.getRequestDispatcher(page).forward(request, response);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		doGet(request, response);
	}

    public void init() throws ServletException{
        actionMappingManager = new Action2MappingManager();
    }
	
}//end LoginServlet

