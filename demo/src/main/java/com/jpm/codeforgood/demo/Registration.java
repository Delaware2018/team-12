package com.jpm.codeforgood.demo;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String zip = request.getParameter("zip");
		
		// test data coming in 
    	String next = "/index.jsp";
    	if (name == "") {
    		request.setAttribute("name_err", "please enter your name");
    		next = "/registration.jsp";
    	}
    	if (age == ""){
    		request.setAttribute("age_err", "please enter your age");
    		next = "/registration.jsp";
    	}
    	if (gender == null) {
    		request.setAttribute("gender_err", "please select your gender");
    		next = "/registration.jsp";
    	}
    	if (email == ""){
    		request.setAttribute("email_err", "please enter your email address");
    		next = "/registration.jsp";
    	}
    	if (phone == ""){
    		request.setAttribute("phone_err", "please enter your phone number");
    		next = "/registration.jsp";
    	}
    	if (zip == ""){
    		request.setAttribute("zip_err", "please enter your zip code");
    		next = "/registration.jsp";
    	}
    	
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher(next);
		
    	try {
    		dispatch.forward(request,response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
