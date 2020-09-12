import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServ extends HttpServlet
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
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String uid = request.getParameter("uid");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String addr = request.getParameter("addr");
			PreparedStatement pst = con.prepareStatement("insert into users values(?,?,?,?,?)");
			pst.setString(1,uid);
			pst.setString(2,password);
			pst.setString(3,name);
			pst.setString(4,email);
			pst.setString(5,addr);
			int k = pst.executeUpdate();
			if(k>0)
			{
				pw.println("Record has been added");
			}
			else	
			{
				pw.println("cannot add");
			}
			pw.println(uid);
			pw.println(password);
			pw.println(name);
			pw.println(email);
			pw.println(addr);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}