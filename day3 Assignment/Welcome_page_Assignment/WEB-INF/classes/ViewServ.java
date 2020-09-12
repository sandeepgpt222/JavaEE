

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html><body>");
		pw.println("<b>In Viewserv</b>"+"<br>");
		HttpSession session = request.getSession(false);
		ArrayList <String> arr = new ArrayList<String>();
		if(session!=null)
		{
			arr = (ArrayList<String>)session.getAttribute("prod");
		}
		int i=0;
		while(i<arr.size())
		{
			pw.println(arr.get(i)+"<br>");
			i++;
		}
		pw.println("</body></html>");
		pw.close();
	}

}
