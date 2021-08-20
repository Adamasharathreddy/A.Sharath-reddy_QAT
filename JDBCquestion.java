package connectsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCquestion {


	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "SYSTEM";
		String password = "abc";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connect = DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement s1 = connect.createStatement();
		String updateQuery = "UPDATE EMPLO SET NAME = 'KOHLI' WHERE ID = 3";
		s1.executeUpdate(updateQuery);
		ResultSet result = s1.executeQuery("SELECT*FROM EMPLO");
		System.out.println("query execution" + result);
		
        while(result.next()){
			
			System.out.println(result.getString("ID") +":"+ result.getString("NAME"));
			
		}
		
			connect.close();

	}


	}


