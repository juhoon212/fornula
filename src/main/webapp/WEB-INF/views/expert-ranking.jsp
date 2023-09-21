<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>전문가 랭킹</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" id="montserrat-css" href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
<link rel="stylesheet" id="open-sans-css" href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

<link rel="stylesheet" id="animate-css" href="../css/animate.min.css?ver=3.7.2" type="text/css" media="all">
<link rel="stylesheet" id="font-awesome-css" href="../css/font-awesome.min.css?ver=5.15.4" type="text/css" media="all">
<link rel="stylesheet" id="bootstrap-css" href="../css/bootstrap.min.css?ver=4.6.0" type="text/css" media="all">
<link rel="stylesheet" id="smartmenus-bootstrap-css" href="../css/smartmenus-bootstrap.min.css?ver=1.1.1" type="text/css" media="all">
<link rel="stylesheet" id="swiper-css" href="../css/swiper.min.css?ver=4.5.3" type="text/css" media="all">
<link rel="stylesheet" id="magnific-popup-css" href="../css/magnific-popup.min.css?ver=1.1.0" type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-icon-css" href="../css/lana-pet-icon.min.css?ver=1.0.0" type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css" href="../css/lana-pet-theme.min.css?ver=1.0.0" type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css" href="../css/lana-pet-print.min.css?ver=1.0.0" type="text/css" media="print">
</head>
<style>
#paging {
	display: flex;
	justify-content: center; /* 페이징을 가로로 가운데 정렬 */
	align-items: center; /* 수직 가운데 정렬 */
}

#paging a {
	margin: 0 5px; /* 각 페이지 번호 사이의 간격 조정 */
}
</style>

<body>
	<jsp:include page="header.jsp" />
	<main class="main">
		<div id="post-1" class="page type-page post-1">
			<div id="managers-container" class="container my-5">
				<div class="row justify-content-center">
					<div class="col-12 col-md-10 col-lg-6 text-center">
						<h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">판매 금액 랭킹</h1>
						<div class="lana-hr lana-hr-4 border-primary mt-4"></div>
					</div>
				</div>
				<div class="row mt-5">
					<div class="col-12 col-md-4 col-lg-4">
						<div class="lana_member type-lana_member card member-card bg-transparent">
							<div class="card-body">
								<img src="<c:url value='/pictures/placeholder/1.png'/>" class="card-img-top img-fluid rounded-circle" alt="Team Member" data-scroll-animate="zoomIn">
								<h5 class="post-title card-title" data-scroll-animate="fadeInDown">
									<a href="<c:url value='/expert/output/${expertMoneylist.expertIdx}'/>">전문가 번호:${expertMoneylist.expertIdx}</a>
								</h5>
								<h6 class="card-subtitle" data-scroll-animate="fadeInUp" id="interest1">
									<a href="<c:url value='/expert/output/${expertMoneylist.expertIdx}'/>">관심사:${expertMoneylist.interest}</a>
								</h6>
								<p class="post-text card-text" data-scroll-animate="fadeIn" id="subtitle">
									<a href="<c:url value='/expert/output/${expertMoneylist.expertIdx}'/>">자기소개 :<br>${expertMoneylist.introduce}</a>
								</p>
								<table style="font-size: 21px;">
									<tr>
										<td scope="col" style="text-align: right;" id="price">${expertMoneylist.totalMoney}원</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
					<div class="col-12 col-md-4 col-lg-4">
						<div class="lana_member type-lana_member card member-card bg-transparent">
							<div class="card-body">
								<img src="<c:url value="/pictures/placeholder/2.png"/>" class="card-img-top img-fluid rounded-circle" alt="Team Member" data-scroll-animate="zoomIn">
								<h5 class="post-title card-title" data-scroll-animate="fadeInDown">
									<a href="<c:url value='/expert/output/${expertList.expertIdx}'/>">전문가 번호:13</a>
								</h5>
								<h6 class="card-subtitle" data-scroll-animate="fadeInUp" id="interest2">4</h6>
								<p class="post-text card-text" data-scroll-animate="fadeIn">자기소개</p>
								<table style="font-size: 21px;">
									<tr>
										<td scope="col" style="text-align: right;" id="price">${price }&nbsp;&nbsp;원</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
					<div class="col-12 col-md-4 col-lg-4">
						<div class="lana_member type-lana_member card member-card bg-transparent">
							<div class="card-body">
								<img src="<c:url value="/pictures/placeholder/3.png"/>" class="card-img-top img-fluid rounded-circle" alt="Team Member" data-scroll-animate="zoomIn">
								<h5 class="post-title card-title" data-scroll-animate="fadeInDown">
									<a href="<c:url value='/expert/output/${expertList.expertIdx}'/>">전문가 번호:13</a>
								</h5>
								<h6 class="card-subtitle" data-scroll-animate="fadeInUp" id="interest3">6</h6>
								<p class="post-text card-text" data-scroll-animate="fadeIn">자기소개</p>
								<table style="font-size: 21px;">
									<tr>
										<td scope="col" style="text-align: right;" id="price">${price }&nbsp;&nbsp;원</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="employees-container" class="container my-5">
			<div class="row justify-content-center">
				<div class="col-12 col-md-10 col-lg-6 text-center">
					<h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">전체 전문가</h1>
					<div class="lana-hr lana-hr-4 border-primary mt-4"></div>
				</div>
			</div>
			<c:choose>
				<c:when test="${empty expertBoardList}">
					<div class="row" id="noSearch">
						<div class="col-12" style="color: red; display: flex; justify-content: center; align-items: center; min-height: 300px;">
							<p>전문가 모집 구함</p>
						</div>
					</div>
				</c:when>
				<c:otherwise>
					<c:forEach var="expertList" items="${expertBoardList}">
						<div>
							<div id="post-1" class="post type-post card post-card post-grid-card h-100" style="border-radius: 20px;">
								<a href="<c:url value='/expert/output/${expertList.expertIdx}'/>">전문가 번호: ${expertList.expertIdx } </a>
								<div class="card-body">

									<h5 class="post-title card-title">
										<a href="<c:url value='/expert/output/${expertList.expertIdx}'/>"> <c:choose>
												<c:when test="${empty expertList.career}">
													<span style="color: black;">주니어 전문가입니다</span>
												</c:when>
												<c:otherwise>
      경력: ${expertList.career} 차
    </c:otherwise>
											</c:choose>
										</a>
									</h5>
									<p class="post-text card-text text-truncate">
										<a href="<c:url value='/expert/output/${expertList.expertIdx}'/>"> <span style="color: black; font-size: 13px;"> <c:choose>
													<c:when test="${empty expertList.introduce}">
														<span style="color: red;">자기소개가 없는 전문가 입니다</span>
													</c:when>
													<c:otherwise>
          자기소개:<br>${expertList.introduce}
        </c:otherwise>
												</c:choose>
										</span>
										</a>
									</p>
								</div>
								<div class="card-footer">
									<div style="float: right;">
										<a href="<c:url value='/item/boardList?categoryIdx=${expertList.interest}'/>">관심사# ${expertList.interest }</a>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</div>
		<div id="paging">
			<c:choose>
				<c:when test="${pager.startPage > 1}">
					<a href="<c:url value='/expert/ranking'/>?pageNum=${pager.prevPage}"> Prev </a>
				</c:when>
				<c:otherwise>
      Prev
    </c:otherwise>
			</c:choose>
			<c:forEach var="i" begin="${pager.startPage}" end="${pager.endPage}" step="1">
				<c:choose>
					<c:when test="${pager.pageNum != i}">
						<a href="<c:url value='/expert/ranking'/>?pageNum=${i}">${i}</a>
					</c:when>
					<c:otherwise>
        ${i}
      </c:otherwise>
				</c:choose>
			</c:forEach>
			<c:choose>
				<c:when test="${pager.endPage != pager.totalPage}">
					<a href="<c:url value='/expert/ranking'/>?pageNum=${pager.nextPage}">Next</a>
				</c:when>
				<c:otherwise>
      Next
    </c:otherwise>
			</c:choose>
		</div>
		<jsp:include page="footer.jsp" />
	</main>

	<script type="text/javascript" src="../js/jquery.min.js?ver=3.6.0"></script>
	<script type="text/javascript" src="../js/popper.min.js?ver=1.16.1"></script>
	<script type="text/javascript" src="../js/bootstrap.min.js?ver=4.6.0"></script>
	<script type="text/javascript" src="../js/smartmenus.min.js?ver=1.1.1"></script>
	<script type="text/javascript" src="../js/smartmenus-bootstrap.min.js?ver=1.1.1"></script>
	<script type="text/javascript" src="../js/swiper.min.js?ver=4.5.3"></script>
	<script type="text/javascript" src="../js/scrollmagic.min.js?ver=2.0.8"></script>
	<script type="text/javascript" src="../js/magnific-popup.min.js?ver=1.1.0"></script>
	<script type="text/javascript" src="../js/custom-theme.js?ver=1.0.0"></script>
	<script>
		var interest1 = document.getElementById('interest1');
		var interest2 = document.getElementById('interest2');
		var interest3 = document.getElementById('interest3');

		var value1 = interest1.textContent.trim();
		var value2 = interest2.textContent.trim();
		var value3 = interest3.textContent.trim();

		var resultText1 = getResultText(value1);
		var resultText2 = getResultText(value2);
		var resultText3 = getResultText(value3);

		interest1.textContent = resultText1;
		interest2.textContent = resultText2;
		interest3.textContent = resultText3;

		function getResultText(value) {
			switch (value) {
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
	</script>
</body>
</html>