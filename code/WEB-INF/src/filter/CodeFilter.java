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


/**
 * @author cg
 * @version 1.0
 * @created 20-12��-2019 10:41:50
 */
@WebFilter("/CodeServlet")
public class CodeFilter implements Filter {

	public CodeFilter(){

	}

	public void finalize() throws Throwable {

	}
	public void destroy(){

	}

	/**
	 * 
	 * @param o0
	 * @param o1
	 * @param o2
	 */
	public void doFilter(ServletRequest o0, ServletResponse o1, FilterChain o2) throws IOException,ServletException{
		System.out.println("CodeFilter!");
		HttpServletResponse response = (HttpServletResponse) o1;
		response.setContentType("image/png");
		o2.doFilter(o0,o1);


	}

	/**
	 * 
	 * @param o0
	 */
	public void init(FilterConfig o0){

	}
}//end CodeFilter