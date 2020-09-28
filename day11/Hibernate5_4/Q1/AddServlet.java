

import java.io.*;

import javax.servlet.RequestDispatcher;
//import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.*;

import mypack.*;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		try{
			PrintWriter pw = response.getWriter();
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			Product p = new Product();
			p.setName(request.getParameter("name"));
			p.setPrice(Integer.parseInt(request.getParameter("price").trim()));
			p.setQty(Integer.parseInt(request.getParameter("qty").trim()));
			session.save(p);
			tx.commit();
			session.close();
			System.out.println("---------added to database------");
			pw.println("Records addded succesfully");
			
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}
		catch(Exception ee) {
			System.out.println("In catch block : " + ee);
		}
	}
}
