/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 721292
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String formaction = request.getParameter("action");
        
        if(formaction!=null&&formaction.equals("logout")){
            session.removeAttribute("usern");
           // getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
        }
        
        String usern = (String)session.getAttribute("usern");
        if(usern == null){
            response.sendRedirect("/register.jsp");
        }
        else{
            response.sendRedirect("shoppingList.jsp");   
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        HttpSession session = request.getSession();
        String formaction = request.getParameter("action");
        
        ArrayList<String> shoplist = (ArrayList<String>)session.getAttribute("shoplist");
        //ArrayList<String> shoplist = ArrayList<String>;
        String items = request.getParameter("items");

        
        if (shoplist==null || shoplist.isEmpty())
        {
            shoplist = new ArrayList<String>();
        }
        if(formaction.equals("additems")){
            if(!items.isEmpty())
            {
             shoplist.add(items);
             session.setAttribute("shoplist", shoplist);
             response.sendRedirect("shoppingList.jsp");
             return;
            }
        }
        
        String user = request.getParameter("usern");
        if(formaction.equals("register")){
            session.setAttribute("usern", user);
            response.sendRedirect("shoppingList.jsp");    
        }
         
    }
}
