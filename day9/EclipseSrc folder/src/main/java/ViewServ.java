

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import mypack.*;

/**
 * Servlet implementation class ViewServ
 */
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Transaction transaction = null;
		try {
			//transaction= session.beginTransaction();
			Query <?> query = session.createQuery("Select c.name,c.email,c.address from Register c");
			List <Object[]> mylist = (List <Object[]>) query.list();
			
			//For Displaying contents on console
			/*for(int i=0; i<mylist.size(); i++) {
				Object []str = (Object[]) mylist.get(i);
				for(int j = 0;j<str.length; j++) 
				{
					System.out.print(str[j] + "\t");
				}
				System.out.println();
			}*/
			
			//setting the query result in request attribute
			request.setAttribute("mylist", mylist);
			
			//forwarding request to a jsp page.
			RequestDispatcher rd = request.getRequestDispatcher("ViewRegister.jsp");
			rd.forward(request, response);
			
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}

}