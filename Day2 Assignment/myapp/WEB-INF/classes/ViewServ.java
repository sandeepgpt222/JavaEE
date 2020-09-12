import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ViewServ extends HttpServlet
{
	private Connection con;
	public void init()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			con = DriverManager.getConnection(url,"root","root"); 
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			PreparedStatement pst = con.prepareStatement("select * from users");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				pw.println(rs.getString("uid")+"\t");
				pw.println(rs.getString("name")+"\t");
				pw.println(rs.getString("email")+"\t");
				pw.println(rs.getString("addr")+"\t");
				pw.println("<br>");
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}