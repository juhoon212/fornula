<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입</title>
<link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
  <link rel="stylesheet" href="<c:url value="/css/join.css"/>">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="<c:url value="/css/login-form.css"/>" type="text/css">
  
  
</head>
<body>
  <div class="container">

    <div id="header">
      <a class="navbar-brand" href="<c:url value="/"/>">FORNUAL </a>
    </div>
    <div class="content">
      
      <header>
        <h2>딱 이것만 체크하면 가입완료!</h2>
      </header>
      
      <c:if test="message != null">
      	<div class="message">${message}</div>
      </c:if>

      <section>
      
       <h3>아이디</h3>
        <div class="info" id="info__id">
          <div id="id-input">
            <input class="box" id="id-box" type="text" placeholder="아이디 입력해 주세요." name ="id" required/>
            <button id="id-check">중복 확인</button>
          </div>
          <div class = "error-msg"></div>
          
        </div>
        
 <form id ="join_form" method="post" action="/member/join">

        <!-- id -->
        <input type="hidden" name="id" id="id-hidden">
       
        <!-- 이메일 -->
        <h3>이메일</h3>
        <div class="info" id = "info__email">
        
            <input class="box" type="text" placeholder="이메일을 입력해 주세요." name = "email" required/>
          
          <div class = "error-msg"></div>
        </div>
        <!-- 비밀번호 -->
        <h3>비밀번호</h3>
        <div class="info" id="info__pw">
          <input class="box" type="password" placeholder="비밀번호를 입력해 주세요.(8자리 이상)" name="password" required/>
          <div class = "error-msg"></div>
        </div>
        <!-- 비밀번호 재확인-->
        <div class="info" id="info__pwRe">
          <input class="box" type="password" placeholder="비밀번호를 한번 더 입력해 주세요." required/>
          <div class = "error-msg"></div>
        </div>
        
        <!-- 3 가지 -->
        <h3>관심사</h3>
        <div class="info" id="info__category" >
          <div id="category-flex">
            <select class="box" id="category-big" onchange = "categorySelect1(this)">
              <option disabled selected>대 카테고리</option>
              <option value = "a">디자인</option>
              <option value = "b">번역</option>
              <option value = "c">사진 편집</option>
              <option value = "d">세무</option>
              <option value = "e">마케팅</option>
            </select>
            <select class="box" id="mcategory1" name = "categoryOne">
              <option disabled selected>중 카테고리</option>
            </select>
          </div>
          <div class="error-msg"></div>
        </div>
        <div class="info" id="info__category">
          <div id="category-flex">
            <select class="box" id="category-big" onchange = "categorySelect2(this)">
              <option disabled selected>대 카테고리</option>
              <option value = "a">디자인</option>
              <option value = "b">번역</option>
              <option value = "c">사진 편집</option>
              <option value = "d">세무</option>
              <option value = "e">마케팅</option>
            </select>
            <select class="box" id="mcategory2" name = "categoryTwo">
              <option disabled selected>중 카테고리</option>
            </select>
          </div>
          <div class="error-msg"></div>
        </div>
        <div class="info" id="info__category">
          <div id="category-flex">
            <select class="box" id="category-big" onchange = "categorySelect3(this)">
              <option disabled selected>대 카테고리</option>
              <option value = "a">디자인</option>
              <option value = "b">번역</option>
              <option value = "c">사진 편집</option>
              <option value = "d">세무</option>
              <option value = "e">마케팅</option>
            </select>
            <select class="box" id="mcategory3" name = "categoryThree">
              <option disabled selected>중 카테고리</option>
            </select>
          </div>
          <div class="error-msg"></div>
        </div>
       <div id="result-fail"></div>
      <button id="submit">가입하기</button>
</form>
      
    </section>
    </div>
  </div>
  
  <script defer src="<c:url value="/js/join.js"/>"></script>
  <script type="text/javascript">
  
  	let idInput = document.querySelector('#id-input');
  
  	console.log(document.querySelector('.box').value);
  	
  	let idInput = document.querySelector('#id-box');
  	let idHidden = document.querySelector("#id-hidden");
  	
  	document.querySelector('#submit').addEventListener('click' , () => {
  		idHidden.value = idInput.value;
  	})
  	
  	document.querySelector('#id-check').addEventListener('click', () => {
  		
  		fetch("<c:url value="/member/idCheck"/>", {
			  method: "POST", 
			  headers: { 
			    "Content-Type": "application/json",
			  },
			  body: JSON.stringify({ 
				   "id" : idInput.value
				  })
			})
		.then((response) => response.json())
      	.then((data) => {
      		
			console.log(data);
          	   
         	if(data.message != null) {
         		document.querySelector('.error-msg').innerHTML = data.message;
         	} 
      	})
  	})
  </script>
</body>
</html>
