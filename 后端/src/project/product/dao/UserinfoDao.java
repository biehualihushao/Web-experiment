package project.product.dao;

import project.product.entity.Userinfo;

public interface UserinfoDao {

	
	Userinfo SelectByUsercodeAndUserpwd(Userinfo user);
}
