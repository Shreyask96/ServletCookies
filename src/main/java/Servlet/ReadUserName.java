package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readUserName")
public class ReadUserName extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       
        Cookie[] cookies = request.getCookies();        // Retrieve cookies from the request
        
        String userName = "Guest";                     // Default if no user cookie is found
        
        // Find the 'userName' cookie
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("userName".equals(cookie.getName())) {
                    userName = cookie.getValue();
                    break;
                }
            }
        }

       
        response.setContentType("text/html");                // Set response type and display the user's name
        
        
        response.getWriter().println("Hello, " + userName );
    }
}
