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
        function save() {
            let bookNm = $("#bookNm").val();
            let bookPubls = $("#bookPubls").val();
            let bookCont = $("#bookCont").val();
            let bookCate = $("#bookCate").val();
            let data = {
                "bookNm":bookNm,
                "bookPubls":bookPubls,
                "bookCont":bookCont,
                "bookCate":bookCate
            }

            $("#baseForm").attr("action", "/ai/save.do");
            $("#baseForm").submit();
            // $.ajax({
            //     url: "/ai/save.do",
            //     type:"post",
            //     data: JSON.stringify(data),
            //     contentType:"application/json",
            //     success : function (data) {
            //         console.log(data)
            //     },
            //     error : function (req, statue, err) {
            //         console.log(err)
            //     }
            //
            // })

            console.log(bookNm)
            console.log(bookPubls)
        }
    </script>
</head>
<body>
<div class="body-wrapper">
    <div class="title">
        <h1>책 정보 작성</h1>
    </div>
    <form method="post" id="baseForm" name="baseForm">
        <div>
            <li>
                <label for="bookNm">책 제목</label>
                <input type="text" id="bookNm" name="bookNm">
            </li>
            <li>
                <label for="bookPubls">출판사</label>
                <input type="text" id="bookPubls" name="bookPubls">
            </li>
            <li>
                <label for="bookCont">책 내용</label>
                <textarea type="text" id="bookCont" name="bookCont" cols="50" rows="20"></textarea>
            </li>
            <li>
                <label for="bookCate">카테고리</label>
                <input type="text" id="bookCate" name="bookCate">
            </li>
        </div>
    </form>
    <div class="btn-wrap">
        <button onclick="save()">작성하기</button>
    </div>
</div>
</body>
</html>
