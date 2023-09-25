<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>상품 페이지 - 상품 상세 페이지</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>">

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
<link
	href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@200&display=swap"
	rel="stylesheet">






<style type="text/css">
h1 {
	font-size: 35px;
}

h4 {
	font-size: 20px;
}

a {
	color: black;
}

.phy {
	border: 1px solid white; /* 테두리 스타일 및 색상 설정 */
	padding: 10px; /* 내부 여백 설정 */
	background-color: green; /* 배경색 설정 */
}

.col-lg-8 {
	flex: 0 0 83.66667%;
	max-width: 83.3333%;
}

.post-content {
	margin-top: 43px;
	font-family: "Noto+Sans+KR:wght@200";
}

.post-content#detailbox {
	width: 100%;
	height: 115px;
	display: flex;
	flex-direction: column;
	align-items: flex-end;
	/* border-bottom : solid 1px gray; */
	margin-top: 80px;
}

.post-content#detailbox button {
	background-color: #ffb32f;
	color: #f8f8f8;
	cursor: pointer;
	border: none;
	box-sizing: border-box;
	font-weight: 400;
	border-radius: 5px;
	transition: .1s;
}

.post-content#detailbox button:focus-visible {
	outline: 0px solid;
	background-color: #da8a00;
}

.post-content#detailbox button:hover {
	outline: 0px solid;
	background-color: #da8a00;
}

.gongback {
	margin-top: 43px;
	margin-bottom: -14px;
	display: flex;
	flex-direction: column;
	align-items: flex-end;
}

#jul {
	margin-bottom: 20px;
	/*border-bottom : solid 1px gray;*/
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
</style>
<script type="text/javascript">
	function disableLink() {
		return false;
	}
</script>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
</head>
<body class="single single-post">
	<jsp:include page="header.jsp" />
	<main class="main">
		<div id="post-1"
			class="post type-post post-1 has-post-thumbnail comment-open">
			<div class="container post-container bg-white">
				<div class="row justify-content-center post-row no-gutters">
					<div class="col-12 col-sm-11 col-md-10 post-thumbnail-col">
						<h1>${item.itemName }</h1>
						<div class="gongback">
							<h4>
								<a href="<c:url value="expertoutput/${item.expertIdx }"/>">전문가
									번호 : ${item.expertIdx }</a>
								<button style="float: right; padding: 5px;" id="kakaoShareBtn">카카오톡
									공유하기</button>
							</h4>
							<h4>${item.itemDate }</h4>
						</div>
						<hr>
						<div id="jul">&nbsp;</div>
						<img class="img-fluid post-thumbnail"
							src="<c:url value='/images/upload/${originalFileName}'/>"
							alt="Post">
					</div>
					<div class="col-12 col-sm-11 col-md-10 col-lg-8 post-col">
						<div class="post-content">
							<h4>${item.itemContent }</h4>
							<div class="post-content" id="detailbox">
								<h4 style="float: right;">
									₩
									<fmt:formatNumber type="number" value="${item.price}"
										pattern="#,###" />
								</h4>
								<!-- 권한 상관 없이 로그인 인증을 받은 경우 -->
								<sec:authorize access="hasAnyRole('ROLE_MEMBER','ROLE_EXPERT')">
									<span> <c:if test="${not empty cartList}">
											<button id="cartBtn" style="background: white;">
												<img style="padding: 0px 10px; width: 50px;" id="heartImg"
													src="<c:url value="/pictures/placeholder/heart.png"/>">
											</button>
										</c:if> <c:if test="${empty cartList}">
											<button id="cartBtn" style="background: white;"
												data-itemIdx="${item.itemIdx} ">
												<img style="padding: 0px 10px; width: 50px;" id="heartImg"
													src="<c:url value="/pictures/placeholder/noheart.png"/>">
											</button>
										</c:if>
								</sec:authorize>
								<sec:authorize access="hasAnyRole('ROLE_MEMBER','ROLE_EXPERT')">
									<button style="float: right; padding: 5px;"
										onclick="location.href='<c:url value="/payment/${item.itemIdx}"/>'">결제하기</button>
									<input type="hidden" name="${_csrf.parameterName }"
										value="${_csrf.token }">
									</span>
								</sec:authorize>
							</div>
						</div>
						<hr>
					</div>
				</div>
			</div>
		</div>


		<div class="container comments-container bg-white">
			<div class="row justify-content-center comments-row no-gutters">
				<div class="col-12 col-sm-11 col-md-10 col-lg-8">
					<h4 class="comments-title font-weight-bold">Comments</h4>
					<c:forEach var="reviewList" items="${reviewList}">
						<ul class="comment-list list-unstyled">
							<li class="media"><img
								class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
								src="<c:url value="/pictures/placeholder/65x65.svg"/>"
								alt="Avatar">
								<div class="media-body">
									<div class="d-bock d-md-flex w-100 justify-content-between">
										<h5 class="comment-title">
											<span>${reviewList.member.id}</span>
										</h5>
										<div class="comment-date">
											<span>${reviewList.review.reviewDate}</span>
										</div>
									</div>
									<div class="comment-text">
										<p>${reviewList.review.content}</p>
									</div>
									
									<c:if test="${reviewList.review.answerContent} != null">
										<div style="padding-left: 10px"
										class="d-bock d-md-flex w-100 justify-content-between">
										<h5 class="comment-title">
											<span
												style="color: blue; , font-size: 10px; , padding-left: 10px;">판매자</span>
										</h5>
										<div class="comment-date">
											<span>&nbsp&nbsp&nbsp ${reviewList.review.answerDate}</span>
										</div>
										</div>
										<div class="comment-text">
											<p>${reviewList.review.answerContent}</p>
										</div>
									
									</c:if>
									


									<ul class="comment-meta">

										<li id="replyButton"><a id="reply-btn"
											href="<c:url value="/board/add/reply/${item.itemIdx}/${reviewList.review.reviewIdx}"/>"
											class="comment-reply"> <i
												class="fas fa-reply fa-flip-horizontal"></i> Reply
										</a></li>
									</ul>
								</div></li>

						</ul>
					</c:forEach>

				</div>
			</div>



			<hr />
			<!-- <nav class="navigation pagination comment-pagination justify-content-between text-uppercase"
                         role="navigation">
                        <a class="prev disabled" href="#">
                            Prev
                        </a>
                        <div class="nav-links">
                            <ul class="page-numbers">
                                <li><span aria-current="page" class="page-numbers current">1</span></li>
                                <li><a class="page-numbers" href="#">2</a></li>
                                <li><a class="page-numbers" href="#">3</a></li>
                            </ul>
                        </div>
                        <a class="next" href="#">
                            Next
                        </a>
                    </nav> -->
			<div style="color: red;">${message}</div>
			<div style="height: 100px"></div>
			<div id="respond" class="comment-respond">
				<h4 id="reply-title" class="comment-reply-title font-weight-bold">게시글
					쓰기</h4>
				<form method="Post" id="commentform"
					class="comment-form form-horizontal"
					action="<c:url value="/board/add/${item.itemIdx}"/>">
					<div class="form-group row">
						<div class="col">
							<textarea class="form-control" name="content" rows="8"
								title="Comment" placeholder="Comment" aria-required="true"
								required="required"></textarea>
						</div>
					</div>
					<div class="row text-center">
						<div class="col">
							<input name="submit" type="submit" id="submit"
								class="btn btn-primary btn-lg text-uppercase font-weight-bold w-15x"
								value="Post Comment">
						</div>
					</div>
					<sec:csrfInput />
					<input type="hidden" name="${_csrf.parameterName }"
						value="${_csrf.token }">
					<!-- 토큰 생성  -->
				</form>
			</div>
		</div>


	</main>
	<jsp:include page="footer.jsp" />

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
	<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							var beforePhotoURL = "${pageContext.request.contextPath}/pictures/placeholder/noheart.png";
							var afterPhotoURL = "${pageContext.request.contextPath}/pictures/placeholder/heart.png";
							var itemIdx = $
							{
								itemIdx
							}
							;
							var cartButton = $("#heartImg");
							cartButton
									.click(function() {
										if (cartButton.attr("src") === beforePhotoURL) {
											$
													.ajax({
														type : "POST",
														url : "${pageContext.request.contextPath}/item/"
																+ itemIdx
																+ "/1",
														success : function(
																response) {
															if (response === "success") {
																alert("장바구니에 상품이 추가되었습니다.");
																cartButton
																		.attr(
																				"src",
																				afterPhotoURL); // 이미지 변경
															} else {
																alert("로그인 사용자만 가능합니다.");
															}
														},
														error : function() {
															alert("장바구니 추가 중 오류가 발생했습니다.");
														}
													});
										} else if (cartButton.attr("src") === afterPhotoURL) {
											if (confirm("장바구니를 삭제하시겠습니다.")) {
												$
														.ajax({
															type : "DELETE",
															url : "${pageContext.request.contextPath}/item/"
																	+ itemIdx
																	+ "/delete",
															dataType : "text",
															success : function(
																	result) {
																if (result === "success") {
																	alert("장바구니를 삭제하였습니다.");
																	cartButton
																			.attr(
																					"src",
																					beforePhotoURL); // 이미지 변경
																} else {
																	alert("장바구니 삭제 중 오류가 발생했습니다.");
																}
															},
															error : function(
																	xhr) {
																alert("장바구니 삭제 중 오류가 발생했습니다."
																		+ xhr.status);
															}
														});
											}
										}
									});
						});
	</script>
	<script>
		document.getElementById('kakaoShareBtn').addEventListener('click',
				kakaoShare);

		Kakao.init('7be891cc70acabb92e26dbe3b9b50d68');

		function kakaoShare() {
			var itemName = "${item.itemName}";
			var itemContent = "${item.itemContent}";
			var originalFileName = "${originalFileName}";

			Kakao.Link
					.sendDefault({
						objectType : 'feed',
						content : {
							title : itemName,
							description : itemContent,
							imageUrl : originalFileName,
							link : {
								mobileWebUrl : 'http://localhost:8000/item/${itemList.item.itemIdx}/1',
								webUrl : 'http://localhost:8000/item/${itemList.item.itemIdx}/1'
							}
						},
						buttons : [ {
							title : '웹으로 보기',
							link : {
								mobileWebUrl : 'http://localhost:8000/item/${itemList.item.itemIdx}/1',
								webUrl : 'http://localhost:8000/item/${itemList.item.itemIdx}/1'
							}
						} ]
					});
		}
	</script>

</body>
</html>