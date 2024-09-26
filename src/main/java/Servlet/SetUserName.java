package Servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setUserName")
public class SetUserName extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        Cookie userCookie = new Cookie("userName", "Rahul");      // Set a cookie with the user's name
        
        
       // userCookie.setMaxAge(24 * 60 * 60);  // 1 day  // Set the cookie to expire in 24 hours
        
                                                 
        response.addCookie(userCookie);            // Add the cookie to the response

        // Set response type and notify the user
        response.setContentType("text/html");
        
        
        response.getWriter().println("Cookie 'userName' has been set to 'Rahul'");
    }
}
