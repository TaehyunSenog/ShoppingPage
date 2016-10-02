package helloMVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @param <HttpServletRequest>
 * @param <HttpServletResponse>
 * @param <String>
 * @param <PrintWritter>
 * @Server implementation class DoLogin
 */

@WebServlet("/DoLogin")
public class DoLogin<HttpServletRequest, HttpServletResponse, String, PrintWritter> extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//read form data
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    
    //perform business logic
    
    PrintWritter out = response.getWritter();
    String htmlResponse="<html>";
    htmlResponse+= "<h2> Your name is: " + username + "<br/>";
    htmlResponse+= "<h2> Your password is: " + password + "<br/>";
    htmlResponse+= "</html>";
    out.printIn(htmlResponse);
	}
}
            