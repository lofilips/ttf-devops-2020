package carrellottf.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carrellottf.backend.User;
import carrellottf.backend.UserRepository;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String pwd = request.getParameter("pass");
		User u = UserRepository.getInstance().get(login);
		if (u!=null && u.getPw().equals(pwd)) {
			request.getSession().setAttribute("user", u);
			request.setAttribute("user", u);
			//response.sendRedirect("home.jsp");
			getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		}
		else
			response.sendRedirect("login.jsp?err='login errato'");
	}

}
