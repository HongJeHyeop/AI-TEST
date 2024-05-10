<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <title>Title</title>

    <script>
        function fnDelete(id) {
            let data = {
                bookId :id,
                status : 'D'
            }

            $.ajax({
                url: "/ai/delete.do/" + id +"?status=D",
                type: "post",
                contentType: "application/json; charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data.result == 'success') {
                        alert(data.message);
                        location.href = '/';
                    } else {
                        alert("삭제실패!!")
                    }
                },
                error: function (req, statue, err) {
                    console.log(err)
                }
            })

            }
            function fnUpdate(id) {
                location.href = '/ai/write.do?id=' + id;

            }
            function fnSearch() {
                let txt = $("#searchEmbed").val();
                $.ajax({
                    url: "https://api.openai.com/v1/embeddings",
                    type:"post",
                    data: {
                      input: "test",
                      model: "text-embedding-3-small"
                    },
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader("Authorization", "");
                        xhr.setRequestHeader("Content-Type", "application/json");
                    },
                    success:function (data){
                        console.log(data.data.data[0].embedding)
                    },
                    error:function (err) {
                        console.log(err)
                    }
                })
            }
    </script>
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
        <label for="searchEmbed">검색어입력</label>
        <input type="text" id="searchEmbed" name="searchEmbed">
        <div class="btn-wrap">
            <button onclick="fnSearch()">검색</button>
        </div>
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
               <td>
                   <button onclick="fnUpdate(${item.bookId})">수정</button>
               </td>
               <td>
                   <button onclick="fnDelete(${item.bookId})">삭제</button>
               </td>
           </tr>
           </c:forEach>
           </tbody>
       </table>
    </div>
    <div class="btn-wrap">
        <button onclick="location.href='/ai/write.do'">작성하기</button>
    </div>
</div>
</body>
</html>
