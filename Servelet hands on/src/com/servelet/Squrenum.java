package com.servelet;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Squrenum extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		//int sq=Integer.parseInt(req.getParameter("k"));redirect
		//sq=sq*sq;
		//HttpSession session = req.getSession();
		//int sq=(int)session.getAttribute("d");
		//sq=sq*sq;
		Cookie cookies[]=req.getCookies();
		int k = 0;
		for(Cookie c:cookies) {
			if(c.getName().equals("k")) 
				 k=Integer.parseInt(c.getValue());
		}
		k=k*k;
		res.getWriter().println("result is " +k);
		//int s=(int)req.getAttribute("d");dispatcher
		//int sq=s*s;
		//res.getWriter().println("result is " +sq);
	}
}
