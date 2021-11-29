package net.bitcamp.bbs.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.bitcamp.bbs.BBSDAO;
import net.bitcamp.bbs.BBSDTO;


@WebServlet("/bbsInsert.bit")
public class BBSInsertController extends HttpServlet {  
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doUser(request, response);
	}//end

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doUser(request, response);
	}//end
	
	public void doUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //직접기술
		response.setContentType("text/html;charset=UTF-8"); //기존꺼복사한거
		PrintWriter out = response.getWriter();
		
		int dsabun = Integer.parseInt(request.getParameter("sabun"));
		String dname = request.getParameter("name");
		String dtitle = request.getParameter("title");
		int dpay = Integer.parseInt(request.getParameter("pay"));
		int dhit = 0 ; //조회수입력하는거대신 초기값
		String demail = request.getParameter("email");
		System.out.println("bbsWrite.jsp문서에서 넘어온 데이터 "+dsabun+"  " +dname+"  "+dtitle+" "+dpay+"  " + demail);
		
		out.println("<div align='center'>");
		out.println("<h2>BBSInsertController서블릿</h2>");
		out.println("<img src='images/a3.png'>");
		out.println("</div>");
		
		
		BBSDAO dao = new BBSDAO();
		BBSDTO dto = new BBSDTO();
		
		dao.dbInsert(dsabun,dname,dtitle,dpay,dhit,demail);
		System.out.println("MVC2 Insert컨트롤러에서 저장확인 했습니다");
		response.sendRedirect("bbsList.jsp");
	}//end
}//class END






