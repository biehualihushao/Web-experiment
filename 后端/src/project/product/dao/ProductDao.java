package project.product.dao;

import java.util.List;

import project.product.entity.Product;
import project.product.entity.Type;

public interface ProductDao {
   List<Product> selectAll();
   List<Product> selectByPid(int pid);
   int insert(Product product);
   int delete(int pid);
   int  updateProduct(Product product);
   List<Product> searchProduct(String searchText);
}
