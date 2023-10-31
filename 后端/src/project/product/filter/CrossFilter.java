package project.product.filter;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CrossFilter
 */
@WebFilter("/*")
public class CrossFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CrossFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
          // System.out.println("过滤器");
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.addHeader("Access-Control-Allow-Origin",request.getHeader("Origin")); 
		

		response.setHeader("Access-Control-Allow-Credentials", "true");
		//便于前端可以给后端返回json
		response.addHeader("Access-Control-Allow-Headers", 
				"Accept,"
				+ "Origin,"
				+ "No-Cache,"
				+ "X-Requested-With,"
				+ "If-Modified-Since,"
				+ "Pragma,"
				+ "Last-Modified,"
				+ "Cache-Control,"
				+ "Expires,"
				+ "Content-Type,"
				+ "X-E4M-With");
		// pass the request along the filter chain
		chain.doFilter(req, res);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
