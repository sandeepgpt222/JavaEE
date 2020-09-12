import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class Trial3 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		request.setAttribute("name","sandeep");
		PrintWriter pw = response.getWriter();
		pw.println("addedd successfully");

		RequestDispatcher rd = request.getRequestDispatcher("Trial4");
		rd.forward(request,response);
	}
}