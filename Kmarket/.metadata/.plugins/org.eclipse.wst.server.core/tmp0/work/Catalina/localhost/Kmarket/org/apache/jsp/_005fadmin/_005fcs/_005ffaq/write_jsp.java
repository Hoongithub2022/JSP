/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-12-23 00:12:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._005fadmin._005fcs._005ffaq;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/_admin/_header.jsp", out, false);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"select[name=group]\").change(function() {\r\n");
      out.write("			let group = $(this).val();\r\n");
      out.write("			let cate = $(\"select[name=cate]\");\r\n");
      out.write("			\r\n");
      out.write("			cate.empty();\r\n");
      out.write("			if(group == '회원'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"가입\">가입</option>');\r\n");
      out.write("				cate.append('<option value=\"탈퇴\">탈퇴</option>');\r\n");
      out.write("				cate.append('<option value=\"회원정보\">회원정보</option>');\r\n");
      out.write("				cate.append('<option value=\"로그인\">로그인</option>');\r\n");
      out.write("			}\r\n");
      out.write("			if(group == '쿠폰/혜택/이벤트'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"쿠폰/할인혜텍\">쿠폰/할인혜텍</option>');\r\n");
      out.write("				cate.append('<option value=\"포인트\">포인트</option>');\r\n");
      out.write("				cate.append('<option value=\"제휴\">제휴</option>');\r\n");
      out.write("				cate.append('<option value=\"이벤트\">이벤트</option>');\r\n");
      out.write("			}\r\n");
      out.write("			if(group == '주문/결제'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"상품\">상품</option>');\r\n");
      out.write("				cate.append('<option value=\"결제\">결제</option>');\r\n");
      out.write("				cate.append('<option value=\"구매내역\">구매내역</option>');\r\n");
      out.write("				cate.append('<option value=\"영수증/증빙\">영수증/증빙</option>');\r\n");
      out.write("			}\r\n");
      out.write("			if(group == '배송'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"배송상태/기간\">배송상태/기간</option>');\r\n");
      out.write("				cate.append('<option value=\"배송정보확인/변경\">배송정보확인/변경</option>');\r\n");
      out.write("				cate.append('<option value=\"스마일배송\">스마일배송</option>');\r\n");
      out.write("				cate.append('<option value=\"해외배송\">해외배송</option>');\r\n");
      out.write("				cate.append('<option value=\"당일배송\">당일배송</option>');\r\n");
      out.write("				cate.append('<option value=\"해외직구\">해외직구</option>');\r\n");
      out.write("			}\r\n");
      out.write("			if(group == '취소/반품/교환'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"반품신청/철회\">반품신청/철회</option>');\r\n");
      out.write("				cate.append('<option value=\"배송정보확인/변경\">배송정보확인/변경</option>');\r\n");
      out.write("				cate.append('<option value=\"교환.AS신청/철회\">교환.AS신청/철회</option>');\r\n");
      out.write("				cate.append('<option value=\"교환정보확인/변경\">교환정보확인/변경</option>');\r\n");
      out.write("				cate.append('<option value=\"취소신청/철회\">취소신청/철회</option>');\r\n");
      out.write("				cate.append('<option value=\"취소확인/환불정보\">취소확인/환불정보</option>');\r\n");
      out.write("			}\r\n");
      out.write("			if(group == '여행/숙박/항공'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"여행/숙박\">여행/숙박</option>');\r\n");
      out.write("				cate.append('<option value=\"항공\">항공</option>');\r\n");
      out.write("			}\r\n");
      out.write("			if(group == '안전거래'){\r\n");
      out.write("				cate.append('<option value=\"\">2차 선택</option>');\r\n");
      out.write("				cate.append('<option value=\"서비스 이용규칙 위반\">서비스 이용규칙 위반</option>');\r\n");
      out.write("				cate.append('<option value=\"지식재산권침해\">지식재산권침해</option>');\r\n");
      out.write("				cate.append('<option value=\"법령 및 정책위반 상품\">법령 및 정책위반 상품</option>');\r\n");
      out.write("				cate.append('<option value=\"게시물정책위반\">게시물정책위반</option>');\r\n");
      out.write("				cate.append('<option value=\"직거래/외부거래유도\">직거래/외부거래유도</option>');\r\n");
      out.write("				cate.append('<option value=\"표시광고\">표시광고</option>');\r\n");
      out.write("				cate.append('<option value=\"청소년위해상품/이미지\">청소년위해상품/이미지</option>');\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$('.goList').click(function(){\r\n");
      out.write("			location.href=\"/Kmarket/admin/cs/faq/list.do\";\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	//스마트에디터\r\n");
      out.write("	var oEditors = [];\r\n");
      out.write("	$(function(){\r\n");
      out.write("	      nhn.husky.EZCreator.createInIFrame({\r\n");
      out.write("	          oAppRef: oEditors,\r\n");
      out.write("	          elPlaceHolder: \"content\", //textarea에서 지정한 id와 일치해야 합니다. \r\n");
      out.write("	          //SmartEditor2Skin.html 파일이 존재하는 경로\r\n");
      out.write("	          sSkinURI: \"/Kmarket/smarteditor/SmartEditor2Skin.html\",  \r\n");
      out.write("	          htParams : {\r\n");
      out.write("	              // 툴바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("	              bUseToolbar : true,             \r\n");
      out.write("	              // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("	              bUseVerticalResizer : true,     \r\n");
      out.write("	              // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("	              bUseModeChanger : true,         \r\n");
      out.write("	              fOnBeforeUnload : function(){               \r\n");
      out.write("	              }\r\n");
      out.write("	          }, \r\n");
      out.write("	      });\r\n");
      out.write("	      \r\n");
      out.write("	      //저장버튼 클릭시 form 전송\r\n");
      out.write("	      $(\"input[name=submit_board]\").click(function(){\r\n");
      out.write("	    	  if($('select[name=cate]').val() == ''){\r\n");
      out.write("	    		  alert('카테고리를 선택해주세요.');\r\n");
      out.write("	    		  return false;\r\n");
      out.write("	    	  }\r\n");
      out.write("	    	  \r\n");
      out.write("	          oEditors.getById[\"content\"].exec(\"UPDATE_CONTENTS_FIELD\", []);\r\n");
      out.write("	          $(\"input[name=submit_board]\").submit();\r\n");
      out.write("	      }); \r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("            <section id=\"admin-index\">\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <h3>자주묻는질문 작성</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        HOME > 고객센터 > <strong>자주묻는질문</strong>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <div id=\"admin_cs_write\">\r\n");
      out.write("                    <div class=\"admin_cs_write_div\">\r\n");
      out.write("                        <form action=\"/Kmarket/admin/cs/faq/write.do\" method=\"post\">   \r\n");
      out.write("	                        <input type=\"hidden\" name=\"hit\" value= \"0\">\r\n");
      out.write("	                        <table>\r\n");
      out.write("	                            <tbody>\r\n");
      out.write("	                                <tr>\r\n");
      out.write("	                                    <td>유형</td>\r\n");
      out.write("	                                    <td>\r\n");
      out.write("							                <select name=\"group\">\r\n");
      out.write("							                    <option value=\"회원\">회원</option>\r\n");
      out.write("							                    <option value=\"쿠폰/혜택/이벤트\">쿠폰/혜택/이벤트</option>\r\n");
      out.write("							                    <option value=\"주문/결제\">주문/결제</option>\r\n");
      out.write("							                    <option value=\"배송\">배송</option>\r\n");
      out.write("							                    <option value=\"취소/반품/교환\">취소/반품/교환</option>\r\n");
      out.write("							                    <option value=\"여행/숙박/항공\">여행/숙박/항공</option>\r\n");
      out.write("							                    <option value=\"안전거래\">안전거래</option>\r\n");
      out.write("							                </select>\r\n");
      out.write("							                <select name=\"cate\">\r\n");
      out.write("												<option value=\"\">2차 선택</option>\r\n");
      out.write("												<option value=\"가입\">가입</option>\r\n");
      out.write("												<option value=\"탈퇴\">탈퇴</option>\r\n");
      out.write("												<option value=\"회원정보\">회원정보</option>\r\n");
      out.write("												<option value=\"로그인\">로그인</option>\r\n");
      out.write("							                </select>\r\n");
      out.write("	                                    </td>\r\n");
      out.write("	                                </tr>\r\n");
      out.write("	                                <tr>\r\n");
      out.write("	                                    <td>제목</td>\r\n");
      out.write("	                                    <td><input type=\"text\" name=\"title\"></td>\r\n");
      out.write("	                                </tr>\r\n");
      out.write("	                                <tr>\r\n");
      out.write("	                                    <td>내용</td>\r\n");
      out.write("	                                    <td><input type=\"textarea\" name=\"content\" id=\"content\" rows=\"22\"></td>\r\n");
      out.write("	                                </tr>\r\n");
      out.write("	                            </tbody>\r\n");
      out.write("	                        </table>\r\n");
      out.write("		                    <div class=\"btn_right\">\r\n");
      out.write("	                            <button class=\"btn_gray goList\" >목록</button>\r\n");
      out.write("								<input class=\"btn_blue\" type=\"submit\" name=\"submit_board\" value=\"작성하기\">                    \r\n");
      out.write("                        	</div>\r\n");
      out.write("	                    </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/_admin/_footer.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}