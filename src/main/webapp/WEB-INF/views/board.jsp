<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="loginId" value="${sessionScope.id}"/>
<c:set var="loginOutLink" value="${loginId=='' ? '/login/login' : '/login/logout'}"/>
<c:set var="loginOut" value="${loginId=='' ? 'Login' : 'ID='+=loginId}"/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>상품 페이지 - 상품 상세 페이지</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="<c:url value="/css/login-form.css"/>">

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
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap" rel="stylesheet">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@200&display=swap" rel="stylesheet">
	
	
	
	
	

<style type="text/css">
h1{
	font-size:35px;
}

h4{
	font-size:20px;
}
a{
	color: black;
}
.phy {
	border: 1px solid white; /* 테두리 스타일 및 색상 설정 */
	padding: 10px; /* 내부 여백 설정 */
    background-color: green; /* 배경색 설정 */
}

.col-lg-8 {
    flex: 0 0 83.66667%;
    max-width: 83.3333%;
}
.post-content {
	margin-top : 43px;
	font-family : "Noto+Sans+KR:wght@200";
}

.post-content#detailbox {
   width: 100%;
   height: 115px;   
   display : flex;
  flex-direction: column;
  align-items: flex-end;
 /* border-bottom : solid 1px gray; */
  margin-top : 80px;
}

.post-content#detailbox button {
	background-color: #ffb32f;
  color: #f8f8f8;
  cursor: pointer;
  border: none;
  box-sizing: border-box;
  font-weight: 400;
  border-radius: 5px;
  transition: .1s;
	
}

#writeNewBtn button:focus-visible {
	 outline: 0px solid;
  background-color: #da8a00;
	
}

#writeBtn button:hover {
	
	outline: 0px solid;
  background-color: #da8a00;
}






.gongback {
     border-width:0;
	 margin-top : 43px;
  margin-bottom: -14px;
  display :flex;
  flex-direction: column;
  font-size:18pt;
 align-items: flex-end;
 
}

.style {
     border-width:0;
	 margin-top : 43px;
  margin-bottom: -14px;
  display :flex;
  flex-direction: column;
  font-size:23pt;
 
}

#in {
border-width:0;
 font-size:18pt;
}

#jul {
	margin-bottom : 20px;
	/*border-bottom : solid 1px gray;*/
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
        <div id="post-1" class="post type-post post-1 has-post-thumbnail comment-open">
            <div class="container post-container bg-white">
                <div class="row justify-content-center post-row no-gutters">
                    <div class="col-12 col-sm-11 col-md-10 post-thumbnail-col">
                        
                      <h2 class="writing-header"> 게시판 ${mode=="new" ? "글쓰기" : "읽기"}</h2>
                        <hr>
                   <form id="form" class="frm" action="" method="post" >  
                   <input type="hidden" name="boardIdx" value="${board.boardIdx}">
                         <div class="style"> 제목 <br>
                        <input id="in" type="text" name="boardTitle" value="${board.boardTitle}" placeholder="제목을 입력해주세요"
                        ${mode=="new" ? "" : "readonly ='readonly'"}>
                        </div>
                        <c:if test="${mode ne 'new'}">
                         <div class="gongback"> <span>작성자 :
                        <input id="in" type="text" name="id" value="${board.id}" readonly></span>
                         <span>작성일 :
                        <input id="in" type="regDate" name="regDate" value="${board.regDate}" readonly> </span>
                        </div>
                       </c:if>
                         <div id ="jul">&nbsp</div>  
                         <hr>
                         <div class="style"> 내용 <br>
                        <textarea rows="20" name="boardContent" placeholder="내용을 입력해주세요" id="in"
                        ${mode=="new" ? "" : "readonly ='readonly'"}>${board.boardContent}</textarea>
                        </div>
                         <div class="style"> 파일 <br>
                        <input id="in" type="text" name="boardFileName" value="${board.boardFileName}" placeholder="파일을 선택해주세요"
                        ${mode=="new" ? "" : "readonly ='readonly'"}>
                        </div>
                        <c:if test="${mode eq 'new'}">
                          <button type="button" id="writeBtn" class="btn btn-write"><i class="fa fa-pencil"></i> 등록</button>
                       </c:if>
                       <c:if test="${mode ne 'new'}">
                       <button type="button" id="writeNewBtn" class="btn btn-write"><i class="fa fa-pencil"></i> 글쓰기</button>
                       <c:if test="${board.id eq member.id }" >
                       <button type="button" id="modifyBtn" class="btn btn-modify"><i class="fa fa-edit"></i>수정</button>
                       <button type="button" id="removeBtn"class="btn btn-remove"><i class="fa fa-trash"></i>삭제</button>
                       </c:if>
                       </c:if>
                  
                       <button type="button" id="listBtn" class="btn btn-list"><i class="fa fa-bars"></i>목록</button>
                       </form>      
                            
                       
                        </div>
                        
                            <hr>
                    </div>
                </div>
            </div>
        </div>
       
    
	    <div class="container comments-container bg-white">
	            <div class="row justify-content-center comments-row no-gutters">
                <div class="col-12 col-sm-11 col-md-10 col-lg-8">
                    <h4 class="comments-title font-weight-bold">
                        Comments
                    </h4>
					<c:forEach var="reviewList" items="${reviewList}">
						<ul class="comment-list list-unstyled">
                        <li class="media">
                            <img class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
                                 src="<c:url value="/pictures/placeholder/65x65.svg"/>" alt="Avatar">
                            <div class="media-body">
                                <div class="d-bock d-md-flex w-100 justify-content-between">
                                    <h5 class="comment-title">
                                       <span>${reviewList.member.id}</span>
                                    </h5>
                                    <div class="comment-date">
                                         <span>${reviewList.review.reviewDate}</span>
                                    </div>
                                </div>
                                <div class="comment-text">
                                    <p>
                                        ${reviewList.review.content}
                                    </p>
                                </div>
                                
                                	<div style="padding-left : 10px" class="d-bock d-md-flex w-100 justify-content-between">                        
                                		<h5 class="comment-title">
                                       <span style="color : blue;, font-size: 10px;, padding-left: 10px;">판매자</span>
	                                    </h5>
	                                    <div class="comment-date">
	                                         <span>&nbsp&nbsp&nbsp ${reviewList.review.answerDate}</span>
	                                    </div>
	                                	</div>
	                                	<div class="comment-text">
	                                    <p>
	                                        ${reviewList.review.answerContent}
                                    	</p>
                                	</div>
                                
                                    
                                <ul class="comment-meta">
                               
                                    <li id="replyButton">
                                        <a id="reply-btn" href="<c:url value="/board/add/reply/${item.itemIdx}/${reviewList.review.reviewIdx}"/>" class="comment-reply" >
                                            <i class="fas fa-reply fa-flip-horizontal"></i> Reply
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        	</li>
                        
                     	 </ul>
					</c:forEach>
                    
                       </div>
                    </div>

                                

                    <hr/>
                    <!-- <nav class="navigation pagination comment-pagination justify-content-between text-uppercase"
                         role="navigation">
                        <a class="prev disabled" href="#">
                            Prev
                        </a>
                        <div class="nav-links">
                            <ul class="page-numbers">
                                <li><span aria-current="page" class="page-numbers current">1</span></li>
                                <li><a class="page-numbers" href="#">2</a></li>
                                <li><a class="page-numbers" href="#">3</a></li>
                            </ul>
                        </div>
                        <a class="next" href="#">
                            Next
                        </a>
                    </nav> -->
					
					<div style="height: 100px"></div>
                    <div id="respond" class="comment-respond">
                        <h4 id="reply-title" class="comment-reply-title font-weight-bold">
                            게시글 쓰기
                        </h4>
                        <form method="Post" id="commentform" class="comment-form form-horizontal" action="<c:url value="/board/add/${item.itemIdx}"/>">          
                            <div class="form-group row">
                                <div class="col">
                                    <textarea class="form-control" name="content" rows="8" title="Comment"
                                              placeholder="Comment" aria-required="true" required="required"></textarea>
                                </div>
                            </div>
                            <div class="row text-center">
                                <div class="col">
                                    <input name="submit" type="submit" id="submit"
                                           class="btn btn-primary btn-lg text-uppercase font-weight-bold w-15x"
                                           value="Post Comment">
                                </div>
                            </div>
                        </form>
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
<script src="https://code.jquery.com/jquery-1.11.3.js"></script>

<script type="text/javascript">

$(document).ready(function(){
    let formCheck = function() {
      let form = document.getElementById("form");
      if(form.boardTitle.value=="") {
        alert("제목을 입력해 주세요.");
        form.boardTitle.focus();
        return false;
      }

      if(form.boardContent.value=="") {
        alert("내용을 입력해 주세요.");
        form.boardContent.focus();
        return false;
      }
      return true;
    }

  $("#writeNewBtn").on("click", function(){
	  location.href="<c:url value='/board/write'/>";
  });
  
  $("#writeBtn").on("click", function(){
	  let form = $("#form");
	  form.attr("action","<c:url value='/board/write'/>" );
	  form.attr("method", "post");
	  
	  if(formCheck())
		  form.submit();
  });
  
  $("#modifyBtn").on("click", function(){
      let form = $("#form");
      let isReadonly = $("input[name=boardTitle]").attr('readonly');

      // 1. 읽기 상태이면, 수정 상태로 변경
      if(isReadonly=='readonly') {
        $(".writing-header").html("게시판 수정");
        $("input[name=boardTitle]").attr('readonly', false);
        $("textarea").attr('readonly', false);
        $("#modifyBtn").html("<i class='fa fa-pencil'></i> 등록");
        return;
      }

      // 2. 수정 상태이면, 수정된 내용을 서버로 전송
      form.attr("action", "<c:url value='/board/modify'/>");
      form.attr("method", "post");
      if(formCheck())
        form.submit();
    });

    $("#removeBtn").on("click", function(){
      if(!confirm("정말로 삭제하시겠습니까?")) return;

      let form = $("#form");
      form.attr("action", "<c:url value='/board/remove'/>");
      form.attr("method", "post");
      form.submit();
    });

    $("#listBtn").on("click", function(){
      location.href="<c:url value='/board/list?pageNum=${pageNum}&pageSize=${pageSize}'/>";
    });
});
</script>
</body>
</html>