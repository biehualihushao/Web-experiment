package project.product.servlet.type;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import project.product.service.TypeService;
import project.product.service.impl.TypeServiceImpl;

/**
 * Servlet implementation class GetAllServleti
 */
@WebServlet("/GetAllServleti")
public class GetAllServleti extends HttpServlet {
	
	private TypeService typeService = new TypeServiceImpl();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
    Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("list",typeService.getAll());
		
		response.getWriter().write(new Gson().toJson(map));
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
