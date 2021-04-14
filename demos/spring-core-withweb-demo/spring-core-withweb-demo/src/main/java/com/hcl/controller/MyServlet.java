package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "My Servlet", urlPatterns = "/myservlet" )
public class MyServlet extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {

        //PrintWriter myResponse = response.getWriter();
        //myResponse.print("in the doGet method of myservlet");
        
        //request.setAttribute("greeting", "WooHoo!!!");
		//RequestDispatcher dispatcher 
       //= request.getRequestDispatcher("display"); // = request.getRequestDispatcher("index.jsp");
       //dispatcher.forward(request, response);
		
		//response.getWriter().append("Served by ME at blah blah: ").append(request.getContextPath());
		//HttpSession session = request.getSession();
		//session.setAttribute("greeting", "Hello!!!!");
		//response.sendRedirect("jsp/display.jsp");
        //response.sendRedirect("display");
		
		//request.setAttribute("greeting", "WooHoo!!!");
		RequestDispatcher dispatcher 
        = request.getRequestDispatcher("jsp/display.jsp"); // = request.getRequestDispatcher("index.html"); src/main/webapp/jsp
       dispatcher.forward(request, response);
    }

}
