<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>전문가페이지-전문가의정보</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" id="montserrat-css"
	href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
<link rel="stylesheet" id="open-sans-css"
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

<link rel="stylesheet" id="animate-css"
	href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css"
	media="all">
<link rel="stylesheet" id="font-awesome-css"
	href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="bootstrap-css"
	href="<c:url value="/css/bootstrap.min.css?ver =4.6.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="smartmenus-bootstrap-css"
	href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="swiper-css"
	href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css"
	media="all">
<link rel="stylesheet" id="magnific-popup-css"
	href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-icon-css"
	href="<c:url value="/css/lana-pet-icon.min.css?ver=1.0.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css"
	href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css"
	href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>"
	type="text/css" media="print">

<style>
#button {
	display: flex;
	justify-content: center; align-items center;
	padding-bottom: 2em;
}

main {
	width: 100%;
	height: 100%;
	border: 30px;
}

.container {
	margin: 0 auto;
	text-align: center;
	padding-top: 40px;
}

p #logo {
	width: 400px;
	height: 70px;
}

#logo a {
	font-family: 'Permanent Marker', cursive;
	padding-left: 20px;
	padding-bottom: 0px;
	padding-top: 0px;
	margin: 0 auto;
	font-size: 2.5em;
	text-align: center;
}

.navbar {
	text-align: center;
}

#lana-navbar {
	text-align: left;
}

select {
	background: #ffff;
}

.story-posts {
	width: 100%;
	height: 85%;
}

table {
	width: 100%;
	padding: 0px 10px;
}

tr th {
	width: 50%;
	border-right: 1px solid #ff8a00;
}

tr td {
	padding: 0px 30px;
}

#list {
	padding-left: 30px;
}

a:link {
	color: #212121;
}

a:visited {
	color: #212121;
}

#button {
	display: flex;
	justify-content: center; align-items center;
	padding-bottom: 2em;
}

.info {
	margin-bottom: 22px;
}

/* 박스*/
.box {
	width: 100%;
	height: 50px;
	box-sizing: border-box;
	padding: 5px 0 5px 15px;
	border-radius: 4px;
	border: 1px solid #d9d6d6;
	color: #383838;
	font-weight: 400;
}

.box::placeholder {
	color: #a0a0a0;
}

.info#info__id #id-input {
	position: relative;
}

.info#info__id button {
	position: absolute;
	width: 90px;
	height: 40px;
	top: 0;
	bottom: 0;
	right: 5px;
	margin: auto 0;
	border-radius: 3px;
	font-size: 15px;
}

h3 {
	font-size: 20px;
}

#contentfont {
	font-family: 'HakgyoansimWoojuR';
	font-weight: normal;
	font-style: normal;
}

/* 카테고리 */
.info#info__category #category-flex {
	display: flex;
}

.info#info__category select {
	margin-left: 7px;
	color: #a0a0a0;
}

.info#info__category select:first-child {
	margin-left: 0px;
}

.info#info__category select::-webkit-scrollbar {
	width: 10px;
}

.info#info__category select::-webkit-scrollbar-thumb {
	background-color: #b6b6b6;
	border-radius: 3px;
}

.info#info__category select::-webkit-scrollbar-track {
	background-color: #ebe9e9;
	border-radius: 6px;
}

.story-posts {
	width: 100%;
	height: 100%;
}

a:link {
	color: #212121;
}

a:visited {
	color: #212121;
}

.error {
	color: red;
}

#phoneMsg {
	color: red;
}

.label {
	text-align: left;
	margin: 0 auto;
}

@font-face {
	font-family: 'HakgyoansimWoojuR';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2307-2@1.0/HakgyoansimWoojuR.woff2')
		format('woff2');
	font-weight: normal;
	font-style: normal;
}
</style>
</head>
<body class="archive post-type-archive post-type-archive-lana_story">
	<jsp:include page="header.jsp" />
	<main class="main container">
		<form method="post" enctype="multipart/form-data"
			action="<c:url value="/expert/input"/>" id="submitForm">
			<sec:csrfInput />
			<!-- 토큰 생성  -->
			<div class="row">
				<div class="col-12 col-lg-8">
					<div class="widget">
						<div class="story-posts">
							<div class="info" id="info__category">
								<div style="text-align: left;">
									<br> <label
										style="color: #fdbb42; font-size: 24px; margin-bottom: 30px;">전문가
										정보</label>
								</div>
								<div>
									<p class="label">전문가 번호</p>
								</div>
								<div id="category-flex">
									<!-- 여기서 expertIdx는 현재 세션에 로그인한 전문가의 expertIdx임 -->
									<input class="box" type="text" name="expertIdx"
										placeholder="전문가번호" value="${originalExpert.expertIdx }"
										readonly />
								</div>
							</div>
							<div class="info" id="info__category">
								<div>
									<p class="label">전화번호</p>
								</div>
								<div id="category-flex">
									<input name="phone" id="phone" class="box"
										oninput="autoHypen(this)" maxlength="13"
										value="${originalExpert.phone }" placeholder="숫자로 입력해주세요." />
								</div>
								<p class="error" id="phoneMsg"></p>
							</div>
							<div>
								<p class="label">자기소개</p>
							</div>
							<div id="category-flex">
								<div id="category-flex">
									<textarea class="box" name="introduce" maxlength="500"
										style="resize: none; height: 300px; font-family: 'HakgyoansimWoojuR';"
										placeholder="자기소개를 입력해주세요.">${originalExpert.introduce }</textarea>
								</div>
							</div>
							<div>
								<p class="label">직무 및 연차</p>
							</div>
							<div class="info" id="info__category">
								<div id="category-flex">
									<select class="box" id="interestSelect" name="interest">
										<option disabled selected>기존 카테고리:
											<c:choose>
												<c:when test="${originalExpert.interest eq '1'}">그래픽</c:when>
												<c:when test="${originalExpert.interest eq '2'}">제품</c:when>
												<c:when test="${originalExpert.interest eq '3'}">영어</c:when>
												<c:when test="${originalExpert.interest eq '4'}">중국어</c:when>
												<c:when test="${originalExpert.interest eq '5'}">헤어 메이크업</c:when>
												<c:when test="${originalExpert.interest eq '6'}">제품 홍보 사진</c:when>
												<c:when test="${originalExpert.interest eq '7'}">사업자</c:when>
												<c:when test="${originalExpert.interest eq '8'}">개인</c:when>
												<c:when test="${originalExpert.interest eq '9'}">SNS 홍보</c:when>
												<c:when test="${originalExpert.interest eq '10'}">해외 마케팅</c:when>
												<c:otherwise>기타</c:otherwise>
											</c:choose>
										</option>
										<option disabled style="color: orange; font-size: 20px">디자인</option>
										<option value="1">그래픽</option>
										<option value="2">제품</option>
										<option disabled style="color: orange; font-size: 20px">번역</option>
										<option value="3">영어</option>
										<option value="4">중국어</option>
										<option disabled style="color: orange; font-size: 20px">사진
											편집</option>
										<option value="5">헤어 메이크업</option>
										<option value="6">제품 홍보 사진</option>
										<option disabled style="color: orange; font-size: 20px">세무</option>
										<option value="7">사업자</option>
										<option value="8">개인</option>
										<option disabled style="color: orange; font-size: 20px">마케팅</option>
										<option value="9">SNS 홍보</option>
										<option value="10">해외 마케팅</option>
									</select> <input class="box" name=career type="text" placeholder="연차:"
										value="${originalExpert.career }" />
								</div>
							</div>
							<div>
								<p class="label">경력 사항</p>
							</div>
							<div class="info" id="info__category">
								<div id="category-flex">
									<input class="box" type="text" id="companyOneInput"
										name="companyOne" placeholder="근무지1"
										value="${originalExpert.companyOne }" /> <input class="box"
										type="text" id="companyTwoInput" name="companyTwo"
										placeholder="근무지2" value="${originalExpert.companyTwo }" /> <input
										class="box" type="text" id="companyThreeInput"
										name="companyThree" placeholder="근무지3"
										value="${originalExpert.companyThree }" />
								</div>
							</div>
							<div>
								<section id="upload">
									<div>
										<p class="label">포트폴리오</p>
									</div>
									<input class="box" name="expertfileName" readonly="readonly"
										value="${originalExpert.expertfileName}" /> <input
										class="form-control" type="file" id="portfolioFileInput"
										accept=".pdf" name="uploadFile"
										value="${originalExpert.expertfileName}" /> <span
										style="color: gray; font-size: 15px; padding: 0px 25px;">[PDF
										파일로 업로드 해주세요.]</span><br>
									<p style="color: red;" id="errorMessage">${message}</p>
								</section>
							</div>
							<hr>
							<br>
							<div id="button" style="padding: 5px 10px;">
								<button class="btn btn-primary " onclick="submitButton();"
									type="submit">수정완료</button>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 col-lg-4 mt-4 mt-lg-0">
					<div class="widget-sidebar story-sidebar">
						<div id="button">
							<img src="<c:url value="/pictures/placeholder/profile.png"/>"
								class="img-fluid rounded-circle mr-1 w-auto" alt="Author">
						</div>
						<div id="button">
							<a href="#" class="tag-cloud-link" aria-label="idbutton">${loginMember.id}</a>
						</div>
						<div class="widget widget_tag_cloud">
							<div class="tagcloud">
								<div id="button">
									<a href="<c:url value="/mypageInfo"/>" class="tag-cloud-link"
										aria-label="admin change button">일반회원으로 전환</a>
								</div>
								<div class="row">
									<div class="widget" style="text-align: left;">
										<h3 class="widget-title">전문가 정보</h3>
										<ul class="list-unstyled">
											<li><a href="<c:url value="/expert/input"/>">전문가 정보</a></li>
											<li><a href="<c:url value="/expert/sales"/>">판매 관리</a></li>
											<li><a href="<c:url value="/expert/board"/>">상품 관리</a></li>
											<li><a href="<c:url value="/expert/item"/>">상품 등록</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
		<jsp:include page="footer.jsp" />
	</main>

	<script type="text/javascript"
		src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>
	<script type="text/javascript">
	$(document).on("keyup", "#phone", function() {
	    $(this).val($(this).val().replace(/[^0-9]/g, "").replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/, "$1-$2-$3" ).replace("--", "-")); 
	});
	function autoHypen(e){
	    if(e.value.length>13){
		e.value=e.value.slice(0,13);	
	    }
	}
	</script>
	<script type="text/javascript">
		$("#submitForm").submit(function() {
			var submitResult = true;
			$(".error").hide();
		
		var phoneReg = ^\\d{3}-\\d{3,4}-\\d{4}$;
			if ($("#phone").val() == "") {
				$("#phoneMsg").html("전화번호를 입력해 주세요.");
				submitResult = false;
			} else if (!phoneReg.test($("#phone").val())) {
				$("#phoneMsg").html("전화번호를 형식에 맞게 입력해 주세요.");
				submitResult = false;
			}
			$(".error").show();
			return submitResult;
		});
	</script>


	<script>
		document.addEventListener("DOMContentLoaded", function() {
			var originalInterest = "${originalExpert.interest}";
			var select = document.getElementById("interestSelect");

			for (var i = 0; i < select.options.length; i++) {
				if (select.options[i].value === originalInterest) {
					select.options[i].selected = true;
					break;
				}
			}
		});
	</script>
</body>
</html>