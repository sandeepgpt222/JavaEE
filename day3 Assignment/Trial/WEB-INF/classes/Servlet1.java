

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	private Connection con;
	
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			con = DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		try {
			ArrayList<String> arr = new ArrayList<String>();
			PreparedStatement pst = con.prepareStatement("SELECT loc FROM dept");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				arr.add(rs.getString(1));
			}
			PrintWriter pw = response.getWriter();
			request.setAttribute("dept_loc",arr);
			//ArrayList <String> arr1 = (ArrayList<String>)request.getAttribute("dept_loc");
			//pw.println(arr1);
			//pw.println(request.getAttribute("dept_loc"));
			RequestDispatcher ds = request.getRequestDispatcher("Servlet2"); 
			ds.forward(request,response);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
