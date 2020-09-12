import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import mypack.*;
public class FourthServ extends HttpServlet
{
	private Connection con;
	public void init()
	{
		try{
		con = SingletonCon.getCon();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.println("Using Properties"+"<br>");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from dept");
			while(rs.next())
			{
				pw.println(rs.getInt(1)+"\t");
				pw.println(rs.getString(2)+"\t");
				pw.println(rs.getString(3)+"<br>");
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}