<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>  
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
<jsp:include page="header.jsp" /> 
<main class="main container">
    <div class="row">
        <div class="col-12 col-lg-8">   
              <div class="widget">      
            <div class="story-posts">
            <section>
                <div id="post-1" class="lana_story type-lana_story post-1 card story-card">
                <c:if test="${empty Itempurchase}">
	                 <div style="text-align: center;" class="col">
	                           <h3 style="font-size: 24px;">${message }</h3>
	                 </div>
	                 </c:if>
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
                                    <li>${Itempurchase.purchaseDate}</li>
                                    <li>₩ ${Itempurchase.price} </li>
                                </ul>
                                <p class="post-text card-text">
                                <h6 class="post-title card-title">${Itempurchase.purchaseIdx}</h6> <span id="statusCheck" style="color: #666666; width: 55px; height: 25px; font-weight: lighter; border: 2px solid orange; border-radius: 10px; padding: 5px; font-size: 15px; background: rgba(255, 138, 0, .1);"> ${salesList.status}</span>
                                <h4 class="post-title card-title"><a href="<c:url value="/item/${Itempurchase.itemIdx}/1"/>${Itempurchase.itemName}"></a>
                                </h4>
                                <p class="subtitle"></p>
                               <div class="">
																	<div class="author-meta">
																		<button data-salesIdx="${salesList.salesIdx }" data-salesStatus="${salesList.salesStatus }"
																				class="status"type="button" id="Btn" >${salesList.status }
																		</button>
																	</div>
																</div>
                        </div>
                    </div>
                </div>
                        </div>                        
                    </div>                   
                </div>
               </c:forEach>
              <div class="" style="text-align: center; width: 100%;">
							<nav style="width: 100%;" class="navigation pagination justify-content-between text-uppercase" role="navigation">
								<div class="prev">
									<c:choose>
										<c:when test="${pager.startPage > pager.blockSize}">
											<a class="prev disabled" href="<c:url value="/expert/sales"/>?pageNum=${pager.prevPage}">PREV</a>
										</c:when>
										<c:when test="${pager.pageNum > 1}">
											<a class="prev disabled" href="<c:url value="/expert/sales"/>?pageNum=${pager.pageNum - 1}">PREV</a>
										</c:when>
										<c:otherwise>
											<span class="disabled">PREV</span>
										</c:otherwise>
									</c:choose>
								</div>

								<div class="nav-links">
									<c:forEach var="i" begin="${pager.startPage}" end="${pager.endPage}" step="1">
										<c:choose>
											<c:when test="${pager.pageNum != i}">
												<a class="page-numbers" href="<c:url value="/expert/sales"/>?pageNum=${i}">${i}</a>
											</c:when>
											<c:otherwise>
												<span class="current">[${i}]</span>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</div>

								<div class="next">
									<c:choose>
										<c:when test="${pager.endPage != pager.totalPage}">
											<a class="next" href="<c:url value="/expert/sales"/>?pageNum=${pager.nextPage}">NEXT</a>
										</c:when>
										<c:when test="${pager.pageNum < pager.totalPage}">
											<a class="next" href="<c:url value="/expert/sales"/>?pageNum=${pager.pageNum + 1}">NEXT</a>
										</c:when>
										<c:otherwise>
											<span class="disabled">NEXT</span>
										</c:otherwise>
									</c:choose>
								</div>
							</nav>
						</div>
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
                       <a href="<c:url value="#"/>" class="tag-cloud-link" aria-label="idbutton">${member.id }</a>
                       </div>
            <div class="widget widget_tag_cloud">                
                    <div class="tagcloud">
    						<div id="button">
								<c:if test="${member.memberStatus == 1}">
									<a href="<c:url value='/expert/join'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 등록</a>
								</c:if>
								<c:if test="${member.memberStatus == 2}">
									<a href="<c:url value='/expert/input'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 전환</a>
								</c:if>
							</div>
               <div class="row" >
                <div class="widget">
                    <h3 class="widget-title">나의 정보</h3>
               
                    <ul>
                    <li><a href="<c:url value="/mypage/mypageInfo"/>">내정보 수정</a></li>
                        <li><a href="<c:url value="/mypage/mypagePurchase"/>">구매 관리</a></li>
                        <li><a href="<c:url value="/mypage/mypagePwchange"/>">비밀번호 수정</a></li>
                        <li><a href="<c:url value="/mypage/mypageSession"/>">회원 탈퇴</a></li>
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
<script type="text/javascript" src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
<script type="text/javascript" src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
<script type="text/javascript" src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
    $(document).ready(function () {
        $('.status').each(function (i) {
            $(this).click(function () {
                var currentStatus = $(this);
                var currentSalesStatus = currentStatus.data('salesstatus');
                var salesIdx = currentStatus.data('salesidx');
                var salesStatus = parseInt(currentSalesStatus) + 1;

                $.ajax({
                    url: "${pageContext.request.contextPath}/expert/sales/update",
                    contentType: "application/json",
                    type: "PUT",
                    data: JSON.stringify({ "salesIdx": salesIdx, "salesStatus": salesStatus }),
                    dataType: "text",
                    success: function (result) {
                        if (result === "success") {
                            if (salesStatus == 3) {
                                //alert("주문전 상태를 변경하였습니다.");
                                currentStatus.text("제작완료"); // #Btn1의 text 변경
                                currentStatus.closest('.post-card').find('#statusCheck').text('제작중');
                                currentStatus.data('salesstatus', salesStatus); // salesstatus 값을 업데이트
                            } else if (salesStatus == 4) {
                               // alert("주문중 상태를 변경하였습니다.");
                                currentStatus.prop("disabled", true);
                                currentStatus.css({"color": "gray"});
                                currentStatus.closest('.post-card').find('#statusCheck').text('제작완료');
                            }
                        }
                    },
                    error: function (xhr) {
                        alert("상태를 변경하는데 오류가 발생했습니다. 오류 코드: " + xhr.status);
                    }
                });
            });
        });
    });

	</script>


</body>
</html>