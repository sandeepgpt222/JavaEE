

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.*;

/**
 * Servlet implementation class RegisterServ
 */
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Register p1 = new Register();
		p1.setAddress(request.getParameter("address"));
		p1.setEmail(request.getParameter("email"));
		p1.setLogin(request.getParameter("login"));
		p1.setName(request.getParameter("name"));
		p1.setPassword(request.getParameter("password"));
		
		session.save(p1);
		transaction.commit();
		session.close();
		System.out.println("...............Completed successfully............");
		PrintWriter pw = response.getWriter();
		pw.println("details recorded successfully");
	}

}
