<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>상품 페이지 - 상품 상세 페이지</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" id="montserrat-css"
          href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" id="open-sans-css"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

    <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver=4.6.0"/>" type="text/css" media="all">
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

<style type="text/css">
h1{
	font-size:15px;
}
a{
	color: black;
}
.phy {
	border: 1px solid white; /* 테두리 스타일 및 색상 설정 */
	padding: 10px; /* 내부 여백 설정 */
    background-color: green; /* 배경색 설정 */
}
</style>
<script type="text/javascript">
    function disableLink() {
        return false;
    }
</script>
</head>
<body class="single single-post">
<jsp:include page="header.jsp" />

<main class="main">
    <div class="row">
        <div id="post-1" class="post type-post post-1 has-post-thumbnail comment-open">
            <div class="container post-container bg-white">
                <div class="row justify-content-center post-row no-gutters">
                    <div class="col-12 col-sm-11 col-md-10 post-thumbnail-col">
                        <img class="img-fluid post-thumbnail" src="<c:url value='/pictures/placeholder/1110x520.svg'/>" alt="Post">
                    </div>
                    <div class="col-12 col-sm-11 col-md-10 col-lg-8 post-col">
                        <div class="post-content">
                            <h1>제목 : ${item.itemName }</h1><br>
                            <h1><a href="expertoutput">작성자 번호 : ${item.expertIdx }</a></h1>
                            <h1>등록 날짜 : ${item.itemDate }</h1>
                            <h1>내용 : ${item.itemContent }</h1>
                        </div>
                        <hr>
                        <div>
                            <a href="#" onclick="return disableLink()">
					            # ${item.categoryIdx == 1 ? '그래픽' :
					               item.categoryIdx == 2 ? '제품' :
					               item.categoryIdx == 3 ? '영어' :
					               item.categoryIdx == 4 ? '중국어' :
					               item.categoryIdx == 5 ? '헤어 메이크업' :
					               item.categoryIdx == 6 ? '제품 홍보 사진' :
					               item.categoryIdx == 7 ? '사업자' :
					               item.categoryIdx == 8 ? '개인' :
					               item.categoryIdx == 9 ? 'SNS홍보' :
					               item.categoryIdx == 10 ? '해외마케팅ㅋ' : '알 수 없음'}
					        </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-12 col-lg-4 mt-4 mt-lg-0">
            <div class="widget-sidebar story-sidebar">
                <div class="phy widget_tag_cloud">
                    <div class="tagcloud">
                        <div class="tab_menu">
                            <div class="widget" style="text-align: left; color:white;" id="list">
                                <h3 class="widget-title">구매하기</h3>
                                <ul>
                                    <li>
                                        <input placeholder="가격: ${item.price } 원" readonly/>
                                    </li>
                                    <li>
                                        <button onclick="location.href='payment'">결제하기</button>
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
</body>
</html>