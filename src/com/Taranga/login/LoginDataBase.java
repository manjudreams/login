package com.Taranga.login;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDataBase {
	public boolean valid(LoginBean lB) throws ClassNotFoundException, SQLException {
		boolean status = false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database2", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from  login where username=? and password=?");
		ps.setString(1, lB.getUsername());
		ps.setString(2, lB.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
        System.out.println(lB.getUsername()+" "+lB.getPassword()+" "+status);
		return status;

	}

}
