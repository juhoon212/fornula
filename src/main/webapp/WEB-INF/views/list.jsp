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
<style>
    * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
      font-family: "Noto Sans KR", sans-serif;
    }

    a {
      text-decoration: none;
      color: black;
    }
    button,
    input {
      border: none;
      outline: none;
    }

    
    .search-container {
      background-color: rgb(253, 253, 250);
      width: 100%;
      height: 110px;
      border: 1px solid #ddd;
      margin-top : 10px;
      margin-bottom: 30px;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .search-form {
      height: 37px;
      display: flex;
    }
    .search-option {
      width: 100px;
      height: 100%;
      outline: none;
      margin-right: 5px;
      border: 1px solid #ccc;
      color: gray;
    }

    .search-option > option {
      text-align: center;
    }

    .search-input {
      color: gray;
      background-color: white;
      border: 1px solid #ccc;
      height: 100%;
      width: 300px;
      font-size: 15px;
      padding: 5px 7px;
    }
    .search-input::placeholder {
      color: gray;
    }

    .search-button {
      /* 메뉴바의 검색 버튼 아이콘  */
      width: 20%;
      height: 100%;
      background-color: rgb(22, 22, 22);
      color: rgb(209, 209, 209);
      display: flex;
      align-items: center;
      justify-content: center;
      font-size: 15px;
    }
    .search-button:hover {
      color: rgb(165, 165, 165);
    }

    table {
      border-collapse: collapse;
      width: 100%;
      border-top: 2px solid rgb(39, 39, 39);
    }

    tr:nth-child(even) {
      background-color: #f0f0f070;
    }

    th,
    td {
      width:300px;
      text-align: center;
      padding: 10px 12px;
      border-bottom: 1px solid #ddd;
    }

    td {
      color: rgb(53, 53, 53);
    }

    .no      { width:150px;}
    .title   { width:50%;  }

    td.title   { text-align: left;  }
    td.writer  { text-align: left;  }
    td.viewcnt { text-align: right; }

    td.title:hover {
      text-decoration: underline;
    }

    .paging {
      color: black;
      width: 100%;
      align-items: center;
    }

    .page {
      color: black;
      padding: 6px;
      margin-right: 10px;
    }
    .paging-active {
      background-color: rgb(216, 216, 216);
      border-radius: 5px;
      color: rgb(24, 24, 24);
    }

    .paging-container {
      width:100%;
      height: 70px;
      display: flex;
      margin-top: 50px;
      margin : auto;
    }
    .btn-write {
      background-color: rgb(236, 236, 236); /* Blue background */
      border: none; /* Remove borders */
      color: black; /* White text */
      padding: 6px 12px; /* Some padding */
      font-size: 16px; /* Set a font size */
      cursor: pointer; /* Mouse pointer on hover */
      border-radius: 5px;
      margin-left: 30px;
    }

    .btn-write:hover {
      text-decoration: underline;
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
                        <h2 class="writing-header">문의사항</h2>
                      <div style="text-align:center">
  <div class="board-container">
    <div class="search-container">
      <form action="<c:url value="/board/list"/>" class="search-form" method="post">
        <select name="column">
          <option value="id">작성자</option>
					<option value="board_title">제목</option>
					<option value="board_content">내용</option>
        </select>

        <input type="text" name="keyword" class="search-input" type="text" value="${param.keyword}" placeholder="검색어를 입력해주세요">
        <input type="submit" class="search-button" value="검색">
      </form>
      <button id="writeBtn" class="btn-write" onclick="location.href='<c:url value="/board/write"/>'"><i class="fa fa-pencil"></i> 글쓰기</button>
    </div>

    <table>
      <tr>
        <th class="no">번호</th>
        <th class="title">제목</th>
        <th class="writer">이름</th>
        <th class="regdate">등록일</th>
        <th class="viewcnt">조회수</th>
      </tr>
      <c:forEach var="board" items="${result.boardList}">
        <tr>
          <td class="no">${board.boardIdx}</td>
          <td class="title"><a href="<c:url value="/board/read?boardIdx=${board.boardIdx}"/>">${board.boardTitle}</a></td>
          <td class="writer">${board.id}</td>
          <td>${board.regDate}</td>
          <td class="viewcnt">${board.viewCnt}</td>
        </tr>
      </c:forEach>
    </table>
    <br>
    <div class="paging-container">
      <div class="paging">
        <c:if test="${empty result.boardList}">
          <div> 게시물이 없습니다. </div>
        
        </c:if>
       
      </div>
    </div>
    <div style="text-align: center;">
			<c:choose>
				<c:when test="${result.pager.startPage > result.pager.blockSize }">
					<a href="<c:url value="/board/list"/>?pageNum=${result.pager.prevPage}&column=${search.column}&keyword=${search.keyword}">[이전]</a>
				</c:when>
				<c:otherwise>
					[이전]
				</c:otherwise>
			</c:choose>	
			
			<c:forEach var="i" begin="${result.pager.startPage }" end="${result.pager.endPage }" step="1">
				<c:choose>
					<c:when test="${result.pager.pageNum != i  }">
						<a href="<c:url value="/board/list"/>?pageNum=${i}&column=${search.column}&keyword=${search.keyword}">[${i }]</a>
					</c:when>
					<c:otherwise>
						[${i }]
					</c:otherwise>
				</c:choose>	
			</c:forEach>
			
			<c:choose>
				<c:when test="${result.pager.endPage != result.pager.totalPage }">
					<a href="<c:url value="/board/list"/>?pageNum=${result.pager.nextPage}&column=${search.column}&keyword=${search.keyword}">[이전]</a>
				</c:when>
				<c:otherwise>
					[다음]
				</c:otherwise>
			</c:choose>	
		</div>
	

		</div>	
  </div>
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