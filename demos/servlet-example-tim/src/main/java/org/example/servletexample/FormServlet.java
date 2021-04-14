package org.example.servletexample;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// this is from here: https://www.baeldung.com/intro-to-servlets

@WebServlet(name = "FormServlet", urlPatterns = "/calculateServlet")
public class FormServlet extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {

        PrintWriter myResponse = response.getWriter();
        myResponse.print("in the doGet method");
    }

    @Override
    protected void doPost(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {

        String height = request.getParameter("height");
        String weight = request.getParameter("weight");

        try {
            double bmi = calculateBMI(
              Double.parseDouble(weight), 
              Double.parseDouble(height));
            
            request.setAttribute("bmi", bmi);
            request.setAttribute("product", "pizza");
            request.setAttribute("weight", Double.parseDouble(weight));
            request.setAttribute("height", Double.parseDouble(height));
            response.setHeader("Test", "Success");
            response.setHeader("BMI", String.valueOf(bmi));

            RequestDispatcher dispatcher 
             // = request.getRequestDispatcher("index.jsp");
            = request.getRequestDispatcher("jsp/display.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("index.jsp");
        }
    }

    private Double calculateBMI(Double weight, Double height) {
        return weight / (height * height);
    }
}
