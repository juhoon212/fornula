<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>마이페이지-나의정보</title>

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




</head>
<style>
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

#button {
	display: flex;
	justify-content: center; align-items center;
	padding-bottom: 2em;
}

#introduce {
	width: 100%;;
	height: 155px;;
	border: none;
	resize: none;
	border: 1px solid #d9d6d6;
}

#join {
	
}
</style>
<body class="archive post-type-archive post-type-archive-lana_story">
	<jsp:include page="login-header.jsp" />
	<main class="main container">
		<div class="row">
			<div class="col-12 col-lg-8">
				<div class="story-posts">
					<div class="widget">
						<section id="profile">
							<div class="row">
								<div class="col-4">
									<div class="widget-sidebar story-sidebar">
										<div id="button">
											<img src="<c:url value="/pictures/placeholder/logo.png"/>"
												class="rounded-circle" alt="Author" width="200" height="200">
										</div>
										<div class="tagcloud">
											<div id="button">
												<a href="#" class="tag-cloud-link"
													aria-label="admin change button">프로필 변경</a>
											</div>
										</div>
									</div>
								</div>
								<div class="col-8">
									<h3>아이디</h3>
									<div class="info" id="info__id">
										<div id="id-input">
											<input class="box" type="text" placeholder="아이디"
												readonly="readonly" />
										</div>
									</div>
									<h3>전화번호</h3>
									<div class="info">
										<div id="phone-input">
											<input class="box" type="tel" placeholder="01012345678" />
										</div>
									</div>
									<h3>자기 소개</h3>
									<div class="info">
										<div id="introduce-input">
											<textarea id="introduce" class="box"
												placeholder="자기소개를 작성해주세요." maxlength=200></textarea>
										</div>
									</div>
								</div>
							</div>
						</section>
					</div>
					<hr>
					<section id="career">
						<h3>직업</h3>
						<div class="info" id="career-input">
							<div id="category-flex">
								<select class="box" id="category-big">
									<optgroup label="디자인"
										style="font-weight: bold; font-size: 20px;"></optgroup>
									<option selected value="graphic">그래픽 디자인</option>
									<option value="producy">제품 디자인</option>
									<optgroup label="번역"
										style="font-weight: bold; font-size: 20px;"></optgroup>
									<option value="english">영어</option>
									<option value="china">중국어</option>
									<optgroup label="사진·편집"
										style="font-weight: bold; font-size: 20px;"></optgroup>
									<option value="hair">헤어/메이크업</option>
									<option value="photo">제품 홍보 사진</option>
									<optgroup label="세무"
										style="font-weight: bold; font-size: 20px;"></optgroup>
									<option value="individual">개인</option>
									<option value="business">사업</option>
									<optgroup label="마케팅"
										style="font-weight: bold; font-size: 20px;"></optgroup>
									<option value="sns">SNS 마케팅</option>
									<option value="overseas">해외 마케팅</option>
								</select>
							</div>
							<div class="error-msg"></div>
						</div>


						<h3>경력</h3>
						<div class="info" id="company_category">
							<div id="career-input">
								<input class="box" type="text" placeholder="1년 6개월" />
							</div>
							<div class="error-msg"></div>
						</div>

						<h3>근무지</h3>
						<div class="info" id="info__category">
							<div id="category-flex">
								<input class="box" type="text" placeholder="경력이 있을 경우에만 입력해주세요." />
							</div>
							<div class="error-msg"></div>
							<div id="category-flex">
								<input class="box" type="text" placeholder="경력이 있을 경우에만 입력해주세요." />
							</div>
							<div class="error-msg"></div>
							<div id="category-flex">
								<input class="box" type="text" placeholder="경력이 있을 경우에만 입력해주세요." />
							</div>
							<div class="error-msg"></div>
						</div>
						<br>
					</section>
					<hr>
					<section id="upload">
						<h3>포트폴리오</h3>
						<input class="form-control" type="file" id="formFile"> <span
							style="color: gray; font-size: 15px; padding: 0px 25px;">
							[PDF 파일로 업로드 해주세요.]</span>
					</section>
					<br>
					<hr>
					<section>
					<br>
						<div id="join" style="text-align: center;">
							<button id="submit" type="button" class="btn btn-primary">전문가
								등록</button>
						</div>
					</section>
				</div>
			</div>


			<div class="col-12 col-lg-4 mt-4 mt-lg-0">
				<div class="widget-sidebar story-sidebar">
					<div class="tagcloud">
						<div class="row">
							<div class="widget" style="text-align: left; padding-left: 20px;"
								id="list">
								<h3 class="widget-title">전문가 등록</h3>
								<ul>
									<li><a href="#profile">전문가 정보</a></li>
									<li><a href="#career">경력 사항</a></li>
									<li><a href="#upload">포트폴리오</a></li>
								</ul>
							</div>
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

</body>
</html>