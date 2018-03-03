<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

    <form id="loginForm" action="/login" title="" method="post">
        <div>
            <label for="id">ID</label>
            <input type="text" id="id" name="id" >
            <label for="pw">PW: </label>
            <input type="password" id="pw" name="pw" />
            <div>
                <input type="submit" id="loginButton"  name="loginButton" value="LOGIN">
            </div>
        </div>
        <div>
            <label for="result">result: </label>
            <input type="text" id="result" value="" />
        </div>
    </form>
</body>

</html>