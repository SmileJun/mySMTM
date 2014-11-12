<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<fieldset>
			<legend>개인 정보 입력</legend>
			이름 : <input type="text" name="memberName" style="width: 100px;"><br>
			성별 :
			<input type="radio" name="memberSex" value="man">남
			<input type="radio" name="memberSex" value="woman">여<br>
			주민등록번호 : <input type="text" name="memberRegNum" style="width: 120px;"><br>
			전화번호 : <input type="text" name="memberPhoneNum" style="width: 90px;"><br>
		</fieldset>
		<fieldset>
			<legend>계정 정보</legend>
			아이디 : <input type="text" name="memberId" style="width: 60px;"><br>
			닉네임 : <input type="text" name="memberNickName" style="width: 60px;"><br>
			비밀번호 : <input type="password" name="password" style="width: 80px;"><br>
			비밀번호 확인 : <input type="password" name="passwordCheck" style="width: 80px;"><br>
		</fieldset>
		<input type="submit" value="회원가입">
		<input type="reset" value="초기화">
	</form>
</body>
</html>