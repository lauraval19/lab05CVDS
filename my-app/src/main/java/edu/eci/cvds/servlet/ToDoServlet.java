/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.cvds.servlet;

import java.io.IOException;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.eci.cvds.servlet.Service;
import edu.eci.cvds.servlet.model.Todo;
import java.util.List;


/**
 *
 * @author laura.alvarado-g
 */

@WebServlet(
        urlPatterns = "/helloToDoServlet"
)

public class ToDoServlet extends HttpServlet {
    
    Service service;
    List<Todo> listaxhacer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
        Todo todo = service.getTodo(Integer.parseInt(optId.get()));
        if(todo != null){
            resp.setStatus(HttpServletResponse.SC_OK);
            listaxhacer.add(todo);
        }
                
        
    }
}
