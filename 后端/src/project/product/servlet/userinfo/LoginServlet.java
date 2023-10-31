package project.product.servlet.userinfo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import project.product.entity.Userinfo;
import project.product.service.UserinfoService;
import project.product.service.impl.UserinfoServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	 private   UserinfoService userinfoService=new UserinfoServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("application/json;charset=utf-8");
//	  response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:8848");
	  
	  
	   response.setHeader("Access-Control-Allow-Credentials","true");
		  String usercode= request.getParameter("usercode");
		     String userpwd=request.getParameter("userpwd");
		    
		     Userinfo user= userinfoService.login(new Userinfo(null,usercode,userpwd,null));
		     Map<String,Object> map = new HashMap<String, Object>();
				
				map.put("isOK",false);
				
				if(user!=null) {
					map.put("isOK",true);
					HttpSession session = request.getSession();
					session.setAttribute("loginUser", user);
				}
				
				response.getWriter().write(new Gson().toJson(map));
				
					
				
			}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
		
	}

	


