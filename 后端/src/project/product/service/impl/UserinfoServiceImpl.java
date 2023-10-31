package project.product.service.impl;



import project.product.dao.UserinfoDao;
import project.product.dao.impl.UserinfoDaoImpl;
import project.product.entity.Userinfo;
import project.product.service.UserinfoService;

public class UserinfoServiceImpl  implements UserinfoService{

	private UserinfoDao userinfoDao=new UserinfoDaoImpl();
	
	@Override
	public Userinfo login(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfoDao.SelectByUsercodeAndUserpwd(userinfo);
	}

}
