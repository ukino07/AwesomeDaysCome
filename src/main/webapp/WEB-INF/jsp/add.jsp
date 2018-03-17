<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
    <form id="addForm" action="/addNotes" title="" method="post">
        <div>
            <label for="title">제목</label>
            <input type="text" id="title" name="title" >
            <label for="contents">내용: </label>
            <input type="textarea" id="contents" name="contents" />
            <div>
                <input type="submit" id="addButton"  name="addButton" value="ADD">
            </div>
        </div>
    </form>
</body>
</html>
