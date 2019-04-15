import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String a=req.getParameter("t1");
String b=req.getParameter("t2");


try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
	PreparedStatement st =con.prepareStatement("select * from employee where name=? and password=?");
	st.setString(1, a);st.setString(2, b);
	ResultSet rs=st.executeQuery();
	if(rs.next())
	
		res.sendRedirect("1st.html");
	
	else
		res.sendRedirect("srevlet1.html");
	

}
catch(Exception ae)
{
	pw.println("invalid username/password; logon denied");
ae.printStackTrace();		
}




}
catch(Exception ab)
{
	ab.printStackTrace();
	}
}}
