/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-12-30 00:17:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._005fcs._005fqna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1672359146940L));
    _jspx_dependants.put("jar:file:/C:/Users/java1/Desktop/Kmarket/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Kmarket/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/_cs/_header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./nav.jsp", out, false);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	$(function(){\r\n");
      out.write("		$('.btnWrite').click(function(){\r\n");
      out.write("			if($(\"select[name=type1]\").val() == ''){\r\n");
      out.write("				alert('유형1을 선택해주세요.');\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"select[name=type2]\").val() == ''){\r\n");
      out.write("				alert('유형2을 선택해주세요.');\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($('input[name=title]').val() == ''){\r\n");
      out.write("				alert('제목을 입력해주세요.');\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($('textarea[name=content]').val() == ''){\r\n");
      out.write("				alert('내용을 입력해주세요.');\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			document.getElementById('frm').submit();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(\"select[name=type1]\").change(function(){\r\n");
      out.write("			if($(this).val() == '회원'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='가입'>가입</option>\";\r\n");
      out.write("					tag += \"<option value='탈퇴'>탈퇴</option>\";\r\n");
      out.write("					tag += \"<option value='회원정보'>회원정보</option>\";\r\n");
      out.write("					tag += \"<option value='로그인'>로그인</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(this).val() == '쿠폰/이벤트'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='쿠폰/할인혜택'>쿠폰/할인혜택</option>\";\r\n");
      out.write("					tag += \"<option value='포인트'>포인트</option>\";\r\n");
      out.write("					tag += \"<option value='제휴'>제휴</option>\";\r\n");
      out.write("					tag += \"<option value='이벤트'>이벤트</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(this).val() == '주문/결제'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='상품'>상품</option>\";\r\n");
      out.write("					tag += \"<option value='결제'>결제</option>\";\r\n");
      out.write("					tag += \"<option value='구매내역'>구매내역</option>\";\r\n");
      out.write("					tag += \"<option value='영수증/증빙'>영수증/증빙</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(this).val() == '배송'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='배송상태/기간'>배송상태/기간</option>\";\r\n");
      out.write("					tag += \"<option value='배송정보확인/변경'>배송정보확인/변경</option>\";\r\n");
      out.write("					tag += \"<option value='해외배송'>해외배송</option>\";\r\n");
      out.write("					tag += \"<option value='당일배송'>당일배송</option>\";\r\n");
      out.write("					tag += \"<option value='해외직구'>해외직구</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(this).val() == '취소/반품/교환'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='반품신청/철회'>반품신청/철회</option>\";\r\n");
      out.write("					tag += \"<option value='반품정보확인/변경'>반품정보확인/변경</option>\";\r\n");
      out.write("					tag += \"<option value='교환 AS신청/철회'>교환 AS신청/철회</option>\";\r\n");
      out.write("					tag += \"<option value='교환정보확인/변경'>교환정보확인/변경</option>\";\r\n");
      out.write("					tag += \"<option value='취소신청/철회'>취소신청/철회</option>\";\r\n");
      out.write("					tag += \"<option value='취소확인/환불정보'>취소확인/환불정보</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(this).val() == '여행/숙박/항공'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='여행/숙박'>여행/숙박</option>\";\r\n");
      out.write("					tag += \"<option value='항공'>항공</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(this).val() == '안전거래'){\r\n");
      out.write("				$('select[name=type2]').empty();\r\n");
      out.write("				let tag = \"<option value=''>선택</option>\";\r\n");
      out.write("					tag += \"<option value='서비스 이용규칙 위반'>서비스 이용규칙 위반</option>\";\r\n");
      out.write("					tag += \"<option value='지식재산권침해'>지식재산권침해</option>\";\r\n");
      out.write("					tag += \"<option value='법령 및 정책위반 상품'>법령 및 정책위반 상품</option>\";\r\n");
      out.write("					tag += \"<option value='게시물 정책위반'>게시물 정책위반</option>\";\r\n");
      out.write("					tag += \"<option value='직거래/외부거래유도'>직거래/외부거래유도</option>\";\r\n");
      out.write("					tag += \"<option value='표시광고'>표시광고</option>\";\r\n");
      out.write("					tag += \"<option value='청소년 위해상품/이미지'>청소년 위해상품/이미지</option>\";\r\n");
      out.write("				$('select[name=type2]').append(tag);\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("        <article class=\"cs_information\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <form action=\"/Kmarket/cs/qna/write.do\" method=\"post\" id=\"frm\">\r\n");
      out.write("                <input type=\"hidden\" name=\"uid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessUser.uid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>문의유형</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <select name=\"type1\" id=\"type1\">\r\n");
      out.write("                                    <option value=\"\">선택</option>\r\n");
      out.write("                                    <option value=\"회원\">회원</option>\r\n");
      out.write("                                    <option value=\"쿠폰/이벤트\">쿠폰/이벤트</option>\r\n");
      out.write("                                    <option value=\"주문/결제\">주문/결제</option>\r\n");
      out.write("                                    <option value=\"배송\">배송</option>\r\n");
      out.write("                                    <option value=\"취소/반품/교환\">취소/반품/교환</option>\r\n");
      out.write("                                    <option value=\"여행/숙박/항공\">여행/숙박/항공</option>\r\n");
      out.write("                                    <option value=\"안전거래\">안전거래</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <select name=\"type2\" id=\"type2\">\r\n");
      out.write("                                    <option value=\"\">선택</option>\r\n");
      out.write("                                    <option value=\"가입\">가입</option>\r\n");
      out.write("                                    <option value=\"탈퇴\">탈퇴</option>\r\n");
      out.write("                                    <option value=\"회원정보\">회원정보</option>\r\n");
      out.write("                                    <option value=\"로그인\">로그인</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>문의제목</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"title\" placeholder=\"제목을 입력하세요.\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>문의내용</td>\r\n");
      out.write("                            <td><textarea name=\"content\" placeholder=\"내용을 입력하세요.\"></textarea></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </form>\r\n");
      out.write("                <a href=\"/Kmarket/cs/qna/list.do?group=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btnCancel\">취소하기</a>\r\n");
      out.write("                <a href=\"#\" class=\"btn btnWrite\">등록하기</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </article>\r\n");
      out.write("    </div>\r\n");
      out.write("</main>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/_cs/_footer.jsp", out, false);
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
