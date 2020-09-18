

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.println("welcome <br>");
		RequestDispatcher rd;
		String str = request.getParameter("module");
		switch(str)
		{
		case "java": rd= request.getRequestDispatcher("j2se.jsp");
		rd.forward(request, response);
		break;
		case "c++": rd= request.getRequestDispatcher("cplusplus.jsp");
		rd.forward(request, response);
		break;
		case "oracle": rd= request.getRequestDispatcher("ora.jsp");
		rd.forward(request, response);
		break;
		default: pw.println("invalid choice");
		}
	}

}
