package ccnu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBManager {	  
	public static void main(String[] args)  {  
		PreparedStatement psm = null;  
		Connection ct = null;  
		ResultSet rs = null;  
		try {  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			ct = DriverManager.getConnection("jdbc:sqlserver://218.192.172.69:1433;DatabaseName=Test", "yeshiwu", "ye2016@gz");  
			psm = ct.prepareStatement("select * from people_tb");  
			rs = psm.executeQuery();  
			while (rs.next())  
			{  
				System.out.println(rs.getString(1) + " " + rs.getString(2));  
			}  
		} catch (Exception e)  {  
			e.printStackTrace();  
		} finally  {  
			try  {  
				if (rs != null)  
					rs.close();  
				if (psm != null)  
					psm.close();  
				if (ct != null)  
					ct.close();  
			} catch (Exception e)  {  
				e.printStackTrace();  
			}  
		}  
	}  

}
