<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>bbsWrite.jsp</title>
  
<style type="text/css">
  *{font-size:16pt;}
  a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
  a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
</style>
</head>
<body>
<h2> bbsWrite.jsp </h2>
  <form name="myform"  action="bbsInsert.bit"    >
      사번: <input type="text" name="sabun" >  <br>
      이름: <input type="text" name="name"  value="lee">  <br>
      제목: <input type="text" name="title"  value="daum">  <br>
      급여: <input type="text" name="pay"  value="41">   <br>
      메일: <input type="text" name="email"  value="sk@LG.kr">  <br>
       	   <input type="submit" value="bbs서블릿저장" > &nbsp;
       	   <input type="reset" value="취소">  
  </form>
  
<p>
<a href="bbsWrite.jsp">[bbs등록]</a>
<a href="bbsSelect.bit">[bbs전체출력]</a>
<a href="index.jsp">[index]</a>
</body>
</html>













