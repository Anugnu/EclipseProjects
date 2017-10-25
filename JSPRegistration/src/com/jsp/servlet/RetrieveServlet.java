package com.jsp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RetrieveServlet
 */
@WebServlet("/RetrieveServlet")
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// (1)load the driver

			connection = DriverManager.getConnection(// (2)get database
														// connection
					"jdbc:mysql://localhost:3306/test", "root", "root");

			String sql = "select id,name,city,zip from vinay ";
			statement = connection.createStatement();// (3)create statement
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			ArrayList<Student> studentsList = new ArrayList<Student>();
			while(resultSet.next()){
				
				Student student = new Student();
				student.setId(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setCity(resultSet.getString(3));
				student.setZip(resultSet.getString(4));
				studentsList.add(student);
				
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("STUDENTS_LIST", studentsList);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (statement != null) {// (5)close connection
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		response.sendRedirect("listofstudents.jsp");
	}
	
}
