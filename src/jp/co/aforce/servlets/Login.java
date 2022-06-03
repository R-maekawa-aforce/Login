package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.User;
import jp.co.aforce.dao.UserDAO;

@WebServlet("/jp.co.aforce.servlets/login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		UserDAO dao = new UserDAO();
		try {

			User u = dao.search(id, pass);

			String logId = u.getId();

			HttpSession session = request.getSession();
			session.setAttribute("user", u);

			if (logId != null) {
				request.setAttribute("user", u);
				request.getRequestDispatcher("../jsp/success.jsp").forward(request, response);
			} else {
				out.println("<p>IDもしくはパスワードが違います</p>");
				out.println("<p>" + id + "</p>");
				request.setAttribute("userId", u.getId());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
