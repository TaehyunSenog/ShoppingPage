package helloMVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
package helloMVC;


import java.io.IOException;
/**
*Servlet implementation class Home
*/
@webServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = IL;

	/**
	* @see HttpServlet#HttpServlet()
	*/
	
	public Home() {
		super();
		 // TODO Auto-generated constructor stub
	}

	/**
	* @see HttpServlet#()
	*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServeltException, IOException {
		
		String action = request.getParameter("action");
		String page = null;
		
		if(action.equals("login")) page="/view/loginForm.jsp";
		else if(action.equals("register")) page="/view/registerForm.jsp";
		else page="/view/error.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
}