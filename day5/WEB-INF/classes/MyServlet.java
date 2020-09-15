import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		List<String> mylist = new ArrayList<String>();
		mylist.add("Sanket");
		mylist.add("Sandeep");
		mylist.add("Swapnil");
		mylist.add("Pratik");
		mylist.add("Venkatesh");
		mylist.add("Surabhi");
		HttpSession session = request.getSession();
		session.setAttribute("group16",mylist);
		PrintWriter pw = response.getWriter();
		pw.println(mylist);
		pw.println("<br>NOw session<br><br>");
		pw.println(session.getAttribute("group16"));
	}
}