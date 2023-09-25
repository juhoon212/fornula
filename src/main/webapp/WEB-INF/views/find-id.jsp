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
</head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
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
        
        
	        <div class="info" id="info__id">
	          <div id="id-input">
	          	<label for="id-box" class="id-box"></label>
	            <input class="box" name="email" type="email" placeholder="가입하신 이메일을 입력해주세요"/>
	          </div>
	        </div>
	      	<button id="submit">아이디 찾기</button>
     	
     	
     	<div id="show-message"></div>
     	
     	<div class="find-pw-box">
 			<a id="find-pw" href="<c:url value="/member/findPw"/>">비밀번호 찾기</a>    		
     	</div>
      
    </section>
    </div>
  </div>
  
 <script type="text/javascript">
 
 
 let emailBox = document.querySelector('.box');
 let messageBox = document.querySelector('#show-message');
 
 //CSRF 토큰 관련 정보를 자바스트립트 변수에 저장 
/*  	let csrfHeaderName="${_csrf.headerName}";
	let csrfTokenValue="${_csrf.token}"; */
	
	//ajaxSend() 메소드를 호출하여 페이지에서 Ajax 기능으로 요청하는 모든 웹프로그램에게 CSRF 토큰 전달
	// => Ajax 요청시 beforeSend 속성을 설정 불필요
  	/* $(document).ajaxSend(function(e, xhr) {
		xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
	});   */
  
 
 document.querySelector('#submit').addEventListener('click', (e) => {
	
	
	 $.ajax({
			type: "post",
			url: "<c:url value="/member/findId"/>",
			contentType: "application/json;charset=utf-8",
			dataType : "text",
			data: JSON.stringify(
				{
					"email" : emailBox.value
				}		
			),
			
			success: function(data) {
					console.log(data);
					let successData = JSON.parse(data);
					
				   	messageBox.innerHTML = '아이디 = ' + successData.id;
				   	messageBox.style = 'color : green';
			   
			},
			error: function(error) {
				console.log(error);
				let parseData = JSON.parse(error.responseText);
			   		messageBox.innerHTML = parseData.message;
			   
			}
		})
					e.preventDefault();
	})
		
	

 	
 
     
	

 	
 	
 </script>
  
</body>
</html>
