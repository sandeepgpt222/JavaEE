

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	
	public void init(ServletConfig config){
		// TODO Auto-generated method stub
		try {
			//Connection to database
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			con = DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try{
		//getting data from form
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		//entering data to db
		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?)");
		pst.setInt(1, rollno);
		pst.setString(2, name);
		pst.setInt(3, age);
		pst.setString(4, address);
		int n= pst.executeUpdate();		
		
		PrintWriter pw=response.getWriter();
		if(n>0)
		{
			pw.println("data added"+"<br>");
		}
		else {
			pw.println("Data not added"+"<br>");
		}
		
		pst = con.prepareStatement("select rollno from student");
		ResultSet rs = pst.executeQuery();
		List<Integer>rolls = new ArrayList<Integer>();
		while(rs.next()) {
			rolls.add(rs.getInt(1));
		}

		request.setAttribute("rollnos", rolls);
		RequestDispatcher rd = request.getRequestDispatcher("Report.jsp");
		rd.forward(request, response);
	}
	catch(Exception ee) {
		ee.printStackTrace();
	}	
	}

}
