package webservletdemofirst;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServlet
 */

public class addServlet extends HttpServlet {
	
   
    

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		int sum = number1 + number2;
		PrintWriter pw = response.getWriter();
		pw.println("sum of two number is&nbsp;&nbsp" +sum);
		System.out.println("data addes");
		
	}

	}


