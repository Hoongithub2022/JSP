<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	
	request.setCharacterEncoding("utf-8");
	String regStdNo   = request.getParameter("regStdNo");
	String regLecNo   = request.getParameter("regLecNo");
	String regMidScore  = request.getParameter("regMidScore");
	String regFinalScore = request.getParameter("regFinalScore");
	String regTotalScore = request.getParameter("regTotalScore");
	String regGrade = request.getParameter("regGrade");
	
	try{
		
		Context initCtx = new InitialContext();
		Context ctx = (Context)initCtx.lookup("java:comp/env");
		
		
		DataSource ds = (DataSource) ctx.lookup("dbcp_java1_college");
		Connection conn = ds.getConnection();
		
		// 3단계
		String sql = "INSERT INTO `register` VALUES (?,?,?,?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, regStdNo);
		psmt.setString(2, regLecNo);
		psmt.setString(3, regMidScore);
		psmt.setString(4, regFinalScore);
		psmt.setString(5, regTotalScore);
		psmt.setString(6, regGrade);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	// 리다이렉트
	response.sendRedirect("/College/register.jsp");
%>