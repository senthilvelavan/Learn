package learnservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet{
	public void init(){
		System.out.println("inside init");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("request.getProtocol()"+request.getProtocol());
		out.println("sample webapp for test");
		out.println("</body>");
		out.println("</html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	public void destroy() {
		
		System.out.println("inside destroy");
	}

}
