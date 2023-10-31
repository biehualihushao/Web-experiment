package project.product.service.impl;

import java.util.List;

import project.product.dao.ProductDao;
import project.product.dao.TypeDao;
import project.product.dao.impl.ProductDaoImpl;
import project.product.dao.impl.TypeDaoImpl;
import project.product.entity.Type;
import project.product.service.TypeService;

public class TypeServiceImpl implements TypeService{

	private ProductDao productDao = new ProductDaoImpl();
	private TypeDao typeDao = new TypeDaoImpl();
	
	@Override
	public List<Type> getAll() {
		// TODO Auto-generated method stub
		return typeDao.selectAll();
	}

}
