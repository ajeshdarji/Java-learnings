package com.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addnum extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub */service*/ 
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num1"));
		int k=i+j;
		//req.setAttribute("d", k);
		//res.sendRedirect("sq?k="+k);
		//HttpSession session = req.getSession();
		//session.setAttribute("d", k);
		//res.sendRedirect("sq");
		Cookie cookie= new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		//RequestDispatcher rd=req.getRequestDispatcher("sq");
		//rd.forward(req,res);
		//res.getWriter().println("result is " +k);

	}

}
