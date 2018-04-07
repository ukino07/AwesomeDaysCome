<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
<a href="/view/edit/${note.noteNo}">수정하기</a>
<a href="/notes/delete/${note.noteNo}">삭제하기</a>
<table>
    <tr>
        <th>번호</th>
        <td>${note.noteNo}</td>
    </tr>
    <tr>
        <th>제목</th>
        <td>${note.title}</td>
    </tr>
    <tr>
        <th>글쓴이</th>
        <td>${note.userId}</td>
    </tr>
    <tr>
        <th>날짜</th>
        <td>${note.updateAt}</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>${note.contents}</td>
    </tr>
</table>
</body>
</html>
