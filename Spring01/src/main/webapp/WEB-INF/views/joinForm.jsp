<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section>
	<h1>학생등록</h1>
		<form id="joinForm" action="joinAction" method="post" onsubmit="return chk()">
			<table>
				<tr>
					<td>id</td>
					<td><input type="text" id="id" name="id"></td>
				</tr>
					<tr>
					<td>pass</td>
					<td><input type="text" id="pass" name="pass"></td>
				</tr>	
						
				<tr>
					<td>이름</td>
					<td><input type="text" id="name" name="name"></td>
				</tr>
				<tr>
					<td>전화</td>
					<td><input type="text" id="tel" name="tel"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" id="address" name="address"></td>
				</tr>
				<tr>
					<td>가입일자</td>
					<td><input type="text" id="joindate" name="joindate"></td>
				</tr>
			

			</table>
			<input type="submit" id="submit" value="등록신청">
		</form>



	</section>




</body>
<script>
function chk() {

	var id = document.getElementById('id').value;
	var pass = document.getElementById('pass').value;
	var name = document.getElementById('name').value;
	var tel = document.getElementById('tel').value;
	var address = document.getElementById('address').value;
	var joindate = document.getElementById('joindate').value;

	
	//id에 특수문자 1개이상, 8글자이상, 비밀번호는 반드시 존재	
		if ((id != '')&&(pass !='')&&(name !='')&&(tel!='')&&(address!='')&&(joindate!='')) {
			alert('등록성공');
			return true;
		} else {
			alert('입력하지 않은 정보가 있습니다.');
			return false;
		}
	} 

}
</script>
</html>