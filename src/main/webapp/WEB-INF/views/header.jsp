<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
	type="text/css">
<link rel="preconnect" href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect" href="<c:url value="https://fonts.gstatic.com"/>" crossorigin/>
<link
	href="<c:url value="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"/>"
	rel="stylesheet">
<link rel="preconnect" href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect" href="<c:url value="https://fonts.gstatic.com"/>" crossorigin"/>
<link
	href="<c:url value="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap"/>"
	rel="stylesheet">
<style type="text/css">
.profile {
	display: block;
	width: 100%;
	height: 100%;
	padding-left: 30px;
	padding-right: 30px;
}

.dropdown:hover .dropdown-menu {
	display: block;
}

p #logo {
	width: 400px;
	height: 70px;
}

#logo a {
	font-family: 'Permanent Marker', cursive;
	padding-left: 30px;
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

.name {
	font-family: 'Permanent Marker', cursive;
}
</style>
</head>

<body class="home page page-template-template-lana-editor">

	<!--로그인 팝업창 by J  uho on-->

	<div class="black-bg">
		<div class="white-bg">
			<div>
				<div class="mb-3">
					<!-- <h1 class="name">ForNula</h1> -->
					<div class="name">FORNUAL</div>
					<p class="close">
						<img src="<c:url value="/pictures/placeholder/cancel_96921.svg"/>"
							alt="close">
					</p>
					<label for="exampleInputEmail1" class="form-label"></label> <input
						type="text" id="id-input" class="form-control" placeholder="아이디"
						name="id">
					<div id="emailHelp" class="form-text"></div>
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label"></label> <input
						type="password" class="form-control" id="password-input"
						placeholder="Password" name="password">
				</div>
				<div class="front-error"></div>

				<div class="id-pw-find">
					<a href="<c:url value="/member/findId"/>">아이디 찾기 /</a><a
						href="<c:url value="/member/findPw"/>">&nbsp;비밀번호 찾기 </a>
				</div>
				<div class="btn-container">
					<button type="submit" id="login" class="btn btn-light">로그인</button>
					<button type="button" id="join" class="btn btn-light"
						onclick="location.href='/member/join'">회원가입</button>
				</div>
				<div id="logos">
					<a href="<c:url value=""/>">
					</a>
					<img
						src="<c:url value="/pictures/placeholder/social.png"/>"
						alt="google"></a>
						<a href="<c:url value=""/>"><img
						src="<c:url value="/pictures/placeholder/instagram.png"/>"
						alt="instagram"></a> 
						<a href="<c:url value=""/>"><img
						src="<c:url value="/pictures/placeholder/facebook.png"/>"
						alt="facebook"></a> 
						<a href="<c:url value=""/>"><img
						src="<c:url value="/pictures/placeholder/kakao-talk.png"/>"
						alt="kakao"></a>
				</div>
			</div>
		</div>
	</div>


	<header class="header position-relative">
		<div class="header-navbar border-bottom border-white">
			<nav
				class="navbar navbar-expand-lg navbar-light py-4 bg-light-orange"
				id="lana-pet-main-navbar" data-lana-collapse-bg="bg-light-orange"
				id="lana-pet-main-navbar">
				<p id="logo">
					<a class="navbar-brand" href="<c:url value="/"/>"> FORNUAL </a>
				</p>

				<div class="toggler-buttons d-flex flex-fill justify-content-end">
					<!-- 화면크기 조정시 검색 토글  버튼  -->
					<button class="search-toggler" type="button" data-toggle="collapse"
						data-target="#lana-search" aria-controls="lana-search"
						aria-expanded="false" aria-label="Toggle search">
						<i class="fas fa-search fa-lg fa-fw text-dark"></i>
					</button>
					<!-- 화면크기 조정시 카테고리 토글  버튼  -->
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#lana-navbar" aria-controls="lana-navbar"
						aria-expanded="false" aria-label="Toggle navigation">
						<i class="fas fa-bars fa-lg fa-fw text-dark"></i>
					</button>
				</div>

				<c:if
					test="${sessionScope.loginMember ==null || sessionScope.loginMember.memberStatus == 0  }">


						<!-- NAVBAR 메뉴 - 드랍다운 박스  -->
						<div class="collapse navbar-collapse" id="lana-navbar">
							<ul class="navbar-nav ml-lg-auto">
								<li class="nav-item dropdown">
								<a
									class="nav-link dropdown-toggle" href="<c:url value="/item/boardList"/>"
									id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false">카테고리</a>
									<ul class="dropdown-menu" aria-labelledby="page-dropdown">
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">디자인</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">그래픽
												디자인</a></li>
										<li><a class="dropdown-item" href=""<c:url value="/item/boardList"/>">제품
												디자인</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">번역</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">영어
												번역</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">중국어
												번역</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">사진·편집</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">헤어
												메이크업</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">제품·홍보
												사진</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">세무</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">사업자
												세무</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">개인
												세무</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">마케팅</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">SNS
												홍보</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">해외
												마케팅</a></li>
									</ul>
								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">디자인</a></li>

								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">번역</a></li>

								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">사진·편집</a></li>

								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">세무</a></li>
								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">마케팅</a></li>
							</ul>
						</div>


					<!-- 토글, 검색 버튼  -->
					<div class="d-none d-xl-inline-flex ml-xl-4">
						<!-- 검색 기능 주석 처리 -->
						<!-- <form class="search-widget d-none d-xl-inline-flex ml-3">
						<button class="search-toggler" type="button"
							data-toggle="collapse" data-target="#lana-search"
							aria-controls="lana-search" aria-expanded="false"
							aria-label="Toggle search">
							<i class="fas fa-search fa-2x fa-fw text-dark"></i>
						</button>
					</form> -->
						<!-- 로그인버튼 삽입 -->
						<div class="button-nav-widget d-none d-xl-inline-flex">
							<ul class="nav button-nav">
								<li class="nav-item"><a href="<c:url value="#"/>"
									class="btn btn-sm btn-outline-primary text-orange text-uppercase font-weight-bold my-auto"
									id="loginButton"> Login </a></li>
							</ul>
						</div>
				</c:if>
				<c:if test="${sessionScope.loginMember !=null}">
					<c:if
						test="${sessionScope.loginMember.memberStatus == 1 ||sessionScope.loginMember.memberStatus == 2}">
						<div class="collapse navbar-collapse" id="lana-navbar">
							<ul class="navbar-nav ml-lg-auto">
								<li class="nav-item dropdown"><a
									class="nav-link dropdown-toggle" href="<c:url value="/item/boardList"/>"
									id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false">카테고리</a>
									<ul class="dropdown-menu" aria-labelledby="page-dropdown">
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">디자인</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">그래픽
												디자인</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">제품
												디자인</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">번역</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">영어
												번역</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">중국어
												번역</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">사진·편집</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">헤어
												메이크업</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">제품·홍보
												사진</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">세무</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">사업자
												세무</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">개인
												세무</a></li>
										<li>
											<h6 class="dropdown-header font-weight-medium text-primary">마케팅</h6>
										</li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">SNS
												홍보</a></li>
										<li><a class="dropdown-item" href="<c:url value="/item/boardList"/>">해외
												마케팅</a></li>
									</ul>
								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">디자인</a></li>

								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">번역</a></li>

								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">사진·편집</a></li>

								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">세무</a></li>
								<li><a class="nav-link dropdown-toggle"
									href="<c:url value="/item/boardList"/>">마케팅</a></li>
							</ul>
							<form action="/member/logout" method="post">
								<!-- 프로필 사진 삽입 -->
								<div class="dropdown">
									<div class="profile">
										<c:if test="${sessionScope.loginMember.memberStatus == 1}">
											<a class="dropdown-toggle" href="<c:url value="/mypageInfo"/>" role="button"
												data-bs-toggle="dropdown" aria-expanded="false"> <img
												src="<c:url value="/pictures/placeholder/profile.png"/>"
												class="rounded-circle" alt="profilephoto" width="60"
												height="60">
											</a>

											<ul class="dropdown-menu" id="loginDropDown">
												<li><a class="dropdown-item" href="<c:url value="/mypageInfo"/>">내
														정보 관리</a></li>
												<li><a class="dropdown-item" href="<c:url value="/expert/join"/>">전문가
														등록</a></li>
										</c:if>

										<c:if test="${sessionScope.loginMember.memberStatus == 2}">
											<a class="dropdown-toggle"
												href="<c:url value="/expert/output "/>" role="button"
												data-bs-toggle="dropdown" aria-expanded="false"> <img
												src="<c:url value="/pictures/placeholder/profile.png"/>"
												class="rounded-circle" alt="profilephoto" width="60"
												height="60">
											</a>
											<ul class="dropdown-menu" id="loginDropDown">
											<li><a class="dropdown-item" href="<c:url value="/mypageInfo"/>">내
														정보 관리</a></li>
												<li><a class="dropdown-item"
													href="<c:url value="/expert/output "/>">전문가 정보</a></li>
										</c:if>
										<!-- <li><a class="dropdown-item" href="<c:url value="#"/>">장바구니</a> -->

										<div style="padding-left: 18px;">
											<button
												style="border: none; background-color: white; color: black;"
												type="submit" id="logout">로그아웃</button>
										</div>
										</ul>
									</div>
								</div>

							</form>
					</c:if>
					<c:if test="${sessionScope.loginMember.memberStatus == 9 }">
						<div style="text-align: right;">
							<form action="/member/logout" method="post">
								<a href="<c:url value="/admin/user"/>">&nbsp;&nbsp;회원 관리&nbsp;&nbsp;|</a>&nbsp;&nbsp;
								<a href="<c:url value="/admin/item"/>">상품 관리</a>
								<button
									style="border: 0px; background: background-color: #ffffff; opacity: 0.5; color: black;"
									type="submit" id="logout">로그아웃</button>
								<p>관리자: ${sessionScope.loginMember.id }님이 로그인하셨습니다.</p>
							</form>
						</div>
					</c:if>
				</c:if>
		</div>

		<!-- <div class="collapse search-collapse py-4 bg-light text-white position-absolute animated fadeInDown"
			id="lana-search">
			검색 기능 주석 처리
			<form method="get"
					class="search-form d-flex align-items-center h-100">
					<div class="input-group search border-transparent">
						<input type="text" name="s"
							class="form-control search-input text-dark" placeholder="Search"
							aria-label="Search" aria-describedby="search-button">
						<div class="input-group-append">
							검색 아이콘 버튼
							<button type="button" class="btn btn-sm close-button"
								data-toggle="collapse" data-target="#lana-search"
								aria-controls="lana-search" aria-expanded="true"
								aria-label="Close search">
								<i class="fas fa-times fa-lg text-dark"></i>
							</button>
						</div>
						<div class="input-group-append">
							<button type="submit" id="search-button"
								class="btn search-button">
								<i class="fa fa-search fa-lg text-dark"></i>
							</button>
						</div>
					</div>
				</form>
		</div> -->

		</nav>
		</div>
	</header>
	<script type="text/javascript"
		src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>

	<script>
	let loginButton = document.querySelector('#loginButton');
	let close = document.querySelector('.close');
	let id = document.querySelector('#id-input');
	let password = document.querySelector('#password-input');
	let loginSubmit = document.querySelector('#login');
	let frontError = document.querySelector('.front-error');
	
	
	loginButton.addEventListener('click', () => {
	    document.querySelector('.black-bg').classList.add('show-modal');
	    console.log(1);
	})
	
	close.addEventListener('click', () => {
	    document.querySelector('.black-bg').classList.remove('show-modal');
	})
	
	let submitCheck = false;
	
	loginSubmit.addEventListener('click', (e) => {
		
		
		if(id.value == "" || id.value == null) {
			frontError.style.display = 'flex';
			frontError.innerHTML = "아이디 또는 비밀번호가 맞지 않습니다."
			frontError.style = 'color : red';
            e.preventDefault();
            return;
		}
		
		if(password.value == "" || password.value == null) {
			frontError.style.display = 'flex';
			frontError.innerHTML = "아이디 또는 비밀번호가 맞지 않습니다."
			frontError.style = 'color : red';
           	e.preventDefault();
            return;
		}
		
		
		
		fetch("<c:url value="/member/login"/>", {
			  method: "POST", 
			  headers: { 
			    "Content-Type": "application/json",
			  }, body: JSON.stringify({ 
				    "id" : id.value,
				    "password" : password.value
				  })
			})
		.then((response) => response.json())
        .then((data) => {
            	  
           	if(data.errorCode === "Bad") {
            	console.log(data.message);
            	frontError.innerHTML = data.message;
            	frontError.style = "color : red";
            } else {
         		// 메인페이지 헤더에 로그인한 사용자 이름 추가 예정
         		
            	location.href = "<c:url value="/"/>";
            	} 
              })
              
         e.preventDefault();
	});
	
	
	
	
	
	
	
	
	
	
	
	


</script>