

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CartServ")
public class CartServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession();
		String[] arr = request.getParameterValues("vehicle");
		pw.println("session created and values saved");
		for(int i=0;i<arr.length;i++)
		{
			pw.println(arr[i]+"<br>");
		}
		
		ArrayList <String> arr1 = new ArrayList<String>();
		for(int i = 0;i<arr.length;i++)
		{
			arr1.add(arr[i]);
		}
		session.setAttribute("prod", arr1);
		pw.close();
	}

}
