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
</style>
<body class="archive post-type-archive post-type-archive-lana_story">
	<jsp:include page="header.jsp" />

	<!-- 스타일 태그 끝 -->
	<main class="main container" style="min-height: 1000px;">
		<div class="story-posts" id="post">
			<div class="row">
				<div class="col-8">
					<div id="post-1"
						class="lana_story type-lana_story post-1 card story-card">
						<div class="card-body">
							<p style="text-align: left; font-size: 35px;">결제하기</p>
							<div class="blog-posts">
								<p style="text-align: left;">주문 내역</p>
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
												</div>
											</div>
										</div>
									</div>
								</div>
								<div id="post-3" class="post type-post post-3 card post-card">
									<div class="row" style="margin: 0 auto;">
										<p>결제 방법</p>
										<div class="col" style="padding-left: 50px;">
											<input type="checkbox" name="paymentoption" value="none"
												onclick="checkOnlyOne(this)" checked>일반 결제
											&nbsp;&nbsp; <input type="checkbox" name="paymentoption"
												value="card" onclick="checkOnlyOne(this)">카드 결제
											&nbsp;&nbsp; <input type="checkbox" name="paymentoption"
												value="account" onclick="checkOnlyOne(this)">계좌
											이체&nbsp;&nbsp; <input type="checkbox" name="paymentoption"
												value="noneaccount" onclick="checkOnlyOne(this)">무통장
											입금&nbsp;&nbsp;
										</div>
									</div>
									<hr>
									<br>
									<div id="post-4" class="post type-post post-4 card post-card">
										<div class="row">
											<div class="col" style="text-align: left;">
												<input class="check" type="checkbox" name="agree"
													value="checklist" onclick="agreeCheck()">&nbsp;
												취소/환불에 대한 규정 <br> <br>
												<p>
													구매 확정시 취소/환불이 불가합니다.<br> 제품 수정은 최대 2회까지 가능합니다.<br>
													확인하셨다면 확인 버튼을 눌러주세요.
												</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="widget-sidebar story-sidebar">
						<form action="/member/item" method="post">
							<div class="tagcloud">
								<div class="widget"
									style="text-align: left; padding-left: 20px; margin: 0 auto;"
									id="list">
									<label>총 결제 금액</label>
									<p>${price}</p>
									<hr>

									<input class="check" type="checkbox" name="agree"
										onclick="agreeCheck()">&nbsp;결제 전 안내사항<br> <input
										class="check" type="checkbox" name="agree"
										onclick="agreeCheck()">&nbsp;개인 정보 제 3자 제공
								</div>
								<br>
								<p
									style="text-align: center; font-size: 15px; color: gray; width: 100%">위
									내용을 확인하였고, 결제에 동의합니다.</p>

								<div style="width: 100%;">
									<button id="checkSubmit" type="submit" class="btn btn-primary"
										style="text-align: center;" name="checkBtn" disabled>결제하기</button>
								</div>
							</div>
						</form>
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

	<script type="text/javascript">
		function checkOnlyOne(element) {
			let checkboxes = document.getElementsByName("paymentoption");
			
			checkboxes.forEach((cb) => {
				cb.checked = false;
			})
			element.checked=true;
		
		}
	</script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	<script type="text/javascript">
		function agreeCheck(element) {
			let checkedbox = document.querySelectorAll('input[class=check]:checked');
			let cnt = checkedbox.length;
			
			if(cnt ==3 ){
				document.querySelector('#checkSubmit').disabled=false;
			}else{
				document.querySelector('#checkSubmit').disabled=true;
			}
		}
	</script>
</body>
</html>