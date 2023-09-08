
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>마이페이지-나의정보</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" id="montserrat-css"
   href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
<link rel="stylesheet" id="open-sans-css"
   href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

<link rel="stylesheet" id="animate-css"
   href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css"
   media="all">
<link rel="stylesheet" id="font-awesome-css"
   href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="bootstrap-css"
   href="<c:url value="/css/bootstrap.min.css?ver =4.6.0"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="smartmenus-bootstrap-css"
   href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="swiper-css"
   href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css"
   media="all">
<link rel="stylesheet" id="magnific-popup-css"
   href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-icon-css"
   href="<c:url value="/css/lana-pet-icon.min.css?ver=1.0.0"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-theme-css"
   href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>"
   type="text/css" media="all">
<link rel="stylesheet" id="lana-pet-print-css"
   href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>"
   type="text/css" media="print">




</head>
<style>
#button {
   display: flex;
   justify-content: center; align-items center;
   padding-bottom: 2em;
}
</style>
<body class="archive post-type-archive post-type-archive-lana_story">
<jsp:include page="header.jsp" />
 
   <main class="main container">
      <div class="row">
         <div class="col-12 col-lg-8">
            <div class="widget">



               <div class="story-posts">

                  <section>
                     <!-- my-page style-->
                     <style>
.info {
   margin-bottom: 22px;
}

.box {
   width: 100%;
   height: 50px;
   box-sizing: border-box;
   padding: 5px 0 5px 15px;
   border-radius: 4px;
   border: 1px solid #d9d6d6;
   color: #383838;
   font-weight: 400;
}

.box::placeholder {
   color: #a0a0a0;
   font-siz : 17px;
}

.info#info__id #id-input {
   position: relative;
}

.info#info__id button {
   position: absolute;
   width: 90px;
   height: 40px;
   top: 0;
   bottom: 0;
   right: 5px;
   margin: auto 0;
   border-radius: 3px;
   font-size: 15px;
}

.info .error-msg {
   position: absolute;
   font-size: 14px;
   color: red;
   margin: 4px 0 0 10px;
}

.changeBtn {
   border: none;
   padding: 5px 10px;
   color: #000;
   float: right;
}

.changeBtn {
   background-color: #ffffff;
   border-radius: 20px;
   border: 1px solid #ffb32f;
}

h3 {
   font-size: 20px;
}
/* 비밀번호 설정*/
.area {
   display: grid;
   grid-template-columns: 1fr 1fr;
   gap: 12px;
   align-content: stretch;
   justify-content: space-between;
}

.pwname {
   display: flex;
   margin-bottom: 8px;
   position: relative;
   -webkit-box-align: center;
   align-items: center;
}

.resetbox {
   display: grid;
   grid-template-columns: 1fr 1fr;
   gap: 12px;
   align-content: stretch;
   justify-content: space-between;
}

.pwrb {
   outline: none;
   flex: 1 1 0%;
   width: 100%;
   background-image: none;
   box-sizing: border-box;
   font-size: inherit;
   border: none;
   font-weight: inherit;
   background-color: transparent;
   text-align: left;
   color: inherit;
   padding: 0px;
}

.pwrbt {
   width: 100%;
   border: 1px solid rgb(228, 229, 237);
   border-radius: 8px;
   transition: background-color 0.2s ease 0s, border-color 0.2s ease 0s;
   display: inline-flex;
   column-gap: 8px;
   flex-direction: row;
   overflow: hidden;
   cursor: text;
   background-color: rgb(255, 255, 255);
   color: rgb(33, 34, 36);
   height: 42px;
   font-size: 14px;
   padding: 0px 12px;
   min-width: 64px;
}
</style>
                     <!-- 스타일 태그 끝 -->
                     <form name="passwordForm" method="post" action="<c:url value ="/mypagePwchange"/>">
                     <label style = "color : #fdbb42; font-size : 24px; margin-bottom : 30px;">비밀번호 수정</label>
                        <h3>현재 비밀번호</h3>
                        <div class="info" id="info__pw">
                           <input class="box" name="password" type="password"
                              placeholder="비밀번호를 입력해 주세요.(8자리 이상)" />
                           <p align="left" style="color: red; font-size : 14px;" id="password">${message }</p>
                        </div>

                        <div class="area">
                           <label> 변경할 비밀번호</label> <label> 한번 더 입력</label>
                           <div class="info" id="info__newPassword">
                              <input class="box" type="password" name="newPassword"
                                 placeholder="비밀번호를 입력해 주세요.(8자리 이상)" />
                           <p align="left" style="color: red; font-size : 14px;" id="newPassword"></p>
                              <div class="error-msg" style = "width:210px;"></div>
                           </div>
                           <div class="info" id="info__reNewPassword">
                              <input class="box" type="password" name="reNewPassword"
                                 placeholder="비밀번호를 입력해 주세요.(8자리 이상)" />
                           <p align="left" style="color: red; font-size : 14px;" id="reNewPassword"></p>
                              <div class="error-msg"></div>
                           </div>

                        </div>

                        <div id="join" style="float: right;">
                           <input type="button" class="changeBtn" value="변경하기"
                              onclick="pwsubmitCheck();">
                        </div>
                        <span>&nbsp</span>
                     </form>
                  </section>

               </div>

            </div>
         </div>

         <div class="col-12 col-lg-4 mt-4 mt-lg-0">
            <div class="widget-sidebar story-sidebar">

               <div id="button">
                  <img src="<c:url value="/pictures/placeholder/profile.png"/>"
                     class="img-fluid rounded-circle mr-1 w-auto" alt="Author">
               </div>


                       <div id="button"><a href="#" class="tag-cloud-link" aria-label="idbutton">${member.id }</a>


               </div>
               <div class="widget widget_tag_cloud">

                  <div class="tagcloud">
                     

							<div id="button">
								<c:if test="${member.memberStatus == 1}">
									<a href="<c:url value='/expert/join'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 등록</a>
								</c:if>
								<c:if test="${member.memberStatus == 2}">
									<a href="<c:url value='/expert/output'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 전환</a>
								</c:if>
							</div>


                     <div class="row">
                        <div class="widget">
                           <h3 class="widget-title">나의 정보</h3>

                           <ul>
                              <li><a href="<c:url value="/mypageInfo"/>">내정보 수정</a></li>
                              <li><a href="<c:url value="/mypagePurchase"/>">구매 관리</a></li>
                              <li><a href="<c:url value="/mypagePwchange"/>">비밀번호 수정</a></li>
                              <li><a href="<c:url value="/mypageSession"/>">회원 탈퇴</a></li>
                           </ul>
                        </div>

                     </div>
                  </div>
               </div>
            </div>
         </div>
   </main>
<jsp:include page="footer.jsp" />

<script defer src="<c:url value="/js/mypage-pwchange.js"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
   <script type="text/javascript"
      src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>
   <script type="text/javascript">
 
 function pwsubmitCheck() {
    
    let h1=document.getElementById("password");
    let h2=document.getElementById("newPassword");
    let h3=document.getElementById("reNewPassword");
    
   if(passwordForm.password.value==""){
      h1.innerText="현재 비밀번호를 입력해주세요";
      passwordForm.password.focus();
      return;
   }
   
   if(passwordForm.newPassword.value==""){
      h2.innerText="변경할 비밀번호를 입력해주세요";
      passwordForm.newPassword.focus();
      return;
   }
   
   if(passwordForm.reNewPassword.value==""){
      h3.innerText="변경할 비밀번호를 다시 한번 입력해주세요";
      passwordForm.reNewPassword.focus();
      return;
   }
   
   if(passwordForm.reNewPassword.value!=passwordForm.newPassword.value){
      h3.innerText="변경할 비밀번호가 맞지 않습니다.다시 한번 입력해주세요";
      passwordForm.newPassword.focus();
      return;
   }


   
   passwordForm.submit();
}

//<민환> 나의정보에서 <a href="#">에 이동할 주소들 넣어주세요.
//<민환> 변경할 비밀번호 정규표현식 넣어주세요.





 </script>
</body>
</html>