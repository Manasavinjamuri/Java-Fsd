package aa.jobiak.webapp;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet implements Servlet {

	

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
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		try {
			System.out.println("entered init()");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Fresher\\Desktop\\Hello.txt");
			fos.write("This is added in init()to demonstrate the timing of init method".getBytes()) ;
			fos.close();
			System.out.println("exiting init()...");
		}catch(IOException e) {
			e.printStackTrace();
		}
	

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		res.getWriter().println("this is from service()......");

	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			System.out.println("entered destroy()....");
			FileOutputStream fos=new FileOutputStream("Hello.txt",true);
			fos.write("This is added in destroy()to demonstrate the timing of  destroy method".getBytes()) ;
			fos.close();
			System.out.println("exiting destroy()...");
			Thread.currentThread().join();
		}catch(IOException | InterruptedException e) {
			e.printStackTrace();
		} 
		}

	}
	

