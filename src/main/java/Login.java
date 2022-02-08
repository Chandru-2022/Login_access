

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confrimpassword = request.getParameter("confrimpassword");
		String dateofbirth = request.getParameter("dateofbirth");
		String mobile = request.getParameter("mobile");
		Member1 member=new Member1(firstname, lastname, email, password, confrimpassword, dateofbirth, mobile);
		RegisterDao rDao=new RegisterDao();
		String result=rDao.insert(member);
		response.getWriter().print(result);
	}

}
