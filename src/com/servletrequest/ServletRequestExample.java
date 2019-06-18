package com.servletrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequestExample
 */
//@WebServlet("/ServletRequestExample")
public class ServletRequestExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public ServletRequestExample() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter= response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		printwriter.print("Welcome " + name);
	}
}
