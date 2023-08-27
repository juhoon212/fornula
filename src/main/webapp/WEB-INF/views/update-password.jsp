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
      		<h2 class="name">비밀번호 찾기</h2>
      	</div>
        
      </header>

      <section>
        <form action="/member/updatePassword/${memberIdx}" method="POST">
	        <div class="info" id="info__id">
	          <div id="id-input">
	          	<label for="new-box" class="id-box"></label>
	            <input id="new-box" class="box" type="password" name="newPassword" placeholder="새로운 비밀번호를 입력해주세요"/>
	          </div>
	        </div>
	        
	        <div class="info" id="info__id">
	          <div id="id-input">
	          	<label for="new-box-2" class="id-box"></label>
	            <input id="new-box-2" class="box" type="password" placeholder="새로운 비밀번호를 다시 입력해주세요"/>
	          </div>
	        </div>
	
	      	<button id="submit">비밀번호 변경</button>
      	</form>
      	
      	<div id="show-message"></div>
      	
      	<div class="find-pw-box">
      		<a id="find-pw" href="<c:url value="/member/findId"/>">아이디 찾기</a>
 			<div>${message}</div>		
     	</div>
     
      
    </section>
    </div>
  </div>
  
 
 <script type="text/javascript">
 
	let box1 = document.querySelector('#new-box');
	let box2 = document.querySelector('#new-box-2');
	let button = document.querySelector('#submit');
	let message = document.querySelector('#show-message');
	
	const pwRegExp = /^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$/
	
	button.addEventListener('click', (e) => {
		
		if(!pwRegExp.test(box1.value)) {
			e.preventDefault();
			message.innerHTML = "8~20자의 영문, 숫자, 특수문자를 모두 포함한 비밀번호를 입력해주세요";
		} else {
			return true;
		}
		
		if(box1.value != box2.value) {
			e.preventDefault();
			message.innerHTML = "비밀번호가 일치하지 않습니다.";
		} else {
			return true;
		}
		
		
	})
	
 	
 	
 	
 </script>
  
</body>
</html>
