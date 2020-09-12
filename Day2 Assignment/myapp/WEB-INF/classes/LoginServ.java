import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServ extends HttpServlet
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
			String uid = request.getParameter("uid");
			String password = request.getParameter("password");
			PreparedStatement pst = con.prepareStatement("Select * from users where uid =? AND password=?");
			pst.setString(1,uid);
			pst.setString(2,password);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("success.html");
				
			}
			else
			{
				response.sendRedirect("fail.html");
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
	