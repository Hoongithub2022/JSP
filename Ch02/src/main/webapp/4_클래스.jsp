<%@page import="sub1.Account"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>4_클래스</title>
	</head>
	<body>
	<h4>클래스 실습</h4>
	<%
		Account kb = new Account("국민은행", "101-11-1001", "김유신", 1000);
		Account wr = new Account("우리은행", "102-11-1001", "김춘추", 2000);

		kb.deposit(50000);
		kb.withdraw(5000);
		kb.show(out);
		
		wr.deposit(3000);
		wr.withdraw(15000);
		wr.show(out);
		
	%>
	</body>
</html>