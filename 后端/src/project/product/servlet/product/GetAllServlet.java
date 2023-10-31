package project.product.servlet.product;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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
 * Servlet implementation class GetAllServlet
 */
@WebServlet("/GetAllProduct")
public class GetAllServlet extends HttpServlet {
	
	private ProductService productService = new ProductServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Product> list = productService.getAllWithProduct();
		
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("list",list);
		
		response.getWriter().write(new Gson().toJson(map));
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
