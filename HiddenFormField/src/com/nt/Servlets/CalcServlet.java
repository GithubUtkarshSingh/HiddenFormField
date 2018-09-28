package com.nt.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Calc", urlPatterns = { "/Calc" })
public class CalcServlet extends HttpServlet 
{	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		String p1=req.getParameter("t1");
		String p2=req.getParameter("t2");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=cyan>");
		out.println("<form action=./addsub>");
		out.println("<input type=hidden name=h1 value="+p1+">");
		out.println("<input type=hidden name=h2 value="+p2+">");
		out.println("<input type=submit value=add name=b>");
		out.println("<input type=submit value=sub name=b>");
		out.println("</form></body></html>");
	}
}