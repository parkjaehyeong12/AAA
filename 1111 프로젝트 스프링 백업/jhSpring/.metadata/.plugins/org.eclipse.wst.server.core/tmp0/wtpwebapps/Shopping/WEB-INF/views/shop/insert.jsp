<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1>회원가입</h1>

<form action="InsertOk" method="post">
	<label for="id">ID:</label> <input type="text" id="id" name="id" /><br />
	<label for="pw">비밀번호</label><input type="password" id="pw" name="pw" /><br />
	<label for="address">주소:</label> <input type="text" id="address" name="address"/> <br />
	<label>Phone</label>
	<select name="phone">
		<option value="010">010</option>
		<option value="011">011</option>
		<option value="007">007</option>
	</select> <!-- 010,011,007 중 하나 선택 -->
	<label>-</label>
	<input type="text" name="phone2" /> <label>-</label>
	<input type="text" name="phone3" /> <br />
</form>

</body>
</html>