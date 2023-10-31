package project.product.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.product.dao.ProductDao;
import project.product.db.BaseDao;
import project.product.entity.Product;

public class ProductDaoImpl implements ProductDao{

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList();
		BaseDao basedao=new BaseDao();
		String sql="select* from product";
		basedao.open();
		
		ResultSet rs=basedao.execDQL(sql);
	
		try {
			while(rs.next()) {
				
				
				list.add(new Product(rs.getInt("pid"),
						rs.getString("name"),
						rs.getString("picture"),
						rs.getDouble("price"),
						rs.getString("description")));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		basedao.close();
		
		return list;
	}
//返回根据pid选择的商品
	public List<Product> selectByPid(int pid) {
String sql = "select * from product where pid=?";
		
		List<Product> list = new ArrayList();
		
		BaseDao baseDao = new BaseDao();
		
		baseDao.open();
		
		
		ResultSet rs = baseDao.execDQL(sql,pid);
		
			
		try {
			while(rs.next()) {
				
				list.add(new Product(rs.getInt("pid"),
						rs.getString("name"),
						rs.getString("picture"),
						rs.getDouble("price"),
						rs.getString("description")));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		baseDao.close();
		
		return list;
	}
//插入
	@Override
	public int insert(Product product) {
		System.out .print(product.toString());
		// TODO Auto-generated method stub
String sql = "insert into product values(DEFAULT,?,?,?,?)";
		
		int count = -1;
		
		BaseDao baseDao = new BaseDao();
		
		baseDao.open();
				
		count =  baseDao.execDMl(sql,product.getPname(),product.getPrice(),product.getDescription(),product.getPicture());
		
		baseDao.close();
		
		return count;
	}
		
		
//删除

	@Override
	public int delete(int pid) {
		// TODO Auto-generated method stub
    String sql = "delete from product where pid=?";
		
		int count = -1;
		
		BaseDao baseDao = new BaseDao();
		
		baseDao.open();
				
		count = baseDao.execDMl(sql,pid);
		
		baseDao.close();
		
		return count;
		
	}
//更新
	@Override
	public int updateProduct(Product product) {
		 String sql = "update product set name=?,price=?,description=?,picture=? where pid=?";
		
		int count = -1;
		
		BaseDao baseDao = new BaseDao();
		
		baseDao.open();
				
		count = baseDao.execDMl(sql,product.getPname(),product.getPrice(),product.getDescription(),product.getPicture(),product.getPid());
		
		baseDao.close();
		
		return count;
	}
//查询
	@Override
	public List<Product> searchProduct(String searchText) {
        String sql = "select * from product where name=?";
				
          List<Product> list = new ArrayList();

            BaseDao baseDao = new BaseDao();

           baseDao.open();
         ResultSet rs = baseDao.execDQL(sql,searchText);
	
         try {
	      while(rs.next()) {
		
	      	list.add(new Product(rs.getInt("pid"),
				rs.getString("name"),
				rs.getString("picture"),
				rs.getDouble("price"),
				rs.getString("description")));
		
		
	     }
      } catch (SQLException e) {
	  // TODO Auto-generated catch block
	e.printStackTrace();
      }
        baseDao.close();

             return list;
	}
	}

	
	
	

