<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>  
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>결제 페이지</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
	type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link
	href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
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

.id {
   text-align: center;
   padding: 5px 20px;
   color: black;
   background: white;
   border-radius: 10px;
   border: 2px solid orange;
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
												src="<c:url value='/images/upload/${originalFileName}'/>"
												alt="Post">

										</div>
										<div class="col-md-8">
											<div
												class="card-body h-100 d-flex align-items-start flex-column">
												<ul class="post-meta">
												</ul>
												<p class="post-text card-text">
												<h4 class="post-title card-title">
													<a href= "">${payment.itemName}</a>
												</h4>
												<p class="subtitle"></p>
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
							<div class="tagcloud">
								<div class="widget"
									style="text-align: left; padding-left: 20px; margin: 0 auto;"
									id="list">
									<label>총 결제 금액</label>
									<p>₩ ${payment.price}</p>
									<hr>
									<input class="check" type="checkbox" name="agree"
										onclick="agreeCheck()">&nbsp;결제 전 안내사항<br> <input
										class="check" type="checkbox" name="agree"
										onclick="agreeCheck()">&nbsp;개인 정보 제 3자 제공
								</div>
								<br>
								<p style="text-align: center; font-size: 15px; color: gray; width: 100%">위
									내용을 확인하였고, 결제에 동의합니다.</p>
								<div style="width: 100%;">
						               <button id="html5_inicis" type="button" class="id"
										style="text-align: center;" name="inicisBtn" disabled>일반결제(KG이니시스)</button>
										<button id="kakaopay" type="button" class="id"
										style="text-align: center;" name="kakaoBtn" >간편결제(카카오페이)</button>
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
	<script src="https://cdn.iamport.kr/v1/iamport.js"></script>
	<script type="text/javascript">
	
		function agreeCheck(element) {
			let checkedbox = document.querySelectorAll('input[class=check]:checked');
			let cnt = checkedbox.length;
			
			if(cnt ==3 ){
				document.querySelector('#html5_inicis').disabled=false;
			}else{
				document.querySelector('#html5_inicis').disabled=true;
			}
		};
		/*
		document.querySelector('#checkSubmit').addEventListener('click', () => {
			paymentForm.submit();
		});
		
		
			$('#kakaoSubmit').click(function(){
				$.ajax({
					url:'/cls/jq/kakaopay.cls' ,
					method : 'GET',
				dataType: 'json' ,
				success:function(data){
					alert(data.tid);
				},
				error:function(error){
					console.log(error);
				}
				});
			});
			/*
		document.querySelector('#kakaoSubmit').addEventListener('click', (e) => {
			 fetch("${pageContext.request.contextPath}/cls/jq/kakaopay.cls", 
					 {
				  method: "get", 
				  headers: { 
					"Content-Type" : "application/json", 
				    "Accept": "application/json"},
				 
				})
			.then((response) => response.json())
			.then((data) => {
				 if(data.errorCode === "Bad") {
					 
		             alert(data.error);
		           
				 }
				 var box = data.next_redirect_pc_url;
				 window.open(box);
			
			    })
			    
			e.preventDefault()
		});
		*/
		
		
     // var csrfHeaderName="${_csrf.headerName}"
     // var csrfTokenValue="${_csrf.token}"
	  //$(document).ajaxSend(function(e, xhr) {
	  //xhr.setRequestHeader(csrfHeaderName,csrfTokenValue);
		
	//});
      
      $(".id").click(function() {
    	  var pg=$(this).attr("id");
    	  
    	  console.log(pg);
    	  
    	  var IMP=window.IMP;
    	  IMP.init("imp53224164");
    	  
    	  var merchantUid="merchant_"+new Date().getTime();
    	  var amount=${payment.price};
    	  var itemIdx=${payment.itemIdx};
  
      
    	//결제 전 주문번호와 결제금액을 세션에 저장하기 위한 페이지 요청
  		// => 결제 후 결제정보와 비교하여 검증하기 위해 세션에 저장 
  		$.ajax({
  			type: "post",
  			url: "<c:url value="/payment"/>",
  			contentType: "application/json",
  			data: JSON.stringify({"merchantUid":merchantUid, "amount":amount, "itemIdx": itemIdx}),
  			dataType: "text",
  			success: function(result) {
  				if(result=="ok") {
  					//결제를 요청하는 메소드 호출
  					IMP.request_pay({
  						// 결제 대행사
  						pg : pg,
  						// 결제 방식 : card(카드)
  						pay_method : "card",
  						//주문번호
  						merchant_uid : merchantUid,
  						//결제금액
  						amount : amount,
  						//결제창에 보여질 제품명
  						name: "컴퓨터",
  						//결제 사용자의 이메일 주소 
  			            buyer_email: "ws5501@naver.com",
  			            buyer_name: "윤주훈",//결제 사용자 이름
  			            buyer_tel: "010-8287-9856",//결제 사용자 전화번호
  			            buyer_postcode: "123-456",//결제 사용자 우편번호
  			            buyer_addr: "서울시 강남구 역삼동 내빌딩 5층 501호"//결제 사용자 주소
  						//m_redirect_url: "http://localhost:8000:auth/payment/pay",//모바일의 리다이렉트 URL 주소
  				   
  				},function(response) {//결제 관련 응답 결과를 제공받아 처리하는 함수
					//response : 응답결과를 저장한 Object 객체
					if (response.success) {//결제한 경우
						//결제금액을 검증하기 위한 페이지를 요청
						$.ajax({
							type: "post",
							url: "<c:url value="/payment/complete"/>",
							contentType: "application/json",
							data: JSON.stringify({"impUid": response.imp_uid, "merchantUid": response.merchant_uid, "itemIdx": itemIdx}),
							dataType: "text",
							success: function(result) {
								if(result == "success") {
									console.log(result);
									//결제 성공 페이지로 이동
									alert("결제 성공");
									location.href = "<c:url value="/common-success"/>";
								} else {
									//결제 실패 페이지로 이동
									console.log(result);
									alert("결제 취소");
									location.href = "<c:url value="/common-success"/>";
								}
							}, 
							error: function(xhr) {
								console.log(xhr);
							}
						});
					}
				}  );
			}
		}, 
  			
  			error: function(xhr) {
  				console.log(xhr);
  			}
  		});
  		
  	});
  		
		
	</script>
</body>
</html>