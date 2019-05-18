package MavenRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseTesting {
	@Test
	public void databaseconnection() throws SQLException
	{
		System.out.println("Databaseconnection");
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:Mysql://"+host+":"+port+"/QADB", "root", "$udar@512");
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("select * from Employeeinfo where location='cochin'");
		r.next();
		System.out.println(r.getString("id"));
		System.out.println(r.getString("name"));
	}

}
