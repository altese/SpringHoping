<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후기 자세히</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.2/examples/navbar-fixed/">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/style.css">
<style type="text/css">
@import
	url('https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800')
	;

@import
	url('https://fonts.googleapis.com/css2?family=Ubuntu&display=swap');
</style>




<script type="text/javascript">
	function submit_event() {

		var selected = false;

		var radios = document.getElementsByName('rating');

	}

	function getstar(event) {
		document.getElementById('result').innerText = event.target.value;
	}
</script>
<style>
#myform fieldset {
	display: inline-block; /* 하위 별점 이미지들이 있는 영역만 자리를 차지함.*/
	border: 0; /* 필드셋 테두리 제거 */
}

#myform input[type=radio] {
	display: none; /* 라디오박스 감춤 */
}

#myform label {
	font-size: 1em; /* 이모지 크기 */
	color: transparent; /* 기존 이모지 컬러 제거 */
	text-shadow: 0 0 0 #f0f0f0; /* 새 이모지 색상 부여 */
}

#myform label:hover {
	text-shadow: 0 0 0 #FABCD7; /* 마우스 호버 */
}

#myform label:hover ~ label {
	text-shadow: 0 0 0 #FABCD7; /* 마우스 호버 뒤에오는 이모지들 */
}

#myform fieldset {
	display: inline-block; /* 하위 별점 이미지들이 있는 영역만 자리를 차지함.*/
	direction: rtl; /* 이모지 순서 반전 */
	border: 0; /* 필드셋 테두리 제거 */
}

#myform fieldset legend {
	text-align: left;
}
#myform input[type=radio]:checked ~ label{
    text-shadow: 0 0 0 #F72D85; /* 마우스 클릭 체크 */
}

</style>

</head>
<body>

	<!-- Header Start -->
	<%@ include file="Nav2.jsp"%>
	<!-- Header End -->
	<!-- Main Start -->
	<div class="container">
		<h2>후기</h2>
		<div class="d-flex justify-content-between">

		<form name="myform" id="myform" method="get" action="rWrite">
		
		<input type="hidden" name="regcamp_regSeq" value="${reviewRegcamp.regSeq}">
		<input type="hidden" name="regcamp_host_hSeq" value="${reviewRegcamp.host_hSeq}">
		
			<table>
				
				<tr>
					<th>별점</th>
					<td>
						
							<fieldset>
								<input type="radio" name="rvStar" value="5" id="rate1"><label for="rate1">⭐</label>
								<input type="radio" name="rvStar" value="4" id="rate2"><label for="rate2">⭐</label>
								<input type="radio" name="rvStar" value="3" id="rate3"><label for="rate3">⭐</label>
								<input type="radio" name="rvStar" value="2" id="rate4"><label for="rate4">⭐</label>
								<input type="radio" name="rvStar" value="1" id="rate5"><label for="rate5">⭐</label>
							</fieldset>
						
					</td>
				</tr>
				<tr>
					<th>작성아이디</th>
					<td><input type="text" name="rvCId" size="50" value="<%=session.getAttribute("CID") %>" readonly="readonly"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="rvCName" size="50" value="${reviewer.cName}"></td>
				</tr>
			
				<tr>
					<th>제목</th>
					<td><input type="text" name="rvTitle" size="50"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="rvContent" rows="10" cols="50"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="입력"></td>
				</tr>
			</table>
			</form>
		</div>
	</div>
	<!-- Foot -->
	<%@ include file="Foot.jsp"%>
	<!-- Foot End -->

</body>
</html>