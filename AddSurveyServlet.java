import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class AddSurveyServlet
 */

public class AddSurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSurveyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String donated = request.getParameter("donated");
		String times = request.getParameter("times");

		String[] reason = request.getParameterValues("reason");

		out.print("<!DOCTYPE html><html><body>");
		out.print("Please indicate your gender: " + gender + "<br>");
		out.print("Please indicate your age: " + age + "<br>");
		out.print("Have you ever donated blood: " + donated + "<br>");
		out.print("If yes, how many times  within the last 2 years?: " + times + "<br>");
		out.print("What prompted you to donate blood?: <br> ");


		if (reason != null) {
			for (int i = 0; i < reason.length; i++) {
				out.print(reason[i] + "<br>");
			}
		}
		out.print("</body></html>");

	}

}
