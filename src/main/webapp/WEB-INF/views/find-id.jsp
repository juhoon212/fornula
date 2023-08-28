<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
	color : red;
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
      		<h2 class="name">아이디 찾기</h2>
      	</div>
        
      </header>

      <section>
        
        <form action="/member/findId" method="Post">
	        <div class="info" id="info__id">
	          <div id="id-input">
	          	<label for="id-box" class="id-box"></label>
	            <input class="box" name="email" type="email" placeholder="가입하신 이메일을 입력해주세요"/>
	          </div>
	        </div>
	      	<button id="submit">아이디 찾기</button>
     	</form>
     	
     	<div id="show-message"></div>
     	
     	<div class="find-pw-box">
 			<a id="find-pw" href="<c:url value="/member/findPw"/>">비밀번호 찾기</a>    		
     	</div>
      
    </section>
    </div>
  </div>
  
 <script type="text/javascript">
 
 let emailBox = document.querySelector('.box');
 
 document.querySelector('#submit').addEventListener('click', (e) => {
	 fetch("<c:url value="/member/findId"/>", {
		  method: "POST", 
		  headers: { 
		    "Content-Type": "application/json",
		  },
		})
	.then((response) => response.json())
	.then((data) => {
	   	  
	  	if(data.errorCode === "Bad") {
	   		document.querySelector('#show-message').innerHTML = data.message;
	   } else {
	   		document.querySelector('#show-message').innerHTML = data;
	   	}
	 })
	  	e.preventDefault();
 })
 	
 
     
	

 	
 	
 </script>
  
</body>
</html>
