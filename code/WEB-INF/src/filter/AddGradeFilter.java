package SystemCoding.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.FilterConfig;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @author cg
 * @version 1.0
 * @created 19-12��-2019 19:16:37
 */
// @WebFilter("/pages/addGrade.jsp")
public class AddGradeFilter implements Filter {

	public AddGradeFilter(){

	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public void destroy(){

	}

	/**
	 * 
	 * @param o0
	 * @param o1
	 * @param o2    o2
	 */
	public void doFilter(ServletRequest o0, ServletResponse o1, FilterChain o2)
	  throws IOException,ServletException{
		HttpServletRequest request = (HttpServletRequest) o0;
		HttpServletResponse response = (HttpServletResponse) o1;
		HttpSession session = request.getSession();
		String isLogin = (String)session.getAttribute("isLogin");
		if(isLogin!=null){
			if(isLogin.equals("true")){
				o2.doFilter(o0,o1);
			}else{
				response.sendRedirect("login.jsp");
			}
		}else{
			response.sendRedirect("login.jsp");
		}
		
	}

	/**
	 * 
	 * @param o0    o0
	 */
	public void init(FilterConfig o0){

	}
}//end AddGradeFilter