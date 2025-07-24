package sample;
import java.sql.*;
public class Mysqlconnection {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/cricket";
		String user="root";
				String pass="sachi25";
				try {
			Class.forName("com.mysql.cj.jdbc.Driver");
					 Connection con=DriverManager.getConnection(url,user,pass);
					System.out.println("connected successfully");
					ResultSet rs = con.createStatement().executeQuery("SELECT * FROM t20 LIMIT 15");
					while(rs.next()) {
						System.out.println(rs.getString("Player")+ "\t"+ rs.getInt("Runs"));
					}
			          
					con.close();
				}
catch (Exception e) {
	System.out.println("connection failed:"+ e.getMessage());
}}
	}

