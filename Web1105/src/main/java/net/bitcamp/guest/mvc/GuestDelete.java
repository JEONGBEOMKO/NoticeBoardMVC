package net.bitcamp.guest.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher; //2시 13분에 임포트 추가함
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.bitcamp.guest.GuestDAO;
import net.bitcamp.guest.GuestDTO;


@WebServlet("/gDelete.camp")
public class GuestDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
	}//end

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
	}//end

	public void doUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //한글지원
		PrintWriter out = response.getWriter();
		
		int data = Integer.parseInt(request.getParameter("idx"));
		System.out.println("GuestDelete.java서블릿문서 data = " +data);
		out.println("<div align='center'> <img src='images/a1.png'> </div>");
		
		//request,response,out,session
		HttpSession session = request.getSession();
		String ob = (String)session.getAttribute("naver");
		if(ob==null ||ob=="" || ob.equals("")) {
		  out.println("<script>");
		  out.println("alert('삭제권한이 없습니다');");
		  out.println("setTimeout(location.href='login.jsp', 1000);");
		  out.println("</script>");
		}else {
		  GuestDAO dao = new GuestDAO();
		  dao.dbDelete(data);  
		  out.println("<script>");
		  out.println("alert('삭제작업이 가능합니다');");
		  out.println("setTimeout(location.href='guestList', 500);");
		  out.println("</script>");
		  //response.sendRedirect("guestList");
		}
	}//end
}//GuestDelete END









