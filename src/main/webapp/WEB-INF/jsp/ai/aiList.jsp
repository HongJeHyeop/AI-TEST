<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:out value="${list}"/>--%>
<c:forEach var="item" items="${list}" varStatus="status">
    <p>${item.bookNm}</p>
    <p>${item.bookCont}</p>
    <p>${item.bookPubls}</p>
    <p>${item.crtDtTxt}</p>
</c:forEach>

</body>
</html>
