package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.User;
import jp.co.aforce.dao.UserDAO;


@WebServlet("/jp.co.aforce.servlets/insert")
public class Insert extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		User u = new User();

		u.setId(id);
		u.setPass(pass);

		request.setAttribute("user", u);
		request.setAttribute("user", u);


		UserDAO dao = new UserDAO();
		try {
			int line = dao.insert(id, pass);

			if(line > 0) {
				request.getRequestDispatcher("../jsp/comp.jsp").forward(request, response);
			}else {
				out.println("<p>登録に失敗しました、別のIDまたはパスワードでお試しください</p>");
			}
		} catch (Exception e) {
			out.println("既に登録されたIDとパスワードです、別のIDまたはパスワードでお試しください。");
			e.printStackTrace();
		}




	}

}
