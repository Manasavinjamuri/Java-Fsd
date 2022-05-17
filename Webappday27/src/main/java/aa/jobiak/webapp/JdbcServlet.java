package aa.jobiak.webapp;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class JdbcServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=res.getWriter();
		String userName ="root";
		String password ="admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			out.println("Connected to db....");
			
			java.sql.Statement st=con.createStatement();
			String sql="Select * from customer";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getString(4)+"::"+rs.getString(5));
				
			}
			
			
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
	}
	
}


