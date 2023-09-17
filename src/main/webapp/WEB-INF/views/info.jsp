<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>FORNUAL-회사소개</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="preconnect"
	href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect"
	href="<c:url value="https://fonts.gstatic.com" />" crossorigin>
<link
	href="<c:url value="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@200&display=swap" />"
	rel="stylesheet" />
<link rel="stylesheet"
	href="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css"/>">

<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
	type="text/css">
<link rel="preconnect"
	href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect" href="<c:url value="https://fonts.gstatic.com"/>"
	crossorigin>
<link
	href="<c:url value="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"/>"
	rel="stylesheet">
<link rel="preconnect"
	href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect" href="<c:url value="https://fonts.gstatic.com"/>"
	crossorigin>
<link
	href="<c:url value="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap"/>
   rel="stylesheet">


<link
	href="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"/>"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">

<link rel="stylesheet" id="montserrat-css"
	href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i"/>">
<link rel="stylesheet" id="open-sans-css"
	href="<c:url value="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i"/>">

<link rel="stylesheet" id="animate-css"
	href="<c:url value="/css/animate.min.css?ver=3.7.2"/> type="
	text/css"
   media="all">
<link rel="stylesheet" id="font-awesome-css"
	href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>
   type="
	text/css" media="all">
<link rel="stylesheet" id="bootstrap-css"
	href="<c:url value="/css/bootstrap.min.css?ver=4.6.0"/>"
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
	href="<c:url value="css/lana-pet-icon.min.css?ver=1.0.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css"
	href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css"
	href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>"
	type="text/css" media="print">

<style type="text/css">
.profile {
	display: block;
	width: 100%;
	height: 100%;
	padding-left: 30px;
	padding-right: 30px;
}

.dropdown:hover .dropdown-menu {
	display: block;
}

p #logo {
	width: 400px;
	height: 70px;
}

#logo a {
	font-family: 'Permanent Marker', cursive;
	padding-left: 30px;
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

.name {
	font-family: 'Permanent Marker', cursive;
	sssss
}

@font-face {
	font-family: 'HakgyoansimWoojuR';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2307-2@1.0/HakgyoansimWoojuR.woff2')
		format('woff2');
	font-weight: normal;
	font-style: normal;
}

#contentfont {
	font-family: 'HakgyoansimWoojuR';
	font-weight: normal;
	font-style: normal;
}

#itemimg {
	transition: all 0.2s linear;
	max-width: 100%;
}

.imgbox {
	overflow: hidden;
}

.imgbox:hover img {
	transform: scale(1.1);
}

.card-img-top a:hover {
	transition: all 0.4s linear;
	transform: scale(1.2);
}

/*유튜브에 관련한 css */
#youtube .swiper-container {
	overflow: hidden;
}

#youtube .swiper-slide {
	width: 376px; /* iframe 너비를 고정 */
	display: inline-block; /* 인라인 블록으로 정렬 */
	margin-right: 10px; /* 우측 마진 추가 (간격 조절) */
}

#youtube .swiper-slide iframe {
	width: 100%;
	height: 210px; /* iframe의 높이를 고정 */
	border: none;
	margin: 0 auto; /* 수평 가운데 정렬 */
	display: block; /* 블록 요소로 변경하여 가운데 정렬 적용 */
}

.card-img-top i {
	font-size: 5rem; /* 아이콘 크기 조절 */
	color: #ffff; /* 기본 색상 */
	transition: font-size 0.3s, color 0.3s; /* 변화 효과 지정 */
}

/* 클릭시 아이콘 스타일 변경 */
.card-img-top a:hover i {
	font-size: 6rem; /* 클릭시 아이콘 크기 확대 */
	color: #ff8a00;
	!
	important /* 클릭시 아이콘 색상 변경 */
}

/* div 영역 크기 고정 */
.card-img-top {
	width: 100%; /* 원하는 너비 값으로 변경 */
	height: 96px; /* 원하는 높이 값으로 변경 */
}

.img-container img {
	border-radius: 10%;
}

/* 메인 수정 */
</style>
</head>

<body class="home page page-template-template-lana-editor">
	<jsp:include page="header.jsp" />
	<main>
		<div id="our-pets-container"
			class="container-fluid bg-light-orange section-py--large">
			<div style="width:1500px !important; margin: 0 auto;">
				<div class="row justify-content-center">
					<div class="col-12 text-center bg-light-orange">
						<h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">FORNUAL</h1>
						<p data-scroll-animate="fadeInUp">회사소개</p>
						<div class="lana-hr lana-hr-4 border-primary mt-4"
							data-scroll-animate="zoomIn"></div>
					</div>
					<br>
					<p style="text-align: left; font-size: 22px;">&nbsp;&nbsp;[회사 위치]</p>
					<br>
					
					<div class="row">
						<div class="col-8">
							<div id="map" style="width:950px; height: 600px; text-align: center;"></div>
							<script type="text/javascript"
								src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b8e41eee0cc466dfb4360a1b5f92e9a7"></script>
							<script>
							var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
						    mapOption = { 
						        center: new kakao.maps.LatLng(37.498818792627915, 127.03180595457835), // 지도의 중심좌표
						        level: 3 // 지도의 확대 레벨
						    };

						var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

						// 마커가 표시될 위치입니다 
						var markerPosition  = new kakao.maps.LatLng(37.498818792627915, 127.03180595457835 ); 

						// 마커를 생성합니다
						var marker = new kakao.maps.Marker({
						    position: markerPosition
						});

						// 마커가 지도 위에 표시되도록 설정합니다
						marker.setMap(map);
						</script>
						</div>
						
						<div class="col-4" style="text-align: left;">
							<p style="font-size: 48px; font-weight: bold; " data-scroll-animate="fadeInDown">CONTACT</p>
							<hr>
							<p style="font-size: 27px;font-family: 'HakgyoansimWoojuR';" >서울특별시 강남구 테헤란로 삼원타워</p>
							<p style="font-size: 27px;font-family: 'HakgyoansimWoojuR';">대표번호 02-1111-1111</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="footer.jsp" />


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
	<!-- 카카오 지도 라이브러리 -->	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=LIBRARY"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=services,clusterer,drawing"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=services"></script>

</body>