<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
<form id="editForm" action="/notes/edit/${note.noteNo}" title="" method="post">
    <div>
        <label for="noteNo">번호</label>
        <input type="text" id="noteNo" name="noteNo" value="${note.noteNo}" disabled/>
        <label for="title">제목</label>
        <input type="text" id="title" name="title" value="${note.title}">
        <label for="contents">내용: </label>
        <input type="textarea" id="contents" name="contents" value="${note.contents}"/>
        <div>
            <input type="submit" id="editButton" name="editButton" value="EDIT">
        </div>
    </div>
</form>
</body>
</html>
