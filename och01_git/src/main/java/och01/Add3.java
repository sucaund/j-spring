package och01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//    request= 서버에서 받고, response=서버로 보내는!
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add3 Get start...");
		
//		목표 :1부터 전달
		int num = Integer.parseInt(request.getParameter("num"));
		String loc = request.getParameter("loc");
		System.out.println("Add3 num->"+num);
		int sum = 0;
		for (int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println("Add3 sum->"+sum);
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		//공식--->사용자 Browsers화면에 출력하는....
		PrintWriter out =response.getWriter();//getWriter=문자형식을 보내는...
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 합계 %s<h1>",num,loc); //순서대로 적용해준다 이는 자바책에도 나와있다 찾아보도록하자!
		out.println(sum);
		out.println("</body></html>");
		out.close();
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add3 post start...");
	}

}
