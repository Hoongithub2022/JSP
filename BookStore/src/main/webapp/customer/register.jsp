<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>고객등록</title>
	</head>
	<body>
	<h3>고객등록</h3>
	<a href="#">처음으로</a>
	<a href="#">고객목록</a>
	
	<form action="./registerProc.jsp" method="post">
	<table border="1">
				<tr>
					<td>고객명</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button>등록</button></td>
				</tr>
	</table>
	</form>
	</body>
</html>