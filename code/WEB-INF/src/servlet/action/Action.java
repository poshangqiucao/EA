package SystemCoding.control.action;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author cg
 * @version 1.0
 * @created 26-12��-2019 11:08:56
 */
public interface Action {

	/**
	 * 
	 * @param request
	 * @param response
	 */
	public String execute(HttpServletRequest request, HttpServletResponse response);

}