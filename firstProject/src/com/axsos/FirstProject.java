package com.axsos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstProject
 */
@WebServlet("/FirstProject")
public class FirstProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String userName = "UNKNOWN" ;
        String language = "UNKNOWN";
        String hometown = "UNKNOWN";
        if (request.getParameter("name") != null) {
        	userName = request.getParameter("name");
        }
        if (request.getParameter("language") != null) {
        	language = request.getParameter("language");
        }
        if (request.getParameter("hometown") != null) {
        	hometown = request.getParameter("hometown");
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Hello World, from " + userName + "</h1>"+"<h1>your Favorite Language: " + language + "</h1>"+"<h1>Your Hometown: " + hometown + "</h1>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
