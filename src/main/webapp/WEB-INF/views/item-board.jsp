<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>
<body class="archive grid-3-columns">
<jsp:include page="header.jsp" />
  
<main class="main container">
    <div class="row">
        <div class="col-12">
            <div class="blog-grid-posts">
                <div class="row">
                    <div class="blog-grid-col col-12 col-md-6 col-lg-4">
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
                            <div class="card-footer">
                                <a href="single.html" class="more-link card-link">
                                    더 보기 <i class="lana-icon-arrow-right text-primary"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="blog-grid-col col-12 col-md-6 col-lg-4">
                        <div id="post-2" class="post type-post post-2 card post-card post-grid-card h-100">
                            <img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
                            <div class="card-body">
                                <ul class="post-meta">
                                    <li><a href="single.html">2023/8/16</a></li>
                                    <li><a href="#">카테고리1</a></li>
                                </ul>
                                <h5 class="post-title card-title"><a href="single.html">개구리</a></h5>
                                <p class="post-text card-text">
                                   개굴개굴개굴
                                </p>
                            </div>
                            <div class="card-footer"> 
                                <a href="single.html" class="more-link card-link">
                                    더보기 <i class="lana-icon-arrow-right text-primary"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="blog-grid-col col-12 col-md-6 col-lg-4">
                        <div id="post-3" class="post type-post post-3 card post-card post-grid-card h-100">
                            <img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
                            <div class="card-body">
                                <ul class="post-meta">
                                    <li><a href="single.html">2023/8/15</a></li>
                                    <li><a href="#">카테고리1</a></li>
                                </ul>
                                <h5 class="post-title card-title"><a href="single.html">광복절</a></h5>
                                <p class="post-text card-text">
                                    1945/8/15
                                </p>
                            </div>
                            <div class="card-footer">
                                <a href="single.html" class="more-link card-link">
                                    더보기 <i class="lana-icon-arrow-right text-primary"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="blog-grid-col col-12 col-md-6 col-lg-4">
                        <div id="post-4" class="post type-post post-4 card post-card post-grid-card h-100">
                            <img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
                            <div class="card-body">
                                <ul class="post-meta">
                                    <li><a href="single.html">2023/8/14</a></li>
                                    <li><a href="#">카테고리1</a></li>
                                </ul>
                                <h5 class="post-title card-title"><a href="single.html">카테고리1이란?</a></h5>
                                <p class="post-text card-text">
                                    상품등록시 연관 카테고리를 고르는데 그 중에서 첫번쨰로 받는 카테고리임!
                                </p>
                            </div>
                            <div class="card-footer">
                                <a href="single.html" class="more-link card-link">
                                    더보기 <i class="lana-icon-arrow-right text-primary"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="blog-grid-col col-12 col-md-6 col-lg-4">
                        <div id="post-5" class="post type-post post-5 card post-card post-grid-card h-100">
                            <img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
                            <div class="card-body">
                                <ul class="post-meta">
                                    <li><a href="single.html">2023/8/13</a></li>
                                    <li><a href="#">카테고리1</a></li>
                                </ul>
                                <h5 class="post-title card-title"><a href="single.html">이게 버튼을</a></h5>
                                <p class="post-text card-text">
                                    이 게시글을 클릭하면 이제 해당 상품 상세페이지로 이동하는 메소드를 작성해야함
                                </p>
                            </div>
                            <div class="card-footer">
                                <a href="single.html" class="more-link card-link">
                                    더보기 <i class="lana-icon-arrow-right text-primary"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="blog-grid-col col-12 col-md-6 col-lg-4">
                        <div id="post-6" class="post type-post post-6 card post-card post-grid-card h-100">
                            <img class="card-img-top img-fluid" src="<c:url value="/pictures/placeholder/530x400.svg"/>" alt="Post">
                            <div class="card-body">
                                <ul class="post-meta">
                                    <li><a href="single.html">2023/8/12</a></li>
                                    <li><a href="#">카테고리1</a></li>
                                </ul>
                                <h5 class="post-title card-title"><a href="single.html">게시글들은</a></h5>
                                <p class="post-text card-text">
                                    최신순일수록 좌측 상단에 오도록 배치하였음
                                </p>
                            </div>
                            <div class="card-footer">
                                <a href="single.html" class="more-link card-link">
                                    더보기 <i class="lana-icon-arrow-right text-primary"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>

                <nav class="navigation pagination justify-content-between bg-transparent text-uppercase"
                     role="navigation">
                    <a class="prev disabled" href="#">
                        Prev
                    </a>
                    <div class="nav-links">
                        <ul class="page-numbers">
                            <li><span aria-current="page" class="page-numbers current">1</span></li>
                            <li><a class="page-numbers" href="#">2</a></li>
                            <li><span class="page-numbers dots" >...</span></li>
                            <li><a class="page-numbers" href="#">4</a></li>
                        </ul>
                    </div>
                    <a class="next" href="#">
                        Next
                    </a>
                </nav>
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