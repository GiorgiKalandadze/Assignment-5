package Package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
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
		
	
        checkUserExistance(accountManager, username, password, request, response);
	}

	/*
	 * Check if user with given username already exists or not
	 */
	private void checkUserExistance(AccountManager accountManager, String username, String password,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(accountManager.accountExist(username)) {
			 request.getRequestDispatcher("AlreadyUsed.jsp").forward(request, response);
		} else {
			accountManager.registerUser(username, password);
			request.getRequestDispatcher("SuccessfullLogin.jsp").forward(request, response);
		}
		
	}
	
	

}
