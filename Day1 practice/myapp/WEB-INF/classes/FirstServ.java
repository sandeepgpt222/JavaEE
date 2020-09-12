import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to First Servlet");
			pw.println("<br>"); // generating html dynamically
			pw.println("All the very best");
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}