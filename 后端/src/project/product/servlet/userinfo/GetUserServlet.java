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

/**
 * Servlet implementation class GetUserServlet
 */
@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("application/json;charset=utf-8");
//		 response.addHeader("Access-Control-Allow-Origin", "http://127.0.0.1:8848");
//		 response.addHeader("Access-Control-Allow-Credentials","true");
//		 

		 Map<String,Object> map = new HashMap<String, Object>();

		
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("loginUser");
		map.put("isOK",false);
		map.put("msg","not login");
		if(obj != null) {
			map.put("isOK",true);
			map.put("msg","already login");
			map.put("loginUser",(Userinfo)obj);
		}
		
		response.getWriter().write(new Gson().toJson(map));
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
