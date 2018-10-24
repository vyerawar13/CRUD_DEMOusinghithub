import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class Ajaxservlet extends HttpServlet {
	
	
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
	System.out.println("hoiii");	
		String s=req.getParameter("a");
		System.out.println(s);
		res.setContentType("plain/text");
		res.setCharacterEncoding("UTF-8");
		res.getWriter().write(s);
		
		System.out.println("send");
	}

}
