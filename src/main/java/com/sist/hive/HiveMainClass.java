package com.sist.hive;

import java.sql.*;

public class HiveMainClass {

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.hive.jdbc.HiveDriver");
			String url="jdbc:hive2://211.238.142.98:10000/default";
			Connection conn=DriverManager.getConnection(url, "hive", "hive");
			Statement stmt=conn.createStatement();
			String sql="Select * from dept";
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
