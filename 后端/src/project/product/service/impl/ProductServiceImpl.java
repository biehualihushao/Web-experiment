package project.product.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project.product.dao.ProductDao;
import project.product.dao.TypeDao;
import project.product.dao.impl.ProductDaoImpl;
import project.product.dao.impl.TypeDaoImpl;
import project.product.entity.Product;
import project.product.service.ProductService;

public class ProductServiceImpl  implements ProductService {

	
	  private  ProductDao productdao =new ProductDaoImpl();
	  private  TypeDao typedao= new TypeDaoImpl();
	@Override
	//获取所有的商品
	public List<Product> getAllWithProduct() {
		// TODO Auto-generated method stub
				List<Product> allist=new ArrayList();
				allist=productdao.selectAll();
				
				
				return allist;
			}
	//����
	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
	   int count= 	productdao.insert(product);
	   if(count>0) {
		   return true;
	   }
		return false;
	}
	//ɾ��
	@Override
	public boolean remove(int pid) {
		// TODO Auto-generated method stub
		
		int count= 	productdao.delete(pid);
		   if(count>0) {
			   return true;
		   }
			return false;
		
	}
	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		int count=productdao.updateProduct(product);
		
		if(count>0) {
			   return true;
		   }
		
		return false;
	}
	//查询服务
	@Override
	public List<Product> searchservlet(String searchText) {
		List<Product> allist=new ArrayList();
		allist=productdao.searchProduct(searchText);
	
		
		return allist;
	}
	

	}
	
	
	


