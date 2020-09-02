package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletController extends HttpServlet{
	
	// on PostMan  
	// http://localhost:8080/HelloServletsPractice/hello
	
	private static final long serialVersionID = 1L;
	
	public HelloServletController() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		PrintWriter out = res.getWriter();
		out.print("<h1> Hello from your doGet method. </h1>");		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		PrintWriter out = res.getWriter();
		out.print("<h1> Hello from your doPost method. </h1>");		
		
	}
	
}
