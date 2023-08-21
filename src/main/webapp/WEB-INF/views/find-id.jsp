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
}
.find-pw {
	display: flex;
	height : 100px;
	justify-content: flex-end;
	align-items: center;
}

</style>
<body>
 
  <div class="container">

    <div id="header">
      <a class="navbar-brand" href="<c:url value="/home"/>">FORNUAL </a>
    </div>
    <div class="content">
      
      <header>
      	<div class="name-header">
      		<h2 class="">아이디 찾기</h2>
      	</div>
        
      </header>

      <section>
        
        <div class="info" id="info__id">
          <div id="id-input">
          	<label for="id-box" class="id-box"></label>
            <input class="box" type="text" placeholder="가입하신 이메일을 입력해주세요"/>
          </div>
        </div>
        
        <div class="info" id="info__id">
          <div id="id-input">
          	<label for="id-box" class="phone-box"></label>
            <input class="box" type="text" placeholder="핸드폰 번호를 입력해주세요"/>
          </div>
        </div>

      	<button id="submit">아이디 찾기</button>
      	
      	<div class="find-pw">
      		<a href="<c:url value="/member/find-pw"/>">비밀번호 찾기</a>
      	</div>
     
      
    </section>
    </div>
  </div>
  
</body>
</html>

<script>
  function check(){
    alert('어쩌고');
  }

  $(".my_btn").click(function(){
    toggleClass(":active");
  })
</script>