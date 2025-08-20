package com.raj.servlet;

import java.io.IOException;

import com.raj.bean.Crop;
import com.raj.implemetance.Crop_implements;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Crop")
public class Crop_Servlet extends HttpServlet{
	
	  protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
	  {   
		  boolean isFound=true;
		  String cropName=req.getParameter("NAME");
		  String cropSeason=req.getParameter("SEASON");
		  double cropRate=Double.parseDouble(req.getParameter("RATE"));
		  Crop c=new Crop(0, cropName, cropSeason, cropRate);
		  
		  Crop_implements ci=new Crop_implements();
		
		   if(ci.insert(c)){
			   RequestDispatcher rd=req.getRequestDispatcher("Agriculture.html");
			   rd.include(req, resp);
		   }
		   else{
			   RequestDispatcher rd=req.getRequestDispatcher("Error.jsp");
			   rd.include(req, resp);  
		   }
		  
		  
	  }

	}