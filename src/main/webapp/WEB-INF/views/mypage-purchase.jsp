<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>마이페이지 - 구매페이지</title>

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
 
<main class="main container">
    <div class="row">
        <div class="col-12 col-lg-8">
        
        
              <div class="widget">
               </div>
         
            <div class="story-posts">
                <div id="post-1" class="lana_story type-lana_story post-1 card story-card">
                <c:forEach var="Itempurchase" items="${Itempurchase}">
                    <div class="card-body">
                      
                       <div class="blog-posts">
                     
                <div id="post-2" class="post type-post post-2 card post-card">
                    <div class="row">
                        <div class="col-md-4">
                            <img class="card-img img-fluid" src="<c:url value='/images/upload/${Itempurchase.itemfileName}'/>" alt="Post">
                            
                        </div>
                        <div class="col-md-8">
                            <div class="card-body h-100 d-flex align-items-start flex-column">
                                <ul class="post-meta">
                                    <li><a href="single.html">${Itempurchase.purchaseDate}</a></li>
                                    <li><a href="#">₩ ${Itempurchase.price} </a></li>
                                </ul>
                                <p class="post-text card-text">
                                <h6 class="post-title card-title">${Itempurchase.purchaseIdx}</h6>
                                <h4 class="post-title card-title"><a href="single.html">${Itempurchase.itemName}</a>
                                </h4>
                                <p class="subtitle"></p>
                                <div class="d-flex justify-content-between align-items-center post-meta mt-auto w-100">
                                    <div class="author-meta">
                                    
                                    <a href="<c:url value="/item/${Itempurchase.itemIdx}/1"/>" class="more-link card-link d-flex align-items-center">
                                        리뷰쓰기 <i class="lana-icon-arrow-right text-primary"></i>
                                    </a>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                        </div>
                        
                    </div>
                    
                </div>
               </c:forEach>
                <nav class="navigation pagination justify-content-between text-uppercase" role="navigation">
                    <a class="prev disabled" href="#">
                        Prev
                    </a>
                    <div class="nav-links">
                        <ul class="page-numbers">
                            <li><span aria-current="page" class="page-numbers current">1</span></li>
                            <li><a class="page-numbers" href="#">2</a></li>
                            <li><span class="page-numbers dots">…</span></li>
                            <li><a class="page-numbers" href="#">4</a></li>
                        </ul>
                    </div>
                    <a class="next" href="#">
                        Next
                    </a>
                </nav>
            </div>
        
        </div>
      
        <div class="col-12 col-lg-4 mt-4 mt-lg-0">
            <div class="widget-sidebar story-sidebar">
            
            <div id="button"><img src="<c:url value="/pictures/placeholder/profile.png"/>"
               class="img-fluid rounded-circle mr-1 w-auto" alt="Author"></div>
              
                  
                       <div id="button"><a href="#" class="tag-cloud-link" aria-label="idbutton">아이디</a>
                       
                  
               </div>
               <div class="widget widget_tag_cloud">
                  
                    <div class="tagcloud">
                        <div id="button"><a href="#" class="tag-cloud-link" aria-label="admin change button">전문가로 전환</a>
                       
                  
               </div>
            <div class="row" >
                <div class="widget">
                    <h3 class="widget-title">나의 정보</h3>
                    <ul>
                          <li><a href="<c:url value="/"/>">전문가 정보</a></li>
                        <li><a href="<c:url value="/mypagePurchase"/>">구매 관리</a></li>
                        <li><a href="<c:url value="/mypagePwchange"/>">비밀번호 관리</a></li>
                        <li><a href="<c:url value="/mypageSession"/>">회원 탈퇴</a></li>
                    </ul>
                </div>
               
                  </div>
                </div>
            </div>
        </div>
    </div>
</main>
<jsp:include page="footer.jsp" />
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