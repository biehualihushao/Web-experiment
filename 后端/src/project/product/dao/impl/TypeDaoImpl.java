package project.product.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.product.dao.TypeDao;
import project.product.db.BaseDao;
import project.product.entity.Product;
import project.product.entity.Type;
import project.product.entity.Userinfo;

public class TypeDaoImpl implements TypeDao {

	@Override
	public Type selectById(int id) {
		// TODO Auto-generated method stub
				String sql = "select * from type where id=? ";
				Type type=null;
				
				BaseDao baseDao=new BaseDao();
				baseDao.open();
				
				
			ResultSet rs=	baseDao.execDQL(sql,id);
				
			
			try {
				
				if(rs.next()) {
					type = new Type(rs.getInt("id"),
							rs.getString("name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				baseDao.close();
				
				return type;
			}

	@Override
	public List<Type> selectAll() {
		// TODO Auto-generated method stub
		List<Type> list=new ArrayList();
		BaseDao basedao=new BaseDao();
		String sql="select* from type";
		basedao.open();
		
		ResultSet rs=basedao.execDQL(sql);
	
		try {
			while(rs.next()) {
				
				
				list.add(new Type(rs.getInt("id"),
						rs.getString("name")));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		basedao.close();
		
		return list;  
	}


}
