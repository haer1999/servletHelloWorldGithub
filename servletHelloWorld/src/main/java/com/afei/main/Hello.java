package com.afei.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet{
	public Hello(){
		super();
	}
	
	public void destroy() {
        super.destroy(); 
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("  Hello World;");
		out.print("  Get Method。 你好");
		out.println("  </BODY>");
		out.println("</HTML>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("  Hello World;");
		out.print("  Post Method。");
		out.println("  </BODY>");
		out.println("</HTML>");
	}
}
