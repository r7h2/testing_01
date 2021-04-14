package com.hcl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served by ME!!!! at: ").append(request.getContextPath());
		request.setAttribute("greeting", "Hello!!!!");
		RequestDispatcher dispatcher 
       = request.getRequestDispatcher("jsp/product.jsp"); // = request.getRequestDispatcher("index.jsp");
       dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String product = request.getParameter("name");
		String price = request.getParameter("price");
		request.setAttribute("product", product);
		request.setAttribute("price", price);
		request.setAttribute("greeting", "Hello!!!!");
		RequestDispatcher dispatcher 
       = request.getRequestDispatcher("jsp/display.jsp"); // = request.getRequestDispatcher("index.jsp");
       dispatcher.forward(request, response);
		
	}

}
