package example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.dao.AppDao;
import example.dao.DepartmentDao;
import example.entity.Department;

/**
 * Servlet implementation class DeptSearchServlet
 */
@WebServlet(name = "myDeptSearchServlet", urlPatterns = { "/deptSearch" })
public class DeptSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String dept_no=request.getParameter("dept_no");
		int deptNo=Integer.parseInt(dept_no);
		AppDao<Department,Integer> daoRef = new DepartmentDao();
		Department searchedDept=daoRef.getById(deptNo);
		RequestDispatcher dispatcher=null;
		if(searchedDept==null) // if dept ID id null go back
		{
			//GO BACK
			dispatcher=request.getRequestDispatcher("deptSearch.html");
			out.println("<h1>Department not found , try again....</h1>");
			dispatcher.include(request, response);
		}
		else
		{
			//GO AHEAD
			dispatcher=request.getRequestDispatcher("deptView");
			//Attaching the loaded department data to the existing data
			request.setAttribute("loadedDept", searchedDept);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
