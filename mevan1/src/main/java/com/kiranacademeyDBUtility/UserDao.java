package com.kiranacademeyDBUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kiranacademeystudent.User;

public class UserDao {

	public static ArrayList<User> fatchUser() throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
		String sql = "select * from user";
		Statement statment = connection.createStatement();
		ResultSet resultSet = statment.executeQuery(sql);
		ArrayList<User> aluser = new ArrayList<User>();
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String city = resultSet.getString(3);
			String state = resultSet.getString(4);
			User user = new User(id, name, city, state);
			aluser.add(user);

			System.out.println("ID-->" + id);
			System.out.println("Name-->" + name);
			System.out.println("City-->" + city);
			System.out.println("State-->" + state);
		}

		return aluser;
	}

}
