package com.Taranga.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDataBase dB;
    public void init() {
    	dB=new LoginDataBase();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            String username=request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean lB = new LoginBean();
		   lB.setUsername(username);
		   lB.setPassword(password);
		   try {
			if(dB.valid(lB)) {
				   response.sendRedirect("loginsuccess.jsp");
			   }
			   else {
				   response.sendRedirect("loginfail.jsp");
			   }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
