<%@page import="config.DBCP"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//전송 데이터 수신
	request.setCharacterEncoding("utf-8");
	String custId    = request.getParameter("custId");
	String name   = request.getParameter("name");
	String address  = request.getParameter("address");
	String phone = request.getParameter("phone");

	try{
		Connection conn = DBCP.getConnection("dbcp_java1_bookstore");
		
		String sql = "update `customer` set `custId`=?, `name`=?, `address`=?, `phone`=?";
		       sql += "where `custId`=?";
		       
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, custId);
		psmt.setString(2, name);
		psmt.setString(3, address);
		psmt.setString(4, phone);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("/BookStore/book/list.jsp");
	
%>