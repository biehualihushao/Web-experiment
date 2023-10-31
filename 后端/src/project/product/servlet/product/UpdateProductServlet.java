package project.product.servlet.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import project.product.dao.ProductDao;
import project.product.dao.impl.ProductDaoImpl;
import project.product.entity.Product;
import project.product.service.ProductService;
import project.product.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	
	private ProductService productService = new ProductServiceImpl();
	private Gson gson = new Gson();
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	 		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
	        Map<String, Object> map = new HashMap<>();
	        map.put("isOK",productService.updateProduct(gson.fromJson(br.readLine(), Product.class)));


	        response.getWriter().write(new Gson().toJson(map));
	}

}
