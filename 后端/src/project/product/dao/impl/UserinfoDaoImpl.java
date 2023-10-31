package project.product.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import project.product.dao.UserinfoDao;
import project.product.db.BaseDao;
import project.product.entity.Userinfo;

public class UserinfoDaoImpl implements UserinfoDao{

	
	
	@Override
	public Userinfo SelectByUsercodeAndUserpwd(Userinfo user) {
		// TODO Auto-generated method stub
		String sql = "select * from userinfo where usercode=? and userpwd=?";
		Userinfo getUser = null;
		
		BaseDao baseDao=new BaseDao();
		baseDao.open();
		
		
	ResultSet rs=	baseDao.execDQL(sql, user.getUsercode(),user.getUserpwd());
		
	
	try {
		//√‹¬Î“˛≤ÿ¡À 
		if(rs.next()) {
			getUser = new Userinfo(rs.getInt("userid"),
					user.getUsercode(),"******",
					rs.getString("nickname"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		baseDao.close();
		
		return getUser;
	}

	
	
	
}
