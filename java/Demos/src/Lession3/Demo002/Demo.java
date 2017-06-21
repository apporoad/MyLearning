package Lession3.Demo002;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Lession3.UserMapping.UserDao;

public class Demo {

	public static void main(String[] args) {
		String source = "conf.xml";
	    InputStream is =	Demo.class.getClassLoader().getResourceAsStream(source);
	    SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
	    SqlSession  session = fac.openSession();
	    
	    String statement = "Lession3.UserMapping.UserDao.getUser";
	    
	    //select
	    User user = session.selectOne(statement, 2);
	    if(user !=null)
	    {
	    	System.out.println(user.getName() + " " + user.getAge());
	    }
	    else
	    {
	    	System.out.println("无数据");
	    }
	    
	   
	    UserDao mapper =  session.getMapper(UserDao.class);
	    mapper.deleteMany();
	    // insert
	    
	    for(int i=10;i<20;i++)
	    {
		    User u = new User();
		    u.setAge(i);
		    u.setName("zhufeng" +i);
		    mapper.save(u);
	    }
	    
	    // 删除
	    mapper.delete(13);
	    
	    session.commit();
	    
	    //update
	    User up = new User();
	    up.setAge(15);
	    up.setName("aaaaaaaaaaaaaaaaaaaaa");
	    mapper.update(up);
	    
	    
	    session.commit();
	    session.close();
	}

}
