import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServ1 extends HttpServlet
{
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("hello");
		String val1 = getServletConfig().getInitParameter("database");
		pw.println(val1);
		String val2 = getServletContext().getInitParameter("driver");
		pw.println("<br>"+val2);
	}
	
	/*public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String value=getServletConfig().getInitParameter("database");
			pw.println(value);
			String value1=getServletContext().getInitParameter("driver");
			pw.println("<br>"+value1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}*/
}