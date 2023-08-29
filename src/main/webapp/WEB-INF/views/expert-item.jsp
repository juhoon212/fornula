<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>전문가페이지-상품등록</title>

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

</style>
<body class="archive post-type-archive post-type-archive-lana_story">

<jsp:include page="header.jsp"/>

<main class="main container">
<div class="row">
	<div class="col-12 col-lg-8">
		<div class="widget"> 
			<div class="box" style="height:800px">
		 		<div>
		 			<img class="img-fluid post-thumbnail" src="<c:url value='/img/expertitem-icon.png'/>" alt="Post">
					<textarea class="box" style="height: 600px; resize: none; font-size: 16px; font-family: 'Open Sans', sans-serif;" readonly>
<span style="font-size:25px;">사이트 이용시 주의 사항</span>
1. 구매자는 판매자에게 2번의 수정 요청을 제안할 수 있다
1-1. 판매자는 이를 성실히 응답해야 할 의무가 있다
1-2. 구매자와의 의견조율에 있어 불성실한 태도를 보이거나, 구매자와의 의견조율이 불가능한 상황이 온다면 구매자는 구매 취소를 선택할 수 있다
2. 상품의 상태를 제작시작 상태로 바꾼 순간부터 판매자는 구매자와의 의사 소통이 가능해지며 제작기간이 길어진다거나 주문이 누락된 경우 
   구매자는 구매 취소가 가능하다
3. 판매자가 제품을 구매자에게 전달한 이후 일정기간이 지나면 판매한 상품의 상태는 자동으로 구매확정이 이루어진다      			
					</textarea>
					<button type="button" onclick="location.href='<c:url value="/item/add/${expertIdx}"/>'">상품등록</button> 
				</div>
			</div>
		</div>
	</div>
	<div class="col-12 col-lg-4 mt-4 mt-lg-0">
		<div class="widget-sidebar story-sidebar">   
            <div id="button">
            	<img src="<c:url value="/pictures/placeholder/250x250.svg"/>"
              	 class="img-fluid rounded-circle mr-1 w-auto" alt="Author">
			</div>
			<div id="button">
				<a href="#" class="tag-cloud-link" aria-label="idbutton">아이디("${Id }")</a>			
			</div>
			<div class="widget widget_tag_cloud">
				<div class="tagcloud">
					<div id="button">
						<a href="#" onclick="location.href='membermyphage'" class="tag-cloud-link" aria-label="admin change button">일반회원으로 전환</a>
					</div>
					<div class="row" >
						<div class="widget">
                    		<h3 class="widget-title">메뉴</h3>
                   			<ul>
                       			<li>
                       				<a href="#" onclick="location.href='expertinput'">전문가 정보 수정</a>
								</li>
                       			<li>
                       				<a href="#" onclick="location.href='expertmypage'">판매 관리</a>
                       			</li>
                       			<li>
                       				<a href="#" onclick="location.href='expertoutput'">나의 포트폴리오</a>
								</li>
                   			</ul>
						</div>
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
	function updateItemIdx(itemIdx) {
		if(confirm("삭제 하시겠습니까?")){
			location.href='<c:url value="/admin/update"/>?itemIdx='+itemIdx;
	}
	}


</script>


</body>
</html>