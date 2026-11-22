package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.beans.User;
import example.beans.UserValidator;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet(name = "myValidationServlet", urlPatterns = { "/doValidate" })
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//capturing request specific parameters
		String user_name=request.getParameter("uid");
		String user_password=request.getParameter("pwd");
		
		//Populating the object of Java Bean: User based upon request parameters
		User currentUser=new User(user_name,user_password);
		boolean success=UserValidator.isValid(currentUser);
		
		String responseText="<h1 style='color:red'>Authentication Failed</h1>";
		if(success) 
			responseText="<h1 style='color:green'>Authentication success</h1>";
		out.println(responseText);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
