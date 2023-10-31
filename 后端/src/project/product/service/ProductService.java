package project.product.service;

import java.util.List;

import project.product.entity.Product;

public interface ProductService {

	
   List<Product>getAllWithProduct();
   boolean add(Product product);
   boolean  remove (int pid);
   boolean  updateProduct(Product product);
   List<Product>  searchservlet(String searchText);
   
}
