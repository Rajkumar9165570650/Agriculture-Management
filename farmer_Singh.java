package com.raj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.raj.bean.Farmer;
import com.raj.implemetance.Farmer_implemetance;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class farmer_Singh  extends HttpServlet{
	
  protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
  {
	  String name=req.getParameter("NAME");
	  String password=req.getParameter("PASSWORD");
	  String location=req.getParameter("LOCATION");
	  long mobile=Long.parseLong(req.getParameter("MOBILE"));
	  Farmer f=new Farmer(name, password, location, mobile);
	  Farmer_implemetance fi=new Farmer_implemetance();
	  resp.setContentType("text/html");
	  if(fi.insert(f)) {
		  RequestDispatcher rs=req.getRequestDispatcher("Agriculture.html") ;
		  rs.include(req, resp);
		  
	  }else {
		  System.out.println(f.getName()+" Your Some SuccessFull"); 
	  }
	  
	  
  }

}
