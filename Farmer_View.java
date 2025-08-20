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

@WebServlet("/ViewFarmer")
public class Farmer_View extends HttpServlet{
	
	  protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
	  {   
		 
		  Farmer_implemetance fi=new Farmer_implemetance();
		  List<Farmer> list = fi.view();
		
		  req.setAttribute("FarmerList", list);
		  RequestDispatcher rs=req.getRequestDispatcher("FarmerList.jsp");
		  rs.forward(req, resp);
		  
	  }

	}