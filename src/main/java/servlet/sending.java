package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class getDataPerson
 */
@WebServlet("/sending")
public class sending extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sending() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
        	response.setContentType("text/html; charset=utf-8");

		String subject, to, message;

		subject = request.getParameter("subject");
		to = request.getParameter("to");
		message = request.getParameter("message");

		ApplicationContext context = 
             			new ClassPathXmlApplicationContext("/src/main/java/servlet/Spring-Mail.xml");
 
    		MailMail mm = (MailMail) context.getBean("mailMail");
        	mm.sendMail(
		   "mogutcan@bil.omu.edu.tr",
    		   to,
    		   subject , 
    		   message);
        

		String adres = "index.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(adres);
		dispatcher.forward(request, response);
		
		
	
	}

}
