package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "What was the spider doing on the computer?... He was making a web-site!",
	        "What is the computer's favorite snack to eat?... Microchips!",
	        "Why did the computer go to the dentist?... To get his Bluetooth checked.",
	        "What is the biggest lie anyone can tell?... \"I have read and agreed to all the terms and conditions. ",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	        // Add more jokes here
	    };
       
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
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int operator = Integer.parseInt(request.getParameter("btn"));
		
		int ans = 0;
		
		switch(operator) {
		case 1: ans = num1+num2;
		break;
		case 2: ans = num1-num2;
		break;
		case 3: ans = num1*num2;
		break;
		case 4: ans = num1/num2;
		break;
		}
		
		int index = (int) (Math.random() * jokes.length);
		String ActualJoke = jokes[index];
		
		response.sendRedirect("NewFile.jsp?ans="+ans+"&joke="+ActualJoke);
		
//		response.getWriter().append("Answer  " + ans);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
