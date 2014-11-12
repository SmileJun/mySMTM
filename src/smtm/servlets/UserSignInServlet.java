package smtm.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserSignIn
 */
@WebServlet("/UserSignIn")
public class UserSignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String driverName = "jdbc:mysql://10.73.45.134/";
    private static String smtmDbPath = "SMARTJUNDB";
	private static final String connectionPath = driverName + smtmDbPath;
	private static final String smtmDbUser = "smartjun";	
	private static final String smtmDbPw = "smartjun";
  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
			
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection(connectionPath, smtmDbUser, smtmDbPw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(
				 	"select * from test");
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
				
			out.println("<html><head><title>회원목록</title></head>");
			out.println("<body><h1>회원목록</h1>");
			while(rs.next()) {
				out.println(
						rs.getInt("id") + "," +
						rs.getString("data") + "<br>"
						);
			}
		} catch (Exception e) {
			throw new ServletException(e);
		} finally {
			try {if ( rs != null ) rs.close(); } catch (Exception e) {}
			try {if ( stmt != null ) stmt.close(); } catch (Exception e) {}
			try {if ( conn != null ) conn.close(); } catch (Exception e) {}
		}
	}
}

