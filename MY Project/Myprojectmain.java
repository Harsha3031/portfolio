package com.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.MyprojectDAO;
import com.me.Myprojectuser;

public class Myprojectmain extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String Name=req.getParameter("name");
		String Email=req.getParameter("email");
		String Sub=req.getParameter("sub");
		String Msg=req.getParameter("msg");
		
			Myprojectuser m = new Myprojectuser(Name, Email, Sub, Msg);

			MyprojectDAO d= new MyprojectDAO();
			int i = d.insert(m);
			PrintWriter writer = resp.getWriter();
			if(i==1)
			{
				writer.print("Sucessfully Submitted");
			}
			else
			{
				writer.print("Somthing went wrong Please try again!!!");
			}
		
	}

}
