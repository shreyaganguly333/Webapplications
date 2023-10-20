package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int x=Integer.parseInt(request.getParameter("operand1"));
		int y=Integer.parseInt(request.getParameter("operand2"));
		String z = request.getParameter("operator");
		int r =0;
		switch(z) {
		case "+":r =x+y;break;
		case "-": r=x-y;break;
		case "x": r=x*y;break;
		case "/": r=x/y;break;
		}
		RequestDispatcher rd = request.getRequestDispatcher("ResultShow.jsp");// ready to invoke ResultShow.jsp
		request.setAttribute("myresult",r);// the output r is transferred to an external jsp.
		rd.forward(request, response);// invoked ResultShow.jsp
	}

}