package project.product.servlet.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import project.product.entity.Product;
import project.product.service.ProductService;
import project.product.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class AddServlet
 */

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	private ProductService productService = new ProductServiceImpl();
	private Gson gson = new Gson();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
		
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("isOK",productService.add(gson.fromJson(br.readLine(), Product.class)));
		
	 response.getWriter().write(new Gson().toJson(map));
		
	}

}
