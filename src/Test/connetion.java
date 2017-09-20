package Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mapper.AuUserMapper;
import com.model.AuUser;
import com.service.AuUserService;
import com.service.AuUserServiceimpl;

import util.MyBatisUtil;

public class connetion{
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	    AuUserService dao=(AuUserService) context.getBean("auUserServiceImpl");
	    Map<String, String> map=new HashMap<String,String>();
	    map.put("logincode", "ÕÅÈý");
	    map.put("password", "lwx1997716");
	    int number=dao.login(map);
	    System.out.println(number);
		//		AuUserServiceimpl serviceimpl=new AuUserServiceimpl();
//		List<AuUser> list=serviceimpl.selectall();
//		System.out.println(list);
		//		SqlSession session=MyBatisUtil.getSqlSession();
//		List<AuUser> list=session.getMapper(AuUserMapper.class).selectall();
//		for (AuUser auUser : list) {
//			System.out.println(auUser.getEmail());
//		}
	}

}
