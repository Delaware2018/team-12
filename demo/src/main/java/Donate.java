

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Donate
 */
@WebServlet("/Donate")
public class Donate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Donate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		if ("pickup" == name) {
			RequestDispatcher dispatch = getServletContext().getRequestDispatcher('/pickup.jsp');
		}
		if ("dropoff" == name) {
			RequestDispatcher dispatch = getServletContext().getRequestDispatcher('/dropoff.jsp');
		}
	}

}
