<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>상품 페이지 - 상품 게시판</title>

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
<style>
.pages {
	display: flex;
}

li {
	list-style-type: none;
}

li a {
	padding: 10px;
}

#category {
	width: 100%;
	height: 200px;
	background-color: white;
	padding: 20px;
	font-size: 40px;
	text-align: center;
	border-radius: 20px;
}

.btn {
	height: 40px;
	font-size: 16px;
	text-align: center;
	padding: 0px 32px;
}

#problem {
	height: 70%; /* 0.7배로 줄인 높이 */
}

.category-button.active {
	color: orange;
}
</style>
<body class="archive grid-3-columns">
	<jsp:include page="header.jsp" />

	<main class="main container">
		<div style="width: 100%;">
			<div id="box" style="width: 100%;">
				<div class="row">
					<div class="col-md-12 text-center mb-3" style="margin-top: 0;">
						<a href="<c:url value="/item/boardList"/>"
							style="font-size: 16px;">전체 보기</a>
					</div>
				</div>
				<!-- id="category" 안에 있는 내용 -->
				<div id="categoryBtn" style="text-align: center;">
					<div class="row" id="problem">
						<!-- id="problem"인 div 태그 -->
						<c:forEach var="category" begin="1" end="10">
							<div class="col-md-2 col-5 p-0" style="margin: 5px;">
								<div class="col">
									<form action="<c:url value='/item/boardList'/>" method="get">
										<input type="hidden" name="categoryIdx" value="${category}" />
										<!-- 이벤트 리스너를 추가하여 버튼 클릭 시 배경색 변경 -->
										<button type="submit"
											class="category-button btn category-button-${category} ${category == 1 ? 'all-button' : ''}">
											<c:choose>
												<c:when test="${category == 1}">그래픽</c:when>
												<c:when test="${category == 2}">제품</c:when>
												<c:when test="${category == 3}">영어</c:when>
												<c:when test="${category == 4}">중국어</c:when>
												<c:when test="${category == 5}">헤어 메이크업</c:when>
												<c:when test="${category == 6}">제품 홍보 사진</c:when>
												<c:when test="${category == 7}">사업자</c:when>
												<c:when test="${category == 8}">개인</c:when>
												<c:when test="${category == 9}">SNS 홍보</c:when>
												<c:when test="${category == 10}">해외 마케팅</c:when>
											</c:choose>
										</button>
									</form>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
				<!-- 여기까지 id="category" 안에 있는 내용 -->
			</div>
		</div>



		<div class="row">
			<div class="col-12">
				<div class="blog-grid-posts">
					<div class="row">
						<!-- itemBoardList에 있는 각각의 itemPhotoCategoryCart에 접근합니다. -->
						<c:forEach var="itemList" items="${itemBoardList}">
							<div class="blog-grid-col col-12 col-md-6 col-lg-4">
								<div id="post-1"
									class="post type-post card post-card post-grid-card h-100"
									style="border-radius: 20px;">
									<!-- itemPhotoCategoryCart 객체의 item 프로퍼티 사용 -->
									<a href="<c:url value='/item/${itemList.item.itemIdx}/1'/>">
										<img id="itemimg"
										src="<c:url value='/images/upload/${itemList.photo.itemfileName}'/>"
										class="card-img-top img-fluid"
										style="width: 400px; height: 300px; border-radius: 20px 20px 0px 0px;"
										alt="${itemList.item.itemName}">
									</a>
									<div class="card-body">
										<ul class="post-meta">
											<li><a href="single.html">${itemList.item.itemDate}</a></li>
										</ul>
										<h5 class="post-title card-title">
											<a href="<c:url value='/item/${itemList.item.itemIdx}/1'/>">
												${itemList.item.itemName} </a>
										</h5>
										<p class="post-text card-text text-truncate">
											<a href="<c:url value='/item/${itemList.item.itemIdx}/1'/>">
												<span style="color: black; font-size: 13px;">
													${itemList.item.itemContent} </span>
											</a>
										</p>
									</div>
									<div class="card-footer">
										<div style="float: right;">
											<a> 가격: ₩<fmt:formatNumber type="number"
													value="${itemList.item.price}" pattern="#,###" />
											</a>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
					<div class="pages">
						<c:choose>
							<c:when test="${pager.startPage > pager.blockSize }">
								<a
									href="<c:url value="/item/boardList"/>?pageNum=${pager.prevPage}">
									Prev </a>

							</c:when>
							<c:otherwise>
								Prev
							</c:otherwise>
						</c:choose>
						<c:forEach var="i" begin="${pager.startPage }"
							end="${pager.endPage }" step="1">
							<c:choose>
								<c:when test="${pager.pageNum != i}">
									<li><a
										href="<c:url value="/item/boardList"/>?pageNum=${i}">${i}</a>
									<li>
								</c:when>
								<c:otherwise>
									${i}
								</c:otherwise>
							</c:choose>
						</c:forEach>

						<c:choose>
							<c:when test="${pager.endPage != pager.totalPage }">
								<div>
									<a
										href="<c:url value="/item/boardList"/>?pageNum=${pager.nextPage}">Next</a>
								</div>
							</c:when>
							<c:otherwise>
								Next
							</c:otherwise>
						</c:choose>
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
	<script>
		// 현재 페이지 번호
		var currentPage = 1;
		var totalPages = 4; // 전체 페이지 수, 실제 데이터에 맞게 수정해야 합니다.

		// Prev 버튼 클릭 시 이벤트 처리
		document.getElementById("prevBtn").addEventListener("click",
				function() {
					if (currentPage > 1) {
						currentPage--;
						updatePage();
					}
				});

		// Next 버튼 클릭 시 이벤트 처리
		document.getElementById("nextBtn").addEventListener("click",
				function() {
					if (currentPage < totalPages) {
						currentPage++;
						updatePage();
					}
				});

		// 페이지 업데이트 함수
		function updatePage() {

			// 현재 페이지 번호 업데이트
			var currentPageElement = document
					.querySelector(".page-numbers.current");
			currentPageElement.textContent = currentPage;

			// Prev, Next 버튼 활성화/비활성화 처리
			var prevBtn = document.getElementById("prevBtn");
			var nextBtn = document.getElementById("nextBtn");

			if (currentPage === 1) {
				prevBtn.classList.add("disabled");
			} else {
				prevBtn.classList.remove("disabled");
			}

			if (currentPage === totalPages) {
				nextBtn.classList.add("disabled");
			} else {
				nextBtn.classList.remove("disabled");
			}
		}

		// 초기 페이지 로딩 시 페이지 업데이트 호출
		updatePage();
	</script>
</body>
</html>