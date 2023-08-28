<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>상품 페이지 - 상품 등록</title>

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
	href="<c:url value="/css/lana-pet-icon.min.css?ver=1.0.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css"
	href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>"
	type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css"
	href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>"
	type="text/css" media="print">
</head>
<body class="page page-template-default">
	<jsp:include page="header.jsp" />

	<main class="main">
		<div id="post-1" class="page type-page post-1">
			<div class="container post-container bg-white">
				<div class="row justify-content-start post-row no-gutters">
					<div
						class="col-12 px-0 px-sm-3 col-md-10 offset-md-1 px-md-0 col-xl-9">
						<div class="post-content">
							<h4 class="font-weight-bold">상품등록</h4>
							<p>규정을 준수하여 상품을 등록해주세요</p>

							<form class="contact-form mt-5" method="post" action="/item/add">
								<div class="form-group row" id="expertIdx">
									<div class="col">
										<input type="text" class="form-control" aria-required="true"
											required="required" aria-label="Price" name="expertIdx"
											value="${expertIdx}" readonly required />
									</div>
									<div class="error-msg"></div>
									<div class="col" id="price">
										<input type="text" class="form-control"
											placeholder="가격을 작성해주세요(화폐단위는 생략)" aria-required="true"
											required="required" aria-label="Price" name="price"
											pattern="\d*" required>
									</div>
									<div class="error-msg"></div>
								</div>
								<div class="form-group row">
									<div class="col" id="itemName">
										<input type="text" class="form-control"
											placeholder="상품제목을 입력해주세요" aria-required="true"
											required="required" aria-label="Subject" name="itemName"
											required>
									</div>
									<div class="error-msg"></div>
								</div>
								<div class="form-group row" id="itemContent">
									<div class="col">
										<textarea class="form-control" rows="20" placeholder="상품설명"
											aria-required="true" required="required" aria-label="Message"
											name="itemContent" required></textarea>
									</div>
									<div class="error-msg"></div>
								</div>
								<div class="form-group row" id="categoryIdx">
									<div class="col">
										<h3>관심사</h3>
										<div class="info" id="info__category">
											<div id="category-flex">
												<select class="box" id="category-big1"
													onchange="categorySelect1(this)">
													<option disabled selected>대 카테고리</option>
													<option value="a">디자인</option>
													<option value="b">번역</option>
													<option value="c">사진 편집</option>
													<option value="d">세무</option>
													<option value="e">마케팅</option>
												</select> <select class="box" id="mcategory1" name="categoryIdx">
													<option disabled selected>중 카테고리</option>
												</select>
											</div>
											<div class="error-msg"></div>
										</div>
									</div>
									<div class="error-msg"></div>
								</div>
								<button id="submit" type="submit" class="btn btn-primary"
									style="font-size: 20px;">상품 사진 등록하러 가기</button>
							</form>
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
	<script defer src="<c:url value="/js/join.js"/>"></script>

	<script type="text/javascript">
		
	</script>
</body>
</html>