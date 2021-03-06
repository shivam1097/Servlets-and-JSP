package com.shivam.ToDo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * created by Shivam on 22-02-2019.
 */

@WebServlet(urlPatterns = "/delete_ToDo")
public class Delete_ToDo_Servlet extends HttpServlet {

    ToDoService service=new ToDoService();
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        boolean isRemoved=service.removeTodo(httpServletRequest.getParameter("todo"),httpServletRequest.getParameter("category"));

        if (isRemoved){
            //Redirecting to /todo servlet.
            httpServletResponse.sendRedirect("/list_todo");
        }

    }
}
