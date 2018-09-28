package com.nt.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "addsub", urlPatterns = { "/addsub" })
public class AddSubServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String b=req.getParameter("b");
		int n1=Integer.parseInt(req.getParameter("h1"));
		int n2=Integer.parseInt(req.getParameter("h2"));
		int n3=0;
		if(b.equals("add"))
		{
			n3=n1+n2;
		}
		if(b.equals("sub"))
		{
			n3=n1-n2;
		}
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=cyan>");
		out.println("<h2>Result is "+n3+"</h2>");
		out.println("</body></html>");	
	}
}