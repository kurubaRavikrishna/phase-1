package Crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Delete")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		PrintWriter out=response.getWriter();
		Properties pros=new Properties();
		String id=request.getParameter("id");
		pros.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		
		try {
			Databaseconfig config=new Databaseconfig(pros.getProperty("driver"),pros.getProperty("url"),pros.getProperty("username"),pros.getProperty("password"));
		Connection conn=config.getConnection();
		PreparedStatement stmt=conn.prepareStatement("delete from eproduct where id= ?");
		stmt.setInt(1, Integer.parseInt(id));
		int x=stmt.executeUpdate();
		if (x<0)
			System.out.println("data deleted successfully");
		else
		{
			System.out.println("error while deleting");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
