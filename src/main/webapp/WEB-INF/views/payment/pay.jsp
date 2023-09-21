<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결제페이지</h1>
	<hr>
	<h3>결제 관련 제품 정보 출력</h3>
	<button type="button" id="kakao">간편결제(카카오페이)</button>
	<button type="button" id="inicis">일반결제(KG이니시스)</button>
	
	<script type="text/javascript">
	var csrdHeadName="${_csrf.headerName}"
	var csrTokenValue="${_csrf.token}";
	
	$(document).ajaxSend(function(e, xhr) {
		xhr.setReqestHeader(csrdHeadName,csrTokenValue );
	});
	
	
	
	
	</script>
</body>
</html>