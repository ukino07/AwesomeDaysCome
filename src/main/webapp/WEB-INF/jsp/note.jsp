<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
    <a href="/view/add">등록하기</a>
    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>날짜</th>
        </tr>
        <c:forEach items="${notes}" var="note">
            <tr>
                <td>${note.noteNo}</td>
                <td><a href="/notes/${note.noteNo}">${note.title}</a></td>
                <td>${note.userId}</td>
                <td>${note.updateAt}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
