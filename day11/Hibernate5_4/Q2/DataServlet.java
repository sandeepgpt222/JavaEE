

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import mypack.HibernateUtil;

/**
 * Servlet implementation class DataServlet
 */
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String loc = request.getParameter("loc").trim();
		Query<?> query = session.createQuery("from Dept d where d.loc=:abc");
		query.setParameter("abc",loc);
		List<?> mylist = query.list();
		
		request.setAttribute("mylist", mylist);
		
		RequestDispatcher rd = request.getRequestDispatcher("Data.jsp");
		rd.forward(request, response);
		
	}

}
