<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%!
private ArrayList<Customer> getcustomerIds()
{
  String userName = "root";
  String password = "admin";
  String url = "jdbc:mysql://localhost:3306/world";
  Connection con=null;
  ArrayList<customer> customerList=new ArrayList<>();
  try {
     Class.forName("com.mysql.cj.jdbc.Driver");
     con = DriverManager.getConnection(url,userName, password);
     Statement st=con.createStatement();
     String sql="select *from customer";
     ResultSet rs=st.executeQuery(sql);
 while(rs.next())
 {
	 customer=new customer(rs.getString(1),rs.getString(2),rs.getDouble(3));
	 customerList.add(c);
 } 
 }catch (Exception e) { 
   e.printStackTrace(); 
   }
  finally {
   if(con!=null){
    try{
     con.close();
   }catch (Exception e) { 
	      e.printStackTrace(); 
	      }
	   }
	  }
	  return customerList
			
}
%>
<hr/>
ArrayList<customer> itemsList=null;
 itemsList=getcustomerIds();
	
 for(int i=0;i<itemsList.size();i++){
  out.println("<a href='shopping.jsp?item="+itemsList.get(i).getProductId()+"'>Add Items :"+itemsList.get(i).getProductId()+"</a></br>");
 } > itemsList=null;
 itemsList=getcustomerIds();
	
 
</body>
</html>