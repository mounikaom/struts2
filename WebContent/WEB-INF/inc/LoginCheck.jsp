<%--  <%@ taglib="/webwork" prefix="ww" %> --%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<ww:if test="#session.Login != 'true'">
<jsp:forward page="<%= request.getContextPath() %>/Login.jsp" />
</ww:if>