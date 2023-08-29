
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
#button {
	display: flex;
	justify-content: center; align-items center;
	padding-bottom: 2em;
}
</style>
<body class="archive post-type-archive post-type-archive-lana_story">

	<header
		class="header bg-dark lana-bg-image-brown-and-white-small-staring-dog-face-indoor">
		<nav class="navbar navbar-expand-lg navbar-dark bg-transparent"
			id="lana-pet-main-navbar">
			<a class="navbar-brand" href="../index.html"> <img
				class="navbar-logo" src="../pictures/placeholder/190x50.svg"
				alt="Navbar Logo">
			</a>
			<div class="toggler-buttons d-flex flex-fill justify-content-end">
				<button class="search-toggler" type="button" data-toggle="collapse"
					data-target="#lana-search" aria-controls="lana-search"
					aria-expanded="false" aria-label="Toggle search">
					<i class="fas fa-search fa-lg fa-fw text-light"></i>
				</button>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#lana-navbar" aria-controls="lana-navbar"
					aria-expanded="false" aria-label="Toggle navigation">
					<i class="fas fa-bars fa-lg fa-fw text-light"></i>
				</button>
			</div>

			<div class="collapse navbar-collapse" id="lana-navbar">
				<ul class="navbar-nav mx-auto">
					<li class="nav-item"><a class="nav-link"
						href="front-page.html">Front Page</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="page.html"
						id="page-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Page</a>
						<ul class="dropdown-menu" aria-labelledby="page-dropdown">
							<li><a class="dropdown-item" href="page.html">Page
									(Default Template)</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">More
									Templates</h6>
							</li>
							<li><a class="dropdown-item"
								href="template-our-services.html">Our Services (Template)</a></li>
							<li><a class="dropdown-item"
								href="template-our-partners.html">Our Partners (Template)</a></li>
							<li><a class="dropdown-item" href="template-our-team.html">Our
									Team (Template)</a></li>
							<li><a class="dropdown-item" href="template-contact.html">Contact
									(Template)</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">Error
									Templates</h6>
							</li>
							<li><a class="dropdown-item" href="404.html">404 (Error
									Page)</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="archive.html"
						id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Post</a>
						<ul class="dropdown-menu" aria-labelledby="post-dropdown">
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">List
									Layout</h6>
							</li>
							<li><a class="dropdown-item" href="archive.html">Archive</a></li>
							<li><a class="dropdown-item"
								href="archive-without-sidebar.html"> Archive (without
									Sidebar) </a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">Grid
									Layout</h6>
							</li>
							<li><a class="dropdown-item"
								href="archive-grid-2-columns.html"> Archive (Grid - 2
									Columns) </a></li>
							<li><a class="dropdown-item"
								href="archive-grid-3-columns.html"> Archive (Grid - 3
									Columns) </a></li>
							<li><a class="dropdown-item"
								href="archive-grid-4-columns.html"> Archive (Grid - 4
									Columns) </a></li>
							<li><a class="dropdown-item"
								href="archive-grid-auto-columns.html"> Archive (Grid - Auto
									Columns) </a></li>
							<li><a class="dropdown-item" href="single.html">Single</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="archive-lana_pet.html"
						id="pet-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Pet</a>
						<ul class="dropdown-menu" aria-labelledby="pet-dropdown">
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">List
									Layout</h6>
							</li>
							<li><a class="dropdown-item" href="archive-lana_pet.html">Archive</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">Grid
									Layout</h6>
							</li>
							<li><a class="dropdown-item"
								href="archive-lana_pet-grid-2-columns.html"> Archive (Grid -
									2 Columns) </a></li>
							<li><a class="dropdown-item"
								href="archive-lana_pet-grid-3-columns.html"> Archive (Grid -
									3 Columns) </a></li>
							<li><a class="dropdown-item"
								href="archive-lana_pet-grid-auto-columns.html"> Archive
									(Grid - Auto Columns) </a></li>
							<li><a class="dropdown-item" href="single-lana_pet.html">Single</a></li>
						</ul></li>

					<li class="nav-item dropdown active"><a
						class="nav-link dropdown-toggle" href="archive-lana_story.html"
						id="story-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Story</a>
						<ul class="dropdown-menu" aria-labelledby="story-dropdown">
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">List
									Layout</h6>
							</li>
							<li><a class="dropdown-item active"
								href="archive-lana_story.html">Archive</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">Grid
									Layout</h6>
							</li>
							<li><a class="dropdown-item"
								href="archive-lana_story-grid-3-columns.html"> Archive (Grid
									- 3 Columns) </a></li>
							<li><a class="dropdown-item" href="single-lana_story.html">Single</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle"
						href="archive-lana_fundraiser.html" id="fundraiser-dropdown"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Fundraiser</a>
						<ul class="dropdown-menu" aria-labelledby="fundraiser-dropdown">
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">List
									Layout</h6>
							</li>
							<li><a class="dropdown-item"
								href="archive-lana_fundraiser.html">Archive</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">Grid
									Layout</h6>
							</li>
							<li><a class="dropdown-item"
								href="archive-lana_fundraiser-grid-3-columns.html"> Archive
									(Grid - 3 Columns) </a></li>
							<li><a class="dropdown-item"
								href="single-lana_fundraiser.html">Single</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="search.html"
						id="search-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Search</a>
						<ul class="dropdown-menu" aria-labelledby="search-dropdown">
							<li><a class="dropdown-item" href="search.html">Search
									Result</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">Other
									Templates</h6>
							</li>
							<li><a class="dropdown-item" href="search-no-results.html">
									Search No Results </a></li>
						</ul></li>

					<li class="nav-item"><a class="nav-link"
						href="attachment.html">Attachment</a></li>
				</ul>
				<form class="search-widget d-none d-xl-inline-flex">
					<button class="search-toggler" type="button" data-toggle="collapse"
						data-target="#lana-search" aria-controls="lana-search"
						aria-expanded="false" aria-label="Toggle search">
						<i class="fas fa-search fa-lg fa-fw text-light"></i>
					</button>
				</form>
				<div class="button-nav-widget d-none d-xl-inline-flex">
					<ul class="nav button-nav">
						<li class="nav-item"><a href="#"
							class="btn btn-sm btn-primary text-white text-uppercase font-weight-bold my-auto">
								Donate </a></li>
					</ul>
				</div>
			</div>

			<div
				class="collapse search-collapse bg-dark text-white position-absolute animated fadeInDown"
				id="lana-search">
				<form method="get"
					class="search-form d-flex align-items-center h-100">
					<div class="input-group search border-transparent">
						<input type="text" name="s"
							class="form-control search-input text-light" placeholder="Search"
							aria-label="Search" aria-describedby="search-button">
						<div class="input-group-append">
							<button type="button" class="btn btn-sm close-button"
								data-toggle="collapse" data-target="#lana-search"
								aria-controls="lana-search" aria-expanded="true"
								aria-label="Close search">
								<i class="fas fa-times fa-lg text-light"></i>
							</button>
						</div>
						<div class="input-group-append">
							<button type="submit" id="search-button"
								class="btn search-button">
								<i class="fa fa-search fa-lg text-light"></i>
							</button>
						</div>
					</div>
				</form>
			</div>
		</nav>
	</header>


	<main class="main container">
		<div class="row">
			<div class="col-12 col-lg-8">
				<div class="widget">



					<div class="story-posts">

						<section>
							<!-- my-page style-->
							<style>
.info {
	margin-bottom: 22px;
}

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
	font-size : 17px;
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

.info .error-msg {
	position: absolute;
	font-size: 14px;
	color: red;
	margin: 4px 0 0 10px;
}

.changeBtn {
	border: none;
	padding: 5px 10px;
	color: #000;
}

.changeBtn {
	background-color: #ffffff;
	border-radius: 20px;
	border: 1px solid #ffb32f;
}

h3 {
	font-size: 20px;
}
/* 비밀번호 설정*/
.area {
	display: grid;
	grid-template-columns: 1fr 1fr;
	gap: 12px;
	align-content: stretch;
	justify-content: space-between;
}

.pwname {
	display: flex;
	margin-bottom: 8px;
	position: relative;
	-webkit-box-align: center;
	align-items: center;
}

.resetbox {
	display: grid;
	grid-template-columns: 1fr 1fr;
	gap: 12px;
	align-content: stretch;
	justify-content: space-between;
}

.pwrb {
	outline: none;
	flex: 1 1 0%;
	width: 100%;
	background-image: none;
	box-sizing: border-box;
	font-size: inherit;
	border: none;
	font-weight: inherit;
	background-color: transparent;
	text-align: left;
	color: inherit;
	padding: 0px;
}

.pwrbt {
	width: 100%;
	border: 1px solid rgb(228, 229, 237);
	border-radius: 8px;
	transition: background-color 0.2s ease 0s, border-color 0.2s ease 0s;
	display: inline-flex;
	column-gap: 8px;
	flex-direction: row;
	overflow: hidden;
	cursor: text;
	background-color: rgb(255, 255, 255);
	color: rgb(33, 34, 36);
	height: 42px;
	font-size: 14px;
	padding: 0px 12px;
	min-width: 64px;
}
</style>
							<!-- 스타일 태그 끝 -->
							<form name="passwordForm" method="post" action="mypagePwchange">
							<label style = "color : #fdbb42; font-size : 24px; margin-bottom : 30px;">비밀번호 수정</label>
								<h3>현재 비밀번호</h3>
								<div class="info" id="info__pw">
									<input class="box" name="password" type="password"
										placeholder="비밀번호를 입력해 주세요.(8자리 이상)" />
									<p align="right" style="color: red; font-size : 14px;" id="password">${message }</p>
								</div>

								<div class="area">
									<label> 변경할 비밀번호</label> <label> 한번 더 입력</label>
									<div class="info" id="info__newPassword">
										<input class="box" name = "newPassword" type="password"
											placeholder="비밀번호를 입력해 주세요.(8자리 이상)" />
										<div class="error-msg" style = "width:250px;"></div>
									</div>
									<div class="info" id="info__reNewPassword">
										<input class="box" name = "reNewPassword" type="password"
											placeholder="비밀번호를 입력해 주세요.(8자리 이상)" />
										<div class="error-msg"></div>
									</div>

								</div>

								<div id="join" style="float: right;">
									<input type="button" class="changeBtn" value="변경하기"
										onclick="submitCheck();">
								</div>
								<span>&nbsp</span>
							</form>
						</section>

					</div>

				</div>
			</div>

			<div class="col-12 col-lg-4 mt-4 mt-lg-0">
				<div class="widget-sidebar story-sidebar">

					<div id="button">
						<img src="<c:url value="/pictures/placeholder/250x250.svg"/>"
							class="img-fluid rounded-circle mr-1 w-auto" alt="Author">
					</div>


					<div id="button">
						<a href="#" class="tag-cloud-link" aria-label="idbutton">아이디</a>


					</div>
					<div class="widget widget_tag_cloud">

						<div class="tagcloud">
							<div id="button">
								<a href="#" class="tag-cloud-link"
									aria-label="admin change button">전문가로 전환</a>


							</div>
							<div class="row">
								<div class="widget">
									<h3 class="widget-title">나의 정보</h3>

									<ul>
										<li><a href="<c:url value="/mypageInfo"/>">내정보 수정</a></li>
										<li><a href="<c:url value="/mypagePurchase"/>">구매 관리</a></li>
										<li><a href="<c:url value="/mypagePwchange"/>">비밀번호 수정</a></li>
										<li><a href="<c:url value="/mypageSession"/>">회원 탈퇴</a></li>
									</ul>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
	</main>

	<div class="pre-footer footer-grid-1 bg-dark text-white">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-md-10 col-lg-6 text-center">
					<div class="widget widget_lana_pet_subscribe">
						<h3 class="widget-title">Subscribe</h3>
						<p>Your weekly updates on the Pethome</p>
						<div class="lana-hr lana-hr-4 border-primary mt-4 mb-3"></div>
						<form class="mt-5">
							<div class="input-group input-group-lg">
								<input type="email"
									class="form-control bg-transparent border-primary text-white text-uppercase"
									placeholder="Email" aria-label="Email"
									aria-describedby="subscribe">
								<div class="input-group-append">
									<button type="submit" id="subscribe"
										class="btn btn-primary text-uppercase font-weight-bold">
										<span class="d-none d-sm-inline">Subscribe</span> <i
											class="fas fa-paper-plane d-inline d-sm-none"></i>
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<footer class="footer bg-dark text-white">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-6">
					<p class="footer-text text-center text-md-left">
						Lana Pet theme by <a href="http://lana.codes/" target="_blank">Lana
							Codes</a> © 2020 All Rights Reserved.
					</p>
				</div>
				<div class="col-md-6">
					<ul class="nav justify-content-center justify-content-md-end">
						<li class="nav-item"><a href="#" class="nav-link">Terms
								of Use</a></li>
						<li class="nav-item"><a href="#" class="nav-link">Privacy
								Policy</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>


<script defer src="<c:url value="/js/mypage-pwchange.js"/>"></script>
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