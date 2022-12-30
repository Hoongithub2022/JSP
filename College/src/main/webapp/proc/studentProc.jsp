<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	
	request.setCharacterEncoding("utf-8");
	String stdNo   = request.getParameter("stdNo");
	String stdName   = request.getParameter("stdName");
	String stdHp  = request.getParameter("stdHp");
	String stdYear = request.getParameter("stdYear");
	String stdAddress = request.getParameter("stdAddress");
	
	try{
		
		Context initCtx = new InitialContext();
		Context ctx = (Context)initCtx.lookup("java:comp/env");
		
		
		DataSource ds = (DataSource) ctx.lookup("dbcp_java1_student");
		Connection conn = ds.getConnection();
		
		// 3단계
		String sql = "INSERT INTO `student` VALUES (?,?,?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, stdNo);
		psmt.setString(2, stdName);
		psmt.setString(3, stdHp);
		psmt.setString(4, stdYear);
		psmt.setString(5, stdAddress);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	// 리다이렉트
	response.sendRedirect("/College/register.jsp");
%>