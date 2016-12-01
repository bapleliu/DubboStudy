<%--
  Created by IntelliJ IDEA.
  User: hanqunfeng
  Date: 2016/11/29
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../../common/includes.jsp"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>demo view</title>
</head>
<body>
${demo}
${demo.id} ##${demo.name} ## ${demo.age}
${_contextPath}
<c:if test="${! empty demo}">
    1234
</c:if>
<c:if test="${empty demo}">
    5678
</c:if>
<p></p>
<c:if test="${! empty list}">
    <c:forEach items="${list}" var="obj">
        ${obj.id} || ${obj.name} || ${obj.age} <br>
    </c:forEach>
</c:if>
</body>
</html>
