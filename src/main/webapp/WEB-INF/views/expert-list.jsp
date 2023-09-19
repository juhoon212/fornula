<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>판매관리-전문가</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
	type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
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
}

tr td {
	padding: 0px 40px;
}

#list {
	padding-left: 30px;
}
</style>
<body class="archive post-type-archive post-type-archive-lana_story">
	<jsp:include page="header.jsp" />
	<!-- 스타일 태그 끝 -->
	<main class="main container" id="main-content">
		<div class="row">
			<!-- <div class="story-posts"> -->
			<div class="story-posts col-12 col-lg-8">
				<!-- <div class="sale" id="salecontent" -->

				<div class="widget">

					<div style="text-align: left;">
						<label
							style="color: #fdbb42; font-size: 24px; margin-bottom: 30px;">판매
							관리</label>
					</div>
					<div style="padding: 20px;">
					<table style="font-size: 21px;">
						<tr>
							<th scope="col">총 판매 금액</th>
							<td scope="col" style="text-align: right;" id="price">${price }
								&nbsp;&nbsp;원</td>
						</tr>
					</table>
					</div>
					<section>
									<div id="post-1"
										class="lana_story type-lana_story post-1 card story-card">
						<c:choose>
							<c:when test="${salesList == null }">
								<div class="row">
									<div class="col-md-4">
										<p>판매내역이 존재하지 않습니다.</p>
									</div>
								</div>
							</c:when>
							<c:otherwise>
								<c:forEach var="salesList" items="${salesList}">
										<div class="card-body">
											<div class="blog-posts">
												<div id="post-2"
													class="post type-post post-2 card post-card">
														<a href="<c:url value="/item/update/${salesList.itemIdx}"/>"
																	class="more-link card-link d-flex align-items-center">상품수정</a>
														<p class="post-text card-text">
														<h6 class="post-title card-title" name="salesIdx">${salesList.salesIdx }</h6>
														<h4 class="post-title card-title">
															<a href="<c:url value="/item/${salesList.itemIdx}/1"/>">${salesList.itemName}</a>
														</h4>

													<div class="row">
														<div class="col-md-4">
															<img class="card-img img-fluid"
																src="<c:url value='/images/upload/${salesList.itemfileName}'/>"
																alt="Post">
														</div>
														<div class="col-md-8">
															<div
																class="card-body h-100 d-flex align-items-start flex-column">
																<ul class="post-meta">
																	<li>${salesList.salesDate}</li>
																	<li>₩ ${salesList.price}</li>
																</ul>
																<p class="post-text card-text">
																<h6 class="post-title card-title" name="salesIdx">${salesList.salesIdx }</h6>
																<h4 class="post-title card-title">
																	<a href="<c:url value="/item/${salesList.itemIdx}/1"/>">${salesList.itemName}</a>
																</h4>

																<div
																	class="d-flex justify-content-between align-items-center post-meta mt-auto w-100">
																	<div class="author-meta">
																		<a
																			href="<c:url value="/item/${salesList.itemIdx}/1"/>"
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
								</c:forEach>
							</c:otherwise>
						</c:choose>
									</div>

						<nav style="padding: 5px;"
							class="navigation pagination justify-content-between text-uppercase"
							role="navigation">
							<a class="prev disabled" href="<c:url value="#"/>"> Prev </a>
							<div class="nav-links">
								<ul class="page-numbers">
									<li><span aria-current="page" class="page-numbers current">1</span></li>
									<li><a class="page-numbers" href="<c:url value="#"/>">2</a></li>
									<li><span class="page-numbers dots">…</span></li>
									<li><a class="page-numbers" href="<c:url value="#"/>">4</a></li>
								</ul>
							</div>
							<a class="next" href="<c:url value="#"/>"> Next </a>
						</nav>
					</section>
				</div>
			</div>
			<div class="col-12 col-lg-4 mt-4 mt-lg-0">
				<div class="widget-sidebar story-sidebar">
					<div id="button">
						<img src="<c:url value="/pictures/placeholder/profile.png"/>"
							class="img-fluid rounded-circle mr-1 w-auto" alt="Author">
					</div>
					<div id="button">
						<a href="<c:url value="#"/>" class="tag-cloud-link"
							aria-label="idbutton">${loginMember.id}</a>
					</div>
					<div class="widget widget_tag_cloud">
						<div class="tagcloud">
							<div id="button">
								<a href="<c:url value="/mypageInfo"/>" class="tag-cloud-link"
									aria-label="admin change button">일반회원으로 전환</a>
							</div>
							<div class="row">
								<div class="widget"
									style="text-align: left; padding-left: 20px;">
									<h3 class="widget-title">판매 관리</h3>
									<ul class="list-unstyled"><!-- 이거 줄맞춤 안되있는거만 내가 class속성 추가해서 속성값으로 줄맞춤했어 -->
										<li><a href="<c:url value="/expert/input"/>">전문가 정보</a></li>

										<li><a href="<c:url value="/expert/sales"/>">판매 관리</a></li>

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
</body>
</html>