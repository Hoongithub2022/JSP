<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="config.DBCP"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
//데이터베이스 처리
	List<StudentBean> students = null;
	
	try{
		Connection conn = DBCP.getConnection("dbcp_java1_college");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM `student`");
		students = new ArrayList<>();
		
		while(rs.next()){
		StudentBean sb = new StudentBean();			
		sb.setStdNo(rs.getString(1));
		sb.setStdName(rs.getString(2));
		sb.setStdHp(rs.getString(3));
		sb.setStdYear(rs.getString(4));
		sb.setStdAddress(rs.getString(5));
		students.add(sb);			
		}
		
		// 6단계
		rs.close();
		stmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생관리</title>
	</head>
	<body>
	<h3>학생관리</h3>
	<a href="/College/lecture.jsp">강좌관리</a>
	<a href="/College/register.jsp">수강관리</a>
	<a href="/College/student.jsp">학생관리</a>
	
	<h4>학생목록</h4>
	<button>등록</button>
	<table border="1">
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>학년</th>
			<th>주소</th>
		</tr>
		<%
			for(StudentBean sb : students){
	%>
			<tr>
				<td><%= sb.getStdNo() %></td>
				<td><%= sb.getStdName() %></td>
				<td><%= sb.getStdHp() %></td>
				<td><%= sb.getStdYear() %></td>
				<td><%= sb.getStdAddress() %></td>	
			</tr>
			<% } %>
	</table>
	
	<h4>학생등록</h4>
	<button>닫기</button>
	<table border="1">
				<tr>
					<td>학번</td>
					<td><input type="text" name="bookId"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="bookName"></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="bookName"></td>
				</tr>
				<tr>
					<td>학년</td>
					<td>
					<select>
						<option>1학년</option>
						<option>2학년</option>
						<option>3학년</option>
						<option>4학년</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="bookName"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button>등록</button></td>
				</tr>
	</table>
	</body>
</html>