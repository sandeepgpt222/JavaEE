

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServ
 */
public class MainServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= response.getWriter();
		pw.println("in mainserv");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		RequestDispatcher rd;
		if(name.equalsIgnoreCase("scott") && pass.equals("tiger")) {
			 rd= request.getRequestDispatcher("Welcome.jsp");
			 rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
