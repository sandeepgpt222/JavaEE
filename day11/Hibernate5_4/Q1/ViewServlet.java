

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;
import org.hibernate.query.Query;

import mypack.HibernateUtil;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Transaction tx = session.beginTransaction();
		Query<?> query = session.createQuery("from Product");
		List<?> mylist = query.list();
		
		request.setAttribute("mylist", mylist);
		
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
	}

}
