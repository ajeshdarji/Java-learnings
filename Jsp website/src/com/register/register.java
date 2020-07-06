package com.register;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.dao.registerdao;



@SuppressWarnings("serial")
@WebServlet("/register")
public class register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("email");
		String pass=request.getParameter("psw");
		registerdao dao=new registerdao();
		if(dao.ch(uname)) {
			 System.out.println("alert('Uname already exists');");
		}
		if(dao.check(uname,pass)){
		//if(uname.equals("abc")&&pass.equals("123")) {
			//HttpSession session=request.getSession();
			//session.setAttribute("username", uname);
			response.sendRedirect("testingcss.jsp");
			}
		else {
			response.sendRedirect("Register.jsp");
			
		}
	}
}


