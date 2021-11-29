<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head><title> 회원가입 확인</title></head>

<body>
<form name="regForm" method="post" action=" ">
<table width="80%" align="center" border="0" cellspacing="0"
	cellpadding="5">
	<tr>
		<td align="center" valign="middle" >
		<table width="90%" border="1"bgcolor="#FFFFCC" cellspacing="0" cellpadding="2"
			align="center">
			<tr align="center" bgcolor="#996600">
				<td colspan="3">
					<font color="#FFFFFF"><b>
					회원님이 작성하신 내용입니다. 확인해 주세요</b>
					</font>
				</td>
			</tr>
			<tr>
				<td width="24%">아이디</td>
				<td width="41%">hong</td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td>1234</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>홍길동</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>aa@bb.com</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>111-1111</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit"	value="확인완료"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<input	type="button" value="다시쓰기" onClick="history.back()"></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>
