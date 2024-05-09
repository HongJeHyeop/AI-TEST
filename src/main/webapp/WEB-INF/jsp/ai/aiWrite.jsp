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
            let bookId = $("#bookId").val();
            let bookNm = $("#bookNm").val();
            let bookPubls = $("#bookPubls").val();
            let bookCont = $("#bookCont").val();
            let bookCate = $("#bookCate").val();
            let status = $("#status").val();
            let data = {
                "bookId":bookId,
                "bookNm":bookNm,
                "bookPubls":bookPubls,
                "bookCont":bookCont
            }
            console.log(data)
            // fetch("/ai/save.do", {
            //     method: "POST",
            //     headers: {
            //         "Content-Type": "application/json"
            //     },
            //     body: JSON.stringify(data)
            // }).then(data => data.text())
            //     .then(data => {
            //         console.log(data)
            //     })

            $.ajax({
                url: "/ai/save.do?status=" + status,
                type:"post",
                data: JSON.stringify(data),
                contentType:"application/json; charset=UTF-8",
                dataType:"json",
                success : function (data) {
                    if (data.result == 'success') {
                        alert(data.message);
                        location.href = '/';
                    } else {
                        alert("저장실패!!")
                    }
                },
                error : function (req, statue, err) {
                    console.log(err)
                }

            })

        }


    </script>
</head>
<body>
<div class="body-wrapper">
    <div class="title">
        <h1>책 정보 작성</h1>
    </div>
    <form method="post" id="baseForm" name="baseForm">
        <input type="hidden" id="status" name="status" value="${not empty resultVO ? "U":"C"}">
        <input type="hidden" id="bookId" name="bookId" value="${resultVO.bookId}">
        <div>
            <li>
                <label for="bookNm">책 제목</label>
                <input type="text" id="bookNm" name="bookNm" value="${resultVO.bookNm}">
            </li>
            <li>
                <label for="bookPubls">출판사</label>
                <input type="text" id="bookPubls" name="bookPubls" value="${resultVO.bookPubls}">
            </li>
            <li>
                <label for="bookCont">책 내용</label>
                <textarea type="text" id="bookCont" name="bookCont" cols="50" rows="20">${resultVO.bookCont}</textarea>
            </li>
            <li>
                <label for="bookCate">카테고리</label>
                <input type="text" id="bookCate" name="bookCate" value="">
            </li>
        </div>
    </form>
    <div class="btn-wrap">
        <button onclick="save()">작성하기</button>
    </div>
</div>
</body>
</html>
