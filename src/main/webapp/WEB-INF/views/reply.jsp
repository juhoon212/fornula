<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입</title>

  <link rel="stylesheet" href="<c:url value="/css/main.css"/>">
  <link rel="stylesheet" href="<c:url value="/css/login-form.css"/>" type="text/css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
  <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
   <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css" media="all">
   <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver=4.6.0"/>" type="text/css" media="all">
   <link rel="stylesheet" id="smartmenus-bootstrap-css" href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>" type="text/css" media="all">
   <link rel="stylesheet" id="swiper-css" href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css" media="all">
   <link rel="stylesheet" id="magnific-popup-css" href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>" type="text/css" media="all">
   <link rel="stylesheet" id="lana-pet-icon-css" href="<c:url value="css/lana-pet-icon.min.css?ver=1.0.0"/>" type="text/css" media="all">
   <link rel="stylesheet" id="lana-pet-theme-css" href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>" type="text/css" media="all">
   <link rel="stylesheet" id="lana-pet-print-css" href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>" type="text/css" media="print">
</head>

<style>
.name-header {
	display: flex;
	justify-content: center;
	height: 20px;
}

.name {
	font-size: 25px;
}

#find-pw :hover {
	color : green;
}

.find-pw-box a {
 	all : unset;
 	cursor: pointer;
}
.find-pw-box {
	display: flex;
	height : 100px;
	justify-content: flex-end;
	align-items: center;
}



#header {
	padding-bottom: 80px;
}

#header a {
	all : unset;
	font-family: 'Permanent Marker', cursive;
	font-size: 3.5em;
	cursor: pointer;
}

#show-message {
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
	padding : 10px;
	color : green;
}



</style>
<body>
 
  <div class="container">

    <div id="header">
      <a class="navbar-brand" href="<c:url value="/"/>">FORNUAL </a>
    </div>
    <div class="content">
      
      <header>
      	<div class="name-header">
      		<h2 class="message"></h2>
      	</div>
        
      </header>
      
      <form id ="join_form" method="post" action="<c:url value="/board/add/reply/${itemIdx}"/>">

        <!-- id -->
        <input type="hidden" name="reviewIdx" id="id-hidden" value="${reviewIdx}">
        
       
        <!-- 이메일 -->
        <h3>답글</h3>
        <div class="info" id = "info__email">
        
            <textarea class="box" placeholder="답글을 입력해주세요" name = "answerContent" required/></textarea>
          
          <div class = "error-msg"></div>
        </div>
       	<sec:csrfInput/>
        <!-- 비밀번호 -->
       	<button id="submit">등록하기</button>
	</form>
      <section>
        
     	<div id="show-message" style="color : red;">${message}</div>
     	
     	<div class="find-pw-box">
 			<a class="btn btn-light" type="button" href="<c:url value="/"/>">메인으로</a>    		
     	</div>
      
    </section>
    </div>
  </div>
  
  
</body>
</html>
