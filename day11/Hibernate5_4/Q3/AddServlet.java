

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.*;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Student s1 = new Student();
			s1.setName(request.getParameter("name").trim());
			s1.setAddress(request.getParameter("address").trim());
			//s1.setRollno(Integer.parseInt(request.getParameter("name").trim()));
			
			String str1 = request.getParameter("impl");
			
			if(str1.equalsIgnoreCase("Database")) {
			StudentDAO studentdatasave = new StudentDAODataImpl();
			studentdatasave.addStudent(s1);
			}
			
			else {
			StudentDAO studentfilesave = new StudentDAOFileImpl();
			studentfilesave.addStudent(s1);
			}
			
			PrintWriter pw = response.getWriter();
			pw.println("Done adding");
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}

}
