package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Details")//it is important
public class details extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("num1");
	    String b=request.getParameter("num2");
	    request.setAttribute("num1", a);
	    request.setAttribute("num2", b);
	    int c=Integer.parseInt(a)+Integer.parseInt(b);
	    String d=String.valueOf(c);
	    request.setAttribute("c", d);
	    RequestDispatcher r=request.getRequestDispatcher("output.jsp");
	    r.forward(request, response);
	}

	

}