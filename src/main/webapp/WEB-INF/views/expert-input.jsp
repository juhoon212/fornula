<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>전문가페이지-전문가의정보</title>
 
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

</style>
<body class="archive post-type-archive post-type-archive-lana_story">

<jsp:include page="header.jsp" />

<main class="main container">
    <div class="row">
    <div class="col-12 col-lg-8">
    <div class="widget">     
    <form class="story-posts" id="content">              
<section>
<!-- my-page style-->
<style>
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
</style>
<!-- 스타일 태그 끝 -->
        <h3>전문가 번호</h3>
        <div class="info" id="info__id">        
          <div id="id-input">
            <input class="box" type="text" placeholder="여기다가 로그인한 전문가의 전문가번호" readonly/>            
          </div>          
        </div>

        <h3>이메일</h3>
        <div class="info">
          <div id="id-input">
            <input class="box" type="text" placeholder="여기에 로그인한 전문가의 Email 불러오기"/>            
          </div>
        </div>
      
        <h3>포트폴리오 수정 / 등록</h3>
        <div class="info">
          <input class="box" type="text" placeholder="여기다가 기능 구현"/> 
        </div>
        
        <h3>관심사 분야</h3>
        <div class="info" id="info__category">
          <div id="category-flex">
            <input class="box" type="text" placeholder="기존의 관심사" readonly/> 
            <select class="box" id="category-middle">
              <option disabled selected>변경할 관심사</option>
            </select>
          </div>
          <div class="error-msg"></div>
        </div>
        <div class="info" id="info__category">
          <div id="category-flex">
            <input class="box" type="text" placeholder="기존의 관심사" readonly/> 
            <select class="box" id="category-middle">
              <option disabled selected>변경할 관심사</option>
            </select>
          </div>
          <div class="error-msg"></div>
        </div>
        <div class="info" id="info__category">
			<div id="category-flex">
            	<input class="box" type="text" placeholder="기존의 관심사" readonly/> 
            	<select class="box" id="category-middle">
              	<option disabled selected>변경할 관심사</option>
            	</select>
			</div>
		</div>
			<div class="row row-cols-1 row-cols-md-3 g-4">
				<div id="post-1" class="post type-post post-1 card post-card post-grid-card h-100">
					<img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
						<div class="card-body">
							<ul class="post-meta">
								<li><a href="single.html">2023/8/17</a></li>
								<li><a href="#">카테고리1</a></li>
							</ul>
						<h5 class="post-title card-title"><a href="single.html">코인 투자 분석</a></h5>
							<p class="post-text card-text">
								우리가 소제목을 안받으니까 여기다간 내용이 오도록 해야 함
							</p>
						</div>
				</div>
				<div id="post-1" class="post type-post post-1 card post-card post-grid-card h-100">
					<img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
						<div class="card-body">
							<ul class="post-meta">
								<li><a href="single.html">2023/8/17</a></li>
								<li><a href="#">카테고리1</a></li>
							</ul>
						<h5 class="post-title card-title"><a href="single.html">코인 투자 분석</a></h5>
							<p class="post-text card-text">
								우리가 소제목을 안받으니까 여기다간 내용이 오도록 해야 함
							</p>
						</div>
				</div>
				<div id="post-2" class="post type-post post-2 card post-card post-grid-card h-100">
					<img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
						<div class="card-body">
							<ul class="post-meta">
								<li><a href="single.html">2023/8/16</a></li>
								<li><a href="#">카테고리1</a></li>
							</ul>
						<h5 class="post-title card-title"><a href="single.html">개구리</a></h5>
							<p class="post-text card-text">
								개굴개굴개굴개꿀깨꿀꺠루럐루꺠루꺠루ㅒ꾸럐ㅜ럐꾸ㅒ루ㅒ루ㅒ루럐
							</p>
						</div>
				</div>
			</div>
	 		<a class="prev disabled" href="#">Prev</a>
			<a class="next" href="#">Next</a>
		<div class="error-msg"></div>    
      <div id="change-complete"></div>
      <!-- 수정완료 버튼을 클릭하면 updateExpert 메소드가 실행되도록 설계 -->
      <button id="submit">수정완료</button> 
</section>
</form>
</div>
</div>  
	<div class="col-12 col-lg-4 mt-4 mt-lg-0">
		<div class="widget-sidebar story-sidebar">   
            <div id="button"><img src="<c:url value="/pictures/placeholder/250x250.svg"/>"
               class="img-fluid rounded-circle mr-1 w-auto" alt="Author"></div>
				<div id="button"><a href="#" class="tag-cloud-link" aria-label="idbutton">아이디</a></div>
					<div class="widget widget_tag_cloud">
                    <div class="tagcloud">
						<div id="button"><a href="#" class="tag-cloud-link" aria-label="admin change button">일반회원으로 전환</a></div>
						<div class="row" >
					<div class="widget">
                    	<h3 class="widget-title">메뉴</h3>
                    	<ul>
                        	<li><a href="#">전문가 정보 수정/등록</a></li>
                        	<li><a href="#">판매 관리</a></li>
                        	<li><a href="#">나의 포트폴리오</a></li>
                        	<li><a href="#">상품 등록</a></li>
                    	</ul>
					</div>
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

<script type="text/javascript">

let inputButton=document.querySelector('#inputButton');

</script>
</body>
</html>