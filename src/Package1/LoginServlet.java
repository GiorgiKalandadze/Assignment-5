package Package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		AccountManager accountManager = (AccountManager) getServletContext().getAttribute("accountManager");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		Account account = accountManager.loginUser(username, password);

        checkUser(account, request, response);
	}

	/*
	 * Check validation of user
	 */
	private void checkUser(Account account, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 if(account == null) {
			 //Go to please try again page
			 request.getRequestDispatcher("InformationIncorrect.jsp").forward(request, response);
		 } else{
			 //Go to welcome user page
	         request.getRequestDispatcher("SuccessfullLogin.jsp").forward(request, response);
	       }
		
	}

}
