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
<%--<c:forEach var="item" items="${list}" varStatus="status">--%>
<%--    <p>${item.bookNm}</p>--%>
<%--    <p>${item.bookCont}</p>--%>
<%--    <p>${item.bookPubls}</p>--%>
<%--    <p>${item.crtDtTxt}</p>--%>
<%--</c:forEach>--%>

<div id="body-wrapper">
    <div class="title">
        <h1>Embedding Ai Test</h1>
    </div>
    <div class="search-div">

    </div>
    <div class="container">
       <table>
           <thead>
           <th>책이름</th>
           <th>출판사</th>
           </thead>
           <tbody>
           <c:forEach var="item" items="${list}" varStatus="status">
           <tr>
               <td>${item.bookNm}</td>
               <td>${item.bookPubls}</td>
           </tr>
           </c:forEach>
           </tbody>
       </table>
    </div>
</div>
</body>
</html>
