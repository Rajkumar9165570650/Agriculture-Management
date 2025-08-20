package com.raj.servlet;

import java.io.IOException;
import java.util.List;

import com.raj.bean.Farmer;
import com.raj.implemetance.Farmer_implemetance;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Farmer_Login extends HttpServlet{
	
	  protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
	  {   
		  boolean isFound=true;
		  String name=req.getParameter("NAME");
		  String password=req.getParameter("PASSWORD");
		  Farmer_implemetance fi=new Farmer_implemetance();
		
		   if(fi.valid(name, password)) {
			   RequestDispatcher rd=req.getRequestDispatcher("Agriculture.html");
			   rd.include(req, resp);
		   }
		   else{
			   RequestDispatcher rd=req.getRequestDispatcher("Error.jsp");
			   rd.include(req, resp);  
		   }
		  
		  
	  }

	}