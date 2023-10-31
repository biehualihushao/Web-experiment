import java.util.List;

import project.product.dao.ProductDao;
import project.product.dao.TypeDao;
import project.product.dao.UserinfoDao;
import project.product.dao.impl.ProductDaoImpl;
import project.product.dao.impl.TypeDaoImpl;
import project.product.dao.impl.UserinfoDaoImpl;
import project.product.entity.Product;
import project.product.entity.Type;
import project.product.entity.Userinfo;
import project.product.service.ProductService;
import project.product.service.impl.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	UserinfoDao dao = new UserinfoDaoImpl();
//	Userinfo user = dao.SelectByUsercodeAndUserpwd(new Userinfo(null,"b","2",null));
//	System.out.println(user);
//		 
//		ProductDao dao =(ProductDao) new ProductDaoImpl();

//		for(Product p:list) {
//			System.out.println(p);
//		}
		TypeDao dao=(TypeDao) new TypeDaoImpl();
		List<Type> list=dao.selectAll();
	System.out.println(list);
//	}
//		
//		ProductService pro= new ProductServiceImpl();
//		List<Product> list=pro.getAllWithProduct();
//		System.out.println(list);
////		
		
}
}
