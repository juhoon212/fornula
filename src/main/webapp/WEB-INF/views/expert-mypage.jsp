<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>판매관리-전문가 </title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
	type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com"  crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap"
	rel="stylesheet">
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
tr td{
	padding: 0px 30px;

}
#list{
	padding-left: 30px;
}

/* 여기서부턴 바닐라 스크립트로 탭메뉴(전문가 정보 수정/등록, 판매관리, 포트폴리오 출력)을 AJAX로 활용하기 위해서 작성하는 style 태그 */

</style>
<body class="archive post-type-archive post-type-archive-lana_story">
	<jsp:include page="header.jsp" />

	<!-- 스타일 태그 끝 -->
	<main class="main container">
		<div class="sale">
			<div class="row">
				<form class="col-12 col-lg-8" id="content">
					<div class="widget">
						<table>
							<tr>
								<th scope="col">총 판매 금액</th>
								<td scope="col" style="text-align: right;">원</td>
							</tr>
						</table>
					</div>

					<div class="story-posts">
						<div class="input-group">
							<select id="archive" class="form-control">
								<option>주문 접수</option>
								<option>제작중</option>
								<option>제작완료</option>
							</select> 
							<select id="archive" class="form-control">
								<option>달력</option>
								<option>으로</option>
								<option>하고</option>
							</select>
							<button class="btn btn-primary" type="button">
								<i class="fa fa-search"></i>
							</button>
						</div>
						<div id="post-1"
							class="lana_story type-lana_story post-1 card story-card">
							<div class="card-body">
								<div class="blog-posts">
									<div id="post-2" class="post type-post post-2 card post-card">
										<div class="row">
											<div class="col-md-4">
												<img class="card-img img-fluid"
													src="<c:url value="/pictures/placeholder/530x400.svg"/>"
													alt="Post">

											</div>
											<div class="col-md-8">
												<div
													class="card-body h-100 d-flex align-items-start flex-column">
													<ul class="post-meta">
														<li><a href="single.html">판매일자 월, 일, 년도</a></li>
														<li><a href="#">주문상태</a></li>
													</ul>
													<p class="post-text card-text">
													<h6 class="post-title card-title">판매번호</h6>
													<h4 class="post-title card-title">
														<a href="single.html">게시물이름</a>
													</h4>
													<p class="subtitle">상품설명</p>

													<div
														class="d-flex justify-content-between align-items-center post-meta mt-auto w-100">
														<div class="author-meta">

															<button class="btn btn-primary btn-sm dropdown-toggle"
																type="button" data-toggle="dropdown" id="btnmenu">
																주문 접수 <span class="caret"></span>
															</button>
															<ul class="dropdown-menu">
																<li><button type="button" class="dropdown-item"
																		id="statusone" value="1" onclick="changeBtn()">제작중</button></li>
																<li><button type="button" class="dropdown-item"
																		id="statustwo" value="2" onclick="changeBtn()">제작완료</button></li>
															</ul>
														</div>

														<a href="single.html"
															class="more-link card-link d-flex align-items-center">
															답글보기 <i class="lana-icon-arrow-right text-primary"></i>
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<nav
							class="navigation pagination justify-content-between text-uppercase"
							role="navigation">
							<a class="prev disabled" href="#"> Prev </a>
							<div class="nav-links">
								<ul class="page-numbers">
									<li><span aria-current="page" class="page-numbers current">1</span></li>
									<li><a class="page-numbers" href="#">2</a></li>
									<li><span class="page-numbers dots">…</span></li>
									<li><a class="page-numbers" href="#">4</a></li>
								</ul>
							</div>
							<a class="next" href="#"> Next </a>
						</nav>
					</div>
				</form>

				<div class="col-12 col-lg-4 mt-4 mt-lg-0">
					<div class="widget-sidebar story-sidebar">

						<div id="button">
							<img src="<c:url value="/pictures/placeholder/logo.png"/>"
								class="rounded-circle" alt="Author" width="200" height="200">
						</div>
						<div id="button">
							<a href="#" class="tag-cloud-link" aria-label="idbutton">아이디</a>
						</div>
						<div class="widget widget_tag_cloud">

							<div class="tagcloud">
								<div id="button">
									<a href="mypage-purchase" class="tag-cloud-link"
										aria-label="admin change button">일반회원으로 전환</a>
								</div>
								<div class="tab_menu">
									<div class="widget" style="text-align: left;" id="list">
										<h3 class="widget-title">판매 관리</h3>
										<ul>
											<li><a type="button" id="expertInput" onclick="inputBtn">전문가 정보 수정</a></li>
											<li><a href="expertoutput" class="expertOutput">포트폴리오</a></li>
											<li><a href="expertitem" class="expertItem">상품 등록</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		
<!-- 여기는 AJAX를 활용해서 전문가 정보 수정/등록을 누른 경우 나오는 div태그 -->
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
	
<script type="text/javascript">
var queryString = $('#폼?div 아이디').serialize();
$.ajax({
	url:'/expertsales',
	type:''
})
</script>	
</body>
</html>