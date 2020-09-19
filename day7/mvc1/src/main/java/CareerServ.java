

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.*;

/**
 * Servlet implementation class CareerServ
 */
public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String qual = request.getParameter("qual");
		CareerExpert ce = new CareerExpert();
		String advice =  ce.getAdvice(qual);
		
		request.setAttribute("advice", advice);
		
		RequestDispatcher rd = request.getRequestDispatcher("CareerDetails.jsp");
		rd.forward(request, response);
	}

}
