package SystemCoding.control.action;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.lang.Object;
import javax.servlet.ServletException;
import java.io.IOException;
/**
 * @author cg
 * @version 1.0
 * @created 26-12��-2019 20:27:30
 */
public interface Action2 {

	/**
	 * 
	 * @param request
	 * @param response
	 */
	public Object execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException;

}