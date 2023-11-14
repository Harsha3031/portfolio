package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.me.Myprojectuser;

public class MyprojectDAO {
	
	
	private Connection connection;
	private PreparedStatement prepareStatement;
	
	
	public MyprojectDAO() {
		String url="jdbc:mysql://localhost:3306/tapacedemy";
		String user="root";
		String pwd="Harsha@7259";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			connection = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insert(Myprojectuser m) {

		String query="insert into MYPROJECT VALUES(?,?,?,?)";
		
		
		try {
			prepareStatement = connection.prepareStatement(query);
			
		prepareStatement.setString(1, m.getName());
		prepareStatement .setString(2, m.getEmail());
		prepareStatement .setString(3, m.getSub());
		prepareStatement .setString(4, m.getMsg());
		int i = prepareStatement.executeUpdate();
		
		
		return i;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
