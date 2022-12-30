<%@page import="config.DBCP"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//전송 데이터 수신
	request.setCharacterEncoding("utf-8");
	String bookId    = request.getParameter("bookId");
	String bookName   = request.getParameter("bookName");
	String publisher  = request.getParameter("publisher");
	String price = request.getParameter("price");

	try{
		Connection conn = DBCP.getConnection("dbcp_java1_bookstore");
		
		String sql = "update `book` set `bookId`=?, `bookName`=?, `publisher`=?, `price`=?";
		       sql += "where `bookName`=?";
		       
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, bookId);
		psmt.setString(2, bookName);
		psmt.setString(3, publisher);
		psmt.setString(4, price);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("/BookStore/book/list.jsp");
	
%>