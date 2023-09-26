<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>    


<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>로그인</title>

  <link rel="stylesheet" href="<c:url value="/css/main.css"/>">
  <link rel="stylesheet" href="<c:url value="/css/login-form.css"/>" type="text/css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
</head>
<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>"
   type="text/css">

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

#id-input {
	padding-bottom: 20px;
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
	color : red;
}

#sec-message {
	display: flex;
	justify-content: center;
}

.id-pw-find {
	padding: 20px;
}

a {
  text-decoration-line: none;
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
      		<h2 class="name">Login</h2>
      	</div>
        
      </header>

      <section>
        
        
	        
        <form action="<c:url value="/member/login"/>" method="post">
        
	        <div class="info" id="info__id">
	          <div id="id-input">
	          	<label for="id-box" class="id-box"></label>
	            <input class="box" name="id" type="text" placeholder="아이디"/>
	          </div>
	           <div id="pw-input">
	          	<label for="id-box" class="id-box"></label>
	            <input class="box" name="password" type="password" placeholder="Password"/>
	          </div>
	        </div>
	        <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
					<%-- <h3 style="color: red;">아이디 또는 비밀번호가 맞지 않습니다.</h3> --%>
					<h3 id="sec-message" style="color: red;">${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message }</h3>
					<%-- 예외가 저장된 세션의 속성값 삭제 --%>
					<c:remove var="SPRING_SECURITY_LAST_EXCEPTION"/>
			</c:if>
			<input type="checkbox" name="remember-me">자동 로그인	
	      	<button id="submit">로그인</button>
	      	<div class="id-pw-find">
               <a href="<c:url value="/member/findId"/>">아이디 찾기 </a><a
                  href="<c:url value="/member/findPw"/>">&nbsp;│ 비밀번호 찾기 </a>
                  <a href="<c:url value="/member/join"/>">&nbsp;│ 회원가입 </a>
            </div>      
            <div id="logos">
               <a href="<c:url value="/google/login"/>"><img
                  src="<c:url value="/pictures/placeholder/social.png"/>"

                  alt="google"></a> <a href="<c:url value="/naver/login"/>"><img
                  src="<c:url value="/pictures/placeholder/naver_icon-icons.com_59869.png"/>"

                  alt="naver"></a> <a href="<c:url value="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=5dddeec3f8b529b8f641c9f64fced9ae&redirect_uri=https://itwill.xyz.fornula/member/kakao/login/callback"/>"><img

                  src="<c:url value="/pictures/placeholder/kakao-talk.png"/>"
                  alt="kakao"></a>
            </div>
            	
	<sec:csrfInput/>
         </form> 
    </section>
    </div>
  </div>
  
 <script type="text/javascript">
 
 
 
 
 
 </script>
 	
 
     
	

 	
 	

  
</body>
</html>
