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

/**
 * Servlet Filter implementation class ChartsetFilter
 * @author cheng
 * @version 1.0
 * @created 01-11��-2019 16:21:46
 */
@WebFilter("/*")
public class ChartsetFilter implements Filter {



	public void finalize() throws Throwable {

	}
	/**
	 * Default constructor.
	 */
	public ChartsetFilter(){

	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy(){

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * 
	 * @param request
	 * @param response
	 * @param chain
	 * @exception IOException,ServletException
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	  throws IOException,ServletException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println(req.getRequestURI());
		chain.doFilter(request,response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 * 
	 * @param fConfig
	 * @exception ServletException
	 */
	public void init(FilterConfig fConfig)
	  throws ServletException{

	}
}//end ChartsetFilter