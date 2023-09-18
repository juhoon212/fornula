<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>장바구니</title>

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
	<jsp:include page="header.jsp" />
	<main class="main container">
		<div class="row">
			<div class="col-12 col-lg-8">
				<div class="widget">
					<div class="story-posts">
						<div style="text-align: left;">
							<label
								style="color: #fdbb42; font-size: 24px; margin-bottom: 30px;">장바구니</label>
						</div>
						<section>
							<div class="row">
								<!-- 장바구니 내역 출력  -->
								<c:choose>
									<c:when test="${empty cartList }">
										<div class="card-body" style="text-align: center;">
											<p>장바구니가 비었습니다.</p>
										</div>
									</c:when>
									<c:otherwise>
										<c:forEach var="cartList" items="${cartList}">
											<div class="card-body">
												<div class="blog-posts">
													<div id="post-2"
														class="post type-post post-2 card post-card">

														<div class="row">
															<div class="col-md-4">
																<img class="card-img img-fluid"
																	src="<c:url value="/images/upload/${cartList.itemfileName}"/>"
																	alt="Post">
															</div>
															<div class="col-md-8">
																<div
																	class="card-body h-100 d-flex align-items-start flex-column">
																	<p style="float: right;">
																		₩
																		<fmt:formatNumber type="number"
																			value="${cartList.price}" pattern="#,###" />
																	</p>

																	<p class="post-text card-text">

																		<h4 class="post-title card-title">
																		<a href="<c:url value="/item/${cartList.itemIdx}/1"/>">${cartList.itemName}</a>
																	</h4>
																	<div style="text-align: right;">
																		<button id="cartBtn"
																			style="background: white; padding-left: 300px; border: 0px;"
																			onclick="location.href="
																			<c:url value="/item/${cartList.itemIdx}/1"/>
																			data-itemIdx="${cartList.itemIdx}">
																	<img style="padding-left: 20px; width: 50px;"
																			id="heartImg"
																			src="<c:url value="/pictures/placeholder/heart.png"/>">
																		</button></div>
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
						</section>
					</div>
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
							aria-label="idbutton">${member.id }</a>
					</div>
					<div class="widget widget_tag_cloud">

						<div class="tagcloud">


							<div id="button">
								<c:if test="${member.memberStatus == 1}">
									<a href="<c:url value='/expert/join'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 등록</a>
								</c:if>
								<c:if test="${member.memberStatus == 2}">
									<a href="<c:url value='/expert/output'/>"
										class="tag-cloud-link" aria-label="admin change button">전문가로
										전환</a>
								</c:if>
							</div>
							<div class="row">
								<div class="widget">
									<h3 class="widget-title">나의 정보</h3>
									<ul>
										<li><a href="<c:url value="/mypageInfo"/>">내정보 수정</a></li>
										<li><a href="<c:url value="/mypagePurchase"/>">구매 관리</a></li>
										<li><a href="<c:url value="/cart"/>">장바구니</a></li>
										<li><a href="<c:url value="/mypagePwchange"/>">비밀번호
												수정</a></li>
										<li><a href="<c:url value="/mypageSession"/>">회원 탈퇴</a></li>
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
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script type="text/javascript">

	var cartListURL = "${pageContext.request.contextPath}/cart";
	var photoURL ="${pageContext.request.contextPath}/images/upload/"
	var heartURL ="${pageContext.request.contextPath}/pictures/placeholder/";

	$("#cartBtn").click(function() {
	    var itemIdx = $(this).attr("data-itemIdx");

	    if (confirm("장바구니를 삭제하시겠습니다.")) {
	        $.ajax({
	            type: "DELETE",
	            url: "${pageContext.request.contextPath}/cart/" + itemIdx,
	            dataType: "text",
	            success: function(result) {
	                if (result === "success") {
	                    window.location.href = "${pageContext.request.contextPath}/cart";
	                    alert("장바구니를 삭제하였습니다.");
	                    cartListDisplay();
	                    cartButton.attr("src", beforePhotoURL); // 이미지 변경
	                } else {
	                    alert("장바구니 삭제 중 오류가 발생했습니다.");
	                }
	            },
	            error: function(xhr) {
	                alert("장바구니 삭제 중 오류가 발생했습니다." + xhr.status);
	            }
	        });
	    }
	});
</script>


</body>
</html>