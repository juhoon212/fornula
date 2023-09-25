<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.star-rating {
  display:flex;
  flex-direction: row-reverse;
  font-size:1.5em;
  justify-content:space-around;
  padding:0 .2em;
  text-align:center;
  width:5em;
}

.star-rating input {
  display:none;
}

.star-rating label {
  color:#ccc;
  cursor:pointer;
}

.star-rating :checked ~ label {
  color:#f90;
}

.star-rating label:hover,
.star-rating label:hover ~ label {
  color:#fc0;
}

#submit {
	display: flex;
	justify-content: center;
}



</style>

<link rel="preconnect"
   href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect"
   href="<c:url value="https://fonts.gstatic.com" />" crossorigin>
<link
   href="<c:url value="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@200&display=swap" />"
   rel="stylesheet" />
<link rel="stylesheet"
   href="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css"/>">

<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
   type="text/css">
<link rel="preconnect"
   href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect" href="<c:url value="https://fonts.gstatic.com"/>"
   crossorigin>
<link
   href="<c:url value="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"/>"
   rel="stylesheet">
<link rel="preconnect"
   href="<c:url value="https://fonts.googleapis.com"/>">
<link rel="preconnect" href="<c:url value="https://fonts.gstatic.com"/>"
   crossorigin>
<link
   href="<c:url value="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap"/>
   rel="stylesheet">


<link
   href="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"/>"
   rel="stylesheet"
   integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
   crossorigin="anonymous">

<link rel="stylesheet" id="montserrat-css"
   href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i"/>">
<link rel="stylesheet" id="open-sans-css"
   href="<c:url value="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i"/>">

<link rel="stylesheet" id="animate-css"
   href="<c:url value="/css/animate.min.css?ver=3.7.2"/> type="
   text/css"
   media="all">
<link rel="stylesheet" id="font-awesome-css"
   href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>
   type="
   text/css" media="all">
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
   href="<c:url value="css/lana-pet-icon.min.css?ver=1.0.0"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css"
   href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css"
   href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>"
   type="text/css" media="print">
</head>

<body>

 <jsp:include page="header.jsp" />
	
	
	<!-- <div id="respond" class="comment-respond">
				<h4 id="reply-title" class="comment-reply-title font-weight-bold">게시글
					수정</h4>
				
					<div class="form-group row">
					 <form method="Post" id="commentform"
										class="comment-form form-horizontal"
										action="<c:url value="board/review/update/${reviewIdx}"/>">
						<div class="col">
							<div class="star-rating"> 
								 <input type="radio" id="5-stars" name="score" value="5" />
								 <label for="5-stars" class="star">&#9733;</label>
								 <input type="radio" id="4-stars" name="score" value="4" />
								 <label for="4-stars" class="star">&#9733;</label>
								 <input type="radio" id="3-stars" name="score" value="3" />
								 <label for="3-stars" class="star">&#9733;</label>
								 <input type="radio" id="2-stars" name="score" value="2" />
								 <label for="2-stars" class="star">&#9733;</label>
								 <input type="radio" id="1-star" name="score" value="1" />
								 <label for="1-star" class="star">&#9733;</label>
							</div>
							<textarea class="form-control" name="content" rows="8"
								title="Comment" placeholder="Comment" aria-required="true"
								required="required"></textarea>
						</div>
					</div>
					<div class="row text-center">
						<div class="col">
							
						</div>
					</div>
					
					토큰 생성 
	</div> -->
	
	<main class="main">
    <div id="post-1" class="page type-page post-1">
        <div class="container post-container bg-white">
            <div class="row justify-content-start post-row no-gutters">
                <div class="col-12 px-0 px-sm-3 col-md-10 offset-md-1 px-md-0 col-xl-9">
                    <div class="post-content">
                        <h4 class="font-weight-bold">게시글 수정</h4>
                            </div>               
							<div>
								 <div class="star-rating"> 
									 <input type="radio" id="5-stars" class="stars" name="score" value="5" />
									 <label for="5-stars" class="star">&#9733;</label>
									 <input type="radio" id="4-stars" class="stars" name="score" value="4" />
									 <label for="4-stars" class="star">&#9733;</label>
									 <input type="radio" id="3-stars" class="stars" name="score" value="3" />
									 <label for="3-stars" class="star">&#9733;</label>
									 <input type="radio" id="2-stars" class="stars" name="score" value="2" />
									 <label for="2-stars" class="star">&#9733;</label>
									 <input type="radio" id="1-star" class="stars" name="score" value="1" />
									 <label for="1-star" class="star">&#9733;</label>
								</div>
							</div>
                            <div class="form-group row" id="itemContent">
                            
                           
                            
                                <div class="col">게시글 내용
                                    <textarea id="content-box" class="form-control" rows="20" placeholder="내용"
                                              aria-required="true" required="required" aria-label="Message" name="content" ></textarea>
                                              <div class = "error-msg" style="color : red;"></div>
                                        
                                </div>
                            </div>
                         			
								<button id="submit" type="button" class="btn btn-primary" style="font-size:20px;">게시글 수정</button>				
							
					</div>
				</div>
			</div>
		</div>
</main> 
	
<script type="text/javascript">
	let submitButton = document.querySelector('#submit');
	let content = document.querySelector('#content-box');
	let score = document.querySelector('input[name="score"]:checked');
	
	submitButton.addEventListener('click', () => {
		$.ajax({
			type: "post",
			url: "<c:url value="${pageContext.request.contextPath}/board/review/update/${reviewIdx}"/>",
			contentType: "application/json",
			data: JSON.stringify({
				"content" : content.value
			}),
			success : function(result) {
				if(result == "success") {
					alert("게시글 수정이 완료되었습니다.");
					location.href = "${pageContext.request.contextPath}/item/${itemIdx}/1"
				} else {
					alert("상품 수정이 실패하였습니다. 다시 시도해주십시오.")
				}
			},
			error : function(errors) {
				alert("게시글 수정이 실패하였습니다.관리자에게 문의하십시오");
				location.href = "${pageContext.request.contextPath}/item/${itemIdx}/1"
			}
		})
	})
</script>


</body>
</html>