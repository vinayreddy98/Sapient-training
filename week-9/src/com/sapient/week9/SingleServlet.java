package com.sapient.week9;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingleServlet
 */
@WebServlet("/*")
public class SingleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uri = request.getRequestURI().substring(request.getContextPath().length());
		
		switch (uri){
		
			case "/getEmps": 
			                response.getWriter().append("Here is ur :" + uri + "  details");
			                break;
			  
			case "/getCustomer":
	                            response.getWriter().append("Here is ur :" + uri + "  details");
	                        break;
	            
			case "/getProducts":
	                            response.getWriter().append("Here is ur :"+"<br/>" + uri + "  details");
	                        break;
	                     
	        default   :  response.getWriter().append("Here is ur :"+"<br/>" + uri + "  details");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
