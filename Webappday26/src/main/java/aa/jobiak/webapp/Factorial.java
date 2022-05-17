package aa.jobiak.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Set;

public class Factorial implements Servlet {

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
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int n=5;
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact*=i;
			
		}
		out.println("The factorial of 5 is"+fact);
		
		ArrayList<String>list=new ArrayList<>();
		list.add("Orange");list.add("Green");list.add("Blue");list.add("Red");
		for(String color:list) {
			out.println(color+"::"+color.length());
			
		}
		
		HashMap<String,String>techInventers=new HashMap();
		techInventers.put("Java","James Gosling");
		techInventers.put("C","Dennis Ritchie");
		techInventers.put("Linux","Linus Travold");
	
		out.println(techInventers);
		
		
		
		HashMap<String,String>Inventors=new HashMap();
		Inventors.put("Google","Larry Page");
		Inventors.put("Amazon","jeff Bezos");
	
	
		out.println(Inventors);
		
		
		java.util.Set<String> keys = techInventers.keySet();
		for(String key:keys) {
			out.println(techInventers.get(key)+"length of values->"+techInventers.get(key));
		}

	}
}


