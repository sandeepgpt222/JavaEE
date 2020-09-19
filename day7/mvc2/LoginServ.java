

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.*;
/**
 * Servlet implementation class LoginServ
 */
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid = request.getParameter("uid");
		String password = request.getParameter("password");
		LoginBean lg = new LoginBean();
		Boolean b = lg.validate(uid, password);
		RequestDispatcher rd;
		if(b)
		{
			rd =  request.getRequestDispatcher("Success.jsp");
		}
		else {
			rd =  request.getRequestDispatcher("Fail.jsp");
		}
		request.setAttribute("uid", uid);
		rd.forward(request, response);
		
	}

}
