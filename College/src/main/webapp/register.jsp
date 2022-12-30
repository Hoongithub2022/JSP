<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="config.DBCP"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.RegisterBean"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
//데이터베이스 처리
	List<RegisterBean> registers = null;
	
	try{
		Connection conn = DBCP.getConnection("dbcp_java1_college");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT a.*, b.stdName, c.lecName FROM register AS a JOIN student AS b on a.regStdNo = b.stdNo JOIN lecture AS c ON a.regLecNo = c.lecNo");
		registers = new ArrayList<>();
		
		while(rs.next()){
		RegisterBean rb = new RegisterBean();
		rb.setRegStdNo(rs.getString(1));
		rb.setRegLecNo(rs.getInt(2));
		rb.setRegMidScore(rs.getString(3));
		rb.setRegFinalScore(rs.getString(4));
		rb.setRegTotalScore(rs.getString(5));
		rb.setRegGrade(rs.getString(6));
		rb.setStdName(rs.getString(7));
		rb.setLecName(rs.getString(8));
		registers.add(rb);			
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
		<title>수강관리</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
		<script>
		
		$(function(){
			$('.ac').click(function(){
				$('section').show();
			})
			
			$('.btnsClose').click(function(){
				$('section').hide();
			})
		})
		</script>
	</head>
	<body>
	<h3>수강관리</h3>
	<a href="/College/lecture.jsp">강좌관리</a>
	<a href="/College/register.jsp">수강관리</a>
	<a href="/College/student.jsp">학생관리</a>
	
	<h4>수강현황</h4>
	<input type="text" name="regStdNo" placeholder="학번 입력"/>
	<button class="search">검색</button>
	<button class="ac">수강신청</button>
	<table border="1">
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>강좌명</th>
			<th>강좌코드</th>
			<th>중간시험</th>
			<th>기말시험</th>
			<th>총점</th>
			<th>등급</th>
		</tr>
		<%
			for(RegisterBean rb : registers){
	%>
			<tr>
				<td><%= rb.getRegStdNo() %></td>
				<td><%= rb.getStdName() %></td>
				<td><%= rb.getLecName() %></td>
				<td><%= rb.getRegLecNo() %></td>	
				<td><%= rb.getRegMidScore() %></td>	
				<td><%= rb.getRegFinalScore() %></td>		
				<td><%= rb.getRegTotalScore() %></td>	
				<td><%= rb.getRegGrade() %></td>	
			</tr>
			<% } %>
	</table>
	
	<form action="/College/proc/registerProc.jsp" method="post">
	<h4>수강신청</h4>
	<section style ="display:none">
	<button class="btnsClose">닫기</button>
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
					<td>신청강좌</td>
					<td>
					<select>
						<option>강좌선택</option>
						<option>운영체제론</option>
						<option>무역영문</option>
						<option>세법개론</option>
						<option>빅데이터 개론</option>
						<option>컴퓨팅사고와 코딩</option>
						<option>사회복지 마케팅</option>
						<option>컴퓨터 구조론</option>
					</select>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button>신청</button></td>
				</tr>
	</table>
	</section>
	</body>
</html>