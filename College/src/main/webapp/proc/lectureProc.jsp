<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	
	request.setCharacterEncoding("utf-8");
	String lecNo   = request.getParameter("lecNo");
	String lecName   = request.getParameter("lecName");
	String lecCredit  = request.getParameter("lecCredit");
	String lecTime = request.getParameter("lecTime");
	String lecClass = request.getParameter("lecClass");
	
	try{
		
		Context initCtx = new InitialContext();
		Context ctx = (Context)initCtx.lookup("java:comp/env");
		
		
		DataSource ds = (DataSource) ctx.lookup("dbcp_java1_college");
		Connection conn = ds.getConnection();
		
		// 3단계
		String sql = "INSERT INTO `lecture` VALUES (?,?,?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, lecNo);
		psmt.setString(2, lecName);
		psmt.setString(3, lecCredit);
		psmt.setString(4, lecTime);
		psmt.setString(5, lecClass);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	// 리다이렉트
	response.sendRedirect("/College/lecture.jsp");
%>