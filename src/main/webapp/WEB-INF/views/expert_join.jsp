<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입</title>
<link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
  <link rel="stylesheet" href="./css/main.css">
  
  
</head>
<body>
 
  <div class="container">

    <div id="header">
      <a href="https://www.google.com" target="_blank" title="수정할거"><img src="./image/text_logo.png" id="logo"></a>
    </div>
    <div class="content">
      
      <header>
        <h2>딱 이것만 체크하면 가입완료!</h2>
      </header>

      <section>
        <h3>아이디</h3>
        <div class="info" id="info__id">
          <div id="id-input">
            <input class="box" type="text" placeholder="아이디 입력해 주세요."/>
            <button id="id-check" onclick='check()'>중복 확인</button>
          </div>
          
        </div>

        <h3>이메일</h3>
        <div class="info">
          <div id="id-input">
            <input class="box" type="text" placeholder="이메일을 입력해 주세요."/>
            
          </div>
          
        </div>
      
        <h3>비밀번호</h3>
        <div class="info">
          <input class="box" type="password" placeholder="비밀번호를 입력해 주세요.(8자리 이상)"/>
          
        </div>
        <div class="info">
          <input class="box" type="password" placeholder="비밀번호를 한번 더 입력해 주세요."/>
          
        
        </div>
        <h3>관심사 분야</h3>
        <div class="info">
        <div>

        </div>  
          <button class="my_btn"> 디자인 </button>
          <button class="my_btn"> 디자인 </button>
          <button class="my_btn"> 디자인 </button>
          <button class="my_btn"> 디자인 </button>
          <button class="my_btn"> 디자인 </button>
        </div>

        <div>
          <button class="my_btn"> IT </button>
          <button class="my_btn"> IT </button>
          <button class="my_btn"> IT </button>
          <button class="my_btn"> IT </button>
          <button class="my_btn"> IT </button>
        </div>

        
      
      <div id="join"></div>
      <button id="submit">가입하기</button>
      
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