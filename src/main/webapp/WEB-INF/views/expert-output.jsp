<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>전문가페이지-포트폴리오</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" id="montserrat-css"
          href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" id="open-sans-css"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

    <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver =4.6.0"/>" type="text/css" media="all">
    <link rel="stylesheet" id="smartmenus-bootstrap-css" href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>"
          type="text/css" media="all">
    <link rel="stylesheet" id="swiper-css" href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css" media="all">
    <link rel="stylesheet" id="magnific-popup-css" href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-icon-css" href="<c:url value="/css/lana-pet-icon.min.css?ver=1.0.0"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-theme-css" href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-print-css" href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>" type="text/css"
          media="print">
  
          

 
</head>
<style>
#button{
	display: flex;
	justify-content: center;
	align-items center;
	padding-bottom: 2em;
	
}
.info {
margin-bottom: 22px;
}

/* 박스*/
.box {
 width: 100%;
 height: 50px;
 box-sizing: border-box;
 padding: 5px 0 5px 15px;
 border-radius: 4px;
 border: 1px solid #d9d6d6;
 color: #383838;
 font-weight: 400;
}

.box::placeholder {
  color: #a0a0a0;
}

.info#info__id #id-input {
  position: relative;
}

.info#info__id button {
  position: absolute;
  width: 90px;
  height: 40px;
  top: 0;
  bottom: 0;
  right: 5px;
  margin: auto 0;
  border-radius: 3px;
  font-size: 15px; 
}

h3 {
	font-size : 20px;
}

/* 카테고리 */
.info#info__category #category-flex {
  display: flex;
}

.info#info__category select {
  margin-left : 7px;
  color: #a0a0a0;
}

.info#info__category select:first-child {
  margin-left : 0px;
}

.info#info__category select::-webkit-scrollbar {
  width: 10px;
}

.info#info__category select::-webkit-scrollbar-thumb {
  background-color: #b6b6b6;
  border-radius: 3px;
}

.info#info__category select::-webkit-scrollbar-track {
  background-color: #ebe9e9;
  border-radius: 6px;
}

iframe [ src $ = ′ . pdf ′ ] {
width : 100 % ;
height : vh ;
}

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

tr td {
	padding: 0px 30px;
}

#list {
	padding-left: 30px;
}

a:link {
	color: #212121;
}

a:visited {
	color: #212121;
}

</style>
<body class="archive post-type-archive post-type-archive-lana_story">
<jsp:include page="header.jsp" />

<main class="main container">
<div id="info">
<div class="row">
	<div class="col-12 col-lg-8">
		<div class="widget">    
			<form class="story-posts" id="content">              
	        	<div class="box" style="height:1200px">
	        	<!-- iframe 태그는 유튜브 영상같은거 가져오는데도 좋다고함 -->
	        	<!-- 아니 왜안되는데 이거 경로 진짜 열받게하네 -->
	        	<!-- ex. <iframe width='500' height='350' src='https://youtu.be/F6OJslByCYQ?si=dEkTsFqCpZ3CGyvq'></iframe> -->
	        		<iframe src="$/resources/upload/portfolio/phy.pdf" width="700" height="380"></iframe>
					<div class="form-group row">
						<div class="col">
							<input type="text" value="${Member.id }" placeholder="전문가 아이디" readonly>
							<input type="text" value="${Expert.phone }" placeholder="전문가 전화번호" readonly>
						</div>
					</div>
					<div class="form-group row">
						<div class="col">
							<input type="text" value="${Expert.interest }" placeholder="전문분야" readonly>
							<input type="text" value="${Expert.career }" placeholder="전문분야 연차" readonly>
						</div>
					</div>   
					<div class="form-group row">
						<div class="col">
							<input type="text" value="${Expert.companayOne }" placeholder="회사1" readonly>
							<input type="text" value="${Expert.companyTwo }" placeholder="회사2" readonly>
							<input type="text" value="${Expert.companyThree }" placeholder="회사3" readonly>
						</div>
					</div>
					<div>
						<textarea style="width:650px; height:190px;" readonly>
							자기소개
							${Expert.introduce }
						</textarea>
					</div>    
					<div>
						<div class="row row-cols-1 row-cols-md-3 g-4" style="width:">
							<div id="post-1" class="post type-post post-1 card post-card post-grid-card h-100">
								<img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
									<div class="card-body">
										<ul class="post-meta">
											<li><a href="single.html">2023/8/17</a></li>
											<li><a href="#">카테고리1</a></li>
										</ul>
									<h5 class="post-title card-title"><a href="single.html">코인 투자 분석</a></h5>
										<p class="post-text card-text">
											우리가 소제목을 안받으니까 여기다간 내용이 오도록 해야 함ddddddddd
										</p>
									</div>
							</div>
							<div id="post-1" class="post type-post post-1 card post-card post-grid-card h-100">
								<img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
									<div class="card-body">
										<ul class="post-meta">
											<li><a href="single.html">2023/8/17</a></li>
											<li><a href="#">카테고리2</a></li>
										</ul>
									<h5 class="post-title card-title"><a href="single.html">뭘봐</a></h5>
										<p class="post-text card-text">
											진짜 이건 또 어케 띄우냐 하 개열받네 진짜 또 이거 칸도 염병을하네
										</p>
									</div>
							</div>
							<div id="post-2" class="post type-post post-2 card post-card post-grid-card h-100">
								<img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
									<div class="card-body">
										<ul class="post-meta">
											<li><a href="single.html">2023/8/16</a></li>
											<li><a href="#">카테고리3</a></li>
										</ul>
										<h5 class="post-title card-title"><a href="single.html">개구리</a></h5>
										<p class="post-text card-text">
											개굴개굴개굴개꿀깨꿀꺠루럐루꺠루꺠루ㅒ꾸럐ㅜ럐꾸ㅒ루ㅒ루ㅒ루럐
										</p>
									</div>
							</div>
						</div>	
					</div>		
	        	</div>
        	</form>
        </div> 
	</div>   
	<div class="col-12 col-lg-4 mt-4 mt-lg-0">
			<div class="widget-sidebar story-sidebar">

				<div id="img">
					<img src="<c:url value="/pictures/placeholder/profile.png"/>"
						class="rounded-circle" alt="Author" width="200" height="200">
				</div>
				<div id="button" style="text-align: center;">
					<a href="#" class="tag-cloud-link" aria-label="idbutton">${member.id}</a>
				</div>
				<div class="widget widget_tag_cloud">
					<div class="tagcloud">
						<div id="changBtn" style="text-align: center;">
							<a href="/mypagePurchase" class="tag-cloud-link"
								aria-label="admin change button">일반인으로 전환</a>
								<br>
								
						</div>
								<br>
						<div class="row">
							<div class="widget" style="text-align: left;" id="list">
								<h3 class="widget-title" id="expertmain" style="color: #ff8a00;">포트폴리오</h3>
								<ul style="color: black;">
									<li><a href="<c:url value="/expert/input"/>" id="info"
										class="expertmenu">전문가 정보</a></li>
									<li><a href="<c:url value="/expert/sales"/>" id="sale"
										class="expertmenu" onclick="menuchange()">판매 관리</a></li>
									<li><a href="<c:url value="/expert/output "/>" id="po"
										class="expertmenu" onclick="menuchange()">포트폴리오</a></li>
									<li><a href="<c:url value="/expert/item"/>" id="item"
										class="expertmenu" onclick="menuchange()">상품 등록</a></li>
								</ul>
							</div>
						</div>
			<!-- 			<div class="row">
							<div class="widget" style="text-align: left;" id="list">
								<h3 class="widget-title" id="expertmain" style="color: #ff8a00;">판매
									관리</h3>
								<ul style="color: black;">
									<li><a href="javascript:menuchange();" id="info"
										class="expertmenu">전문가 정보</a></li>
									<li><a href="javascript:menuchange();" id="sale"
										class="expertmenu" onclick="menuchange()">판매 관리</a></li>
									<li><a href="javascript:menuchange();" id="po"
										class="expertmenu" onclick="menuchange()">포트폴리오</a></li>
									<li><a href="/expertitem" id="item"
										class="expertmenu" onclick="menuchange()">상품 등록</a></li>
								</ul>
							</div>
						</div> -->
					</div>
				</div>
			</div>
		</div>
</div>
</main>
<jsp:include page="footer.jsp"/>

<script type="text/javascript" src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
<script type="text/javascript" src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
<script type="text/javascript" src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>

</body>
</html>