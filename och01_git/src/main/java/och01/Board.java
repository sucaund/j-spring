package och01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

/**
 * Servlet implementation class Board
 */
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title"); 
		String writer = request .getParameter ("writer"); 
		String content = request.getParameter ("content"); 
		Date date = new Date(0); 
		response.setContentType("text/html;clnarset=utf-8"); 
		PrintWriter out = response.getWriter(); 
		out.println("<html><body><h1>거시판</h1>"); 
		out.println ("제목 : " + title +"<p>"); 
		out.println ("작성자 : " + writer +"<p>"); 
		out.println ("작성일 : 0 "+ date +"<p>");
		out.println("내용 <br><pre>" + content + "</pre>" );
		out.println("</body></html>"); 
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
