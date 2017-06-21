package Lession3.Demo001;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		
		Statement stt = null;
		PreparedStatement pstat = null;
		ResultSet rs =null;
		Connection conn =null;
		try
		{
			//获取当前目录
			File directory = new File("");//设定为当前文件夹   
			String path= directory.getAbsolutePath() +"/test.db";
			//获取数据库连接
			conn =  DriverManager.getConnection("jdbc:sqlite:" + path);
			
			//自动创建测试表 t_test
			pstat = conn.prepareStatement("SELECT name FROM sqlite_master  where type='table' and name =? ");
			pstat.setString(1, "t_test");
			rs = pstat.executeQuery();

			int rowCount = 0;    
			while(rs.next())    
			{    
			    rowCount++;    
			}  
			if(rowCount ==0)
			{
				stt = conn.createStatement();
				stt.executeUpdate("create table t_test(name varchar(50), age int);");
				stt.close();
			}
			pstat.close();
			
			//新增一批
			pstat = conn.prepareStatement("insert into t_test(name,age) values(?,?)");
			for(int i =0 ;i < 20;i++)
			{
				pstat.setString(1, "lxy"+ (i+1));
				pstat.setInt(2, 10 +i);
				pstat.addBatch();
			}
			pstat.executeBatch();
			pstat.close();
			
			//改一批
			stt = conn.createStatement();
			stt.executeUpdate("update t_test set name='lilei' where age >20");
			
			//查一批
			rs = stt.executeQuery("select * from t_test");
			while(rs.next())
			{
				System.out.println("name:" + rs.getString(1) + "   age:" + rs.getInt("age"));
			}
			rs.close();
			
			//删除
			stt.executeUpdate("delete from t_test");
			stt.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally {
			if(rs!=null)
				rs.close();
			if(stt!=null)
				stt.close();
			if(pstat!=null)
				pstat.close();
			if(conn !=null)
				conn.close();
		}
		
	}
}
