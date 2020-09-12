import java.io.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConPoolServ extends HttpServlet
{
	private Connection con;
	private DataSource ds;
	public void init()
	{
		try
		{
		Context envContext  = new InitialContext();
			ds = (DataSource) envContext.lookup("java:/comp/env/jdbc/mypool");
		}
		catch(Exception ee)
		{
			System.out.println("In init\t"+ee);
		}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			PrintWriter out=response.getWriter();
			out.println("With Connection Pool");
			con=ds.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from dept");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				out.println(rs.getInt(1)+"\t");
				out.println(rs.getString(2)+"\t");		
				out.println(rs.getString(3));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println("In Service\t"+ex);
		}
	}
	
}