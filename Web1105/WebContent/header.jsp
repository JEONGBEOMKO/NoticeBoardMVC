<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<% 
String name =(String)session.getAttribute("naver");
%>

<% if (name == null) {%>   
       <nav>
           <ul class="nav-items">
               <li><a href="./login.jsp">Login</a></li>
               <li><a href="#">Join</a></li>
           </ul>
       </nav>
    
          <%} else { %>
          <nav>
             <ul class="nav-items">
           		<li><a href="#"><%=name %>님 환영합니다</a></li>
                <li><a href="#">로그아웃</a></li>
                <li><a href="#">회원정보수정</a></li>
             </ul>
         </nav>
<%} %>

