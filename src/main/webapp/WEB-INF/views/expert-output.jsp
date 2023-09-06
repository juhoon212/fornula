<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>전문가페이지-전문가의정보</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" id="montserrat-css" href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
<link rel="stylesheet" id="open-sans-css" href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

<link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
<link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css" media="all">
<link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver =4.6.0"/>" type="text/css" media="all">
<link rel="stylesheet" id="smartmenus-bootstrap-css" href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>" type="text/css" media="all">
<link rel="stylesheet" id="swiper-css" href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css" media="all">
<link rel="stylesheet" id="magnific-popup-css" href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>" type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-icon-css" href="<c:url value="/css/lana-pet-icon.min.css?ver=1.0.0"/>" type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css" href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>" type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css" href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>" type="text/css" media="print">

<style>
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

h3 {
	font-size: 20px;
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

a:link {
	color: #212121;
}

a:visited {
	color: #212121;
}

a {
	color: #ff8a00;
	text-decoration: none;
	background-color: transparent;
}
</style>
</head>
<body class="archive post-type-archive post-type-archive-lana_story">
	<jsp:include page="header.jsp" />

	<main class="main container">
		<div class="row">
			<div class="col-12 col-lg-8">
				<div class="widget">
					<form class="story-posts" id="content" action="/expert/input" method="post">
						<label style="color: #fdbb42; font-size: 24px; margin-bottom: 30px;">포트폴리오</label>
						<div>
							<div class="row row-cols-1 row-cols-md-3 g-4" style="width:">
								<!-- 나머지 포스트 요소들... -->
							</div>
						</div>
						<div class="info" id="info__category">
							<br>
							<p style="font-size: 20px;">전문가 정보</p>
							<div id="category-flex">
								<!-- 여기서 expertIdx는 현재 세션에 로그인한 전문가의 expertIdx임 -->
								<input class="box" type="text" name="expertIdx" placeholder="전문가번호" value="${originalExpert.expertIdx }" readonly />
							</div>
						</div>
						<div class="info" id="info__category">
							<div id="category-flex">
								<input class="box" type="text" name="phone" placeholder="전화번호" value="${originalExpert.phone }" readonly />
							</div>
						</div>
						<div class="info" id="info__category">
							<div id="category-flex">

								<input class="box" type="text" name="interest" placeholder="기존 카테고리:" value="${originalExpert.interest}" readonly />

								<!-- 여백 어케주드라 -->
								<input class="box" name=career type="text" placeholder="연차:" value="경력 : ${originalExpert.career }" readonly />
							</div>
						</div>
						<div class="info" id="info__category">
							<div id="category-flex">
								<input class="box" type="text" id="companyOneInput" name="companyOne" placeholder="근무지1" value="${originalExpert.companyOne }" readonly />
								<!-- 여백 어케주드라 -->
								<input class="box" type="text" id="companyTwoInput" name="companyTwo" placeholder="근무지2" value="${originalExpert.companyTwo }" readonly />
								<!-- 여백 어케주드라 -->
								<input class="box" type="text" id="companyThreeInput" name="companyThree" placeholder="근무지3" value="${originalExpert.companyThree }" readonly />
							</div>
						</div>
						<div>
							<input class="box" id="introduceInput" name="introduce" placeholder="자기소개" value="${originalExpert.introduce }" readonly></input>
						</div>
						<div>
							<br>
							<p>전문가의 포트폴리오</p>
							<br>
							<embed src="<c:url value="/images/portfolio/${originalExpert.expertfileName }"/>" width="100%" height="500px" type="application/pdf">
						</div>
				</div>
				</form>
			</div>

			<div class="col-12 col-lg-4 mt-4 mt-lg-0">
				<div class="widget-sidebar story-sidebar">
					<div id="button">
						<img src="<c:url value="/pictures/placeholder/profile.png"/>" class="img-fluid rounded-circle mr-1 w-auto" alt="Author">
					</div>
					<div id="button">
						<a href="<c:url value="#"/>" class="tag-cloud-link" aria-label="idbutton">${loginMember.id}</a>
					</div>
					<div class="widget widget_tag_cloud">
						<div class="tagcloud">
							<div id="button">
								<a href="/mypageInfo" class="tag-cloud-link" aria-label="admin change button">일반회원으로 전환</a>
							</div>
							<div class="row">
								<div class="widget" style="text-align: left; padding-left: 20px;">
									<h3 class="widget-title">포트폴리오</h3>
									<ul>
										<li><a href="<c:url value="/expert/input"/>">전문가 정보</a></li>

										<li><a href="<c:url value="/expert/sale"/>">판매 관리</a></li>

										<li><a href="<c:url value="/expert/output"/>">포트폴리오</a></li>
										<li><a href="<c:url value="/expert/item"/>">상품 등록</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="footer.jsp" />

	<script type="text/javascript" src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>
	<script>
		function convertInterestToString(interestValue) {
			switch (interestValue) {
			case '1':
				return '그래픽';
			case '2':
				return '제품';
			case '3':
				return '영어';
			case '4':
				return '중국어';
			case '5':
				return '헤어 메이크업';
			case '6':
				return '제품 홍보 사진';
			case '7':
				return '사업자';
			case '8':
				return '개인';
			case '9':
				return 'SNS 홍보';
			case '10':
				return '해외 마케팅';
			default:
				return '알 수 없음';
			}
		}

		var interestValue = "${originalExpert.interest}";
		var convertedInterest = convertInterestToString(interestValue);

		document.querySelector("#info__category input[name='interest']").value = convertedInterest;
	</script>
</body>
</html>