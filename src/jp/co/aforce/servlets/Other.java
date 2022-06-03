package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/jp.co.aforce.servlets/other")
public class Other extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; UTF-8");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		session.getAttribute("user");

		request.getRequestDispatcher("../jsp/success").forward(request, response);


	}

}
