Username : ${sessionScope.userId} 님 : D

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