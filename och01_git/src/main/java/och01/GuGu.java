package och01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GuGu
 */
public class GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuGu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		int sum = 0;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		
		PrintWriter out =response.getWriter();//getWriter=문자형식을 보내는...
		out.println("<html><body>");
		out.printf("<h1>%d 단 결과입니다!<h1>",num); //순서대로 적용해준다 이는 자바책에도 나와있다 찾아보도록하자!
		for (int i = 1; i <= 9; i++) {
	        int result = num * i;
	        out.printf("<p>%d * %d = %d</p>", num, i, result);
	    }
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
/////////////aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
/////////////aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
/////////////aaaaaaaaaaaaaaaaaaaaaaaaaaaaadqwdqwdqwdqdqwd
/////////////aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
}
