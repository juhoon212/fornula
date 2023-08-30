<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

    <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver =4.6.0"/>" type="text/css" media="all">
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
  
          

 
</head>
<style>
#button{
   display: flex;
   justify-content: center;
   align-items center;
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
   
   .infoEmail {
   margin-bottom: 22px;
   }
   
   .infoEmail .error-msg {
   position: absolute;
   font-size: 14px;
   color: red;
   margin: 4px 0 0 10px;
}
   /* 박스*/
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
}

   /* 이메일 박스*/
   .boxEmail {
  width: 100%;
  height: 50px;
  box-sizing: border-box;
  padding: 5px 0 5px 15px;
  border-radius: 4px;
  border: 1px solid #d9d6d6;
  color: #383838;
  font-weight: 400;
}
.boxEmail::placeholder {
  color: #a0a0a0;
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

.infoEmail#info__email #email-input {
  position: relative;
}

/* 이메일 버튼*/
.infoEmail#info__email button {
  position: absolute;
  width: 90px;
  height: 40px;
  top: 0;
  bottom: 0;
  right: 5px;
  margin: auto 0;
  border-radius: 20px;
  font-size: 15px; 
}
/* 핸드폰 버튼*/
.info#info__phone #phone-input {
  position: relative;
}

.info#info__phone button {
  position: absolute;
  width: 90px;
  height: 40px;
  top: 0;
  bottom: 0;
  right: 5px;
  margin: auto 0;
  border-radius: 20px;
  font-size: 15px; 
}

.changeEmail {
   border: none;
   padding: 5px 10px;
   color: #000;
}

.changeEmail {
   background-color: #ffffff;
   border-radius: 20px;
   border: 1px solid #ffb32f;
}




.changeBtn {
   border: none;
   padding: 5px 10px;
   color: #000;
}

.changeBtn {
   background-color: #ffffff;
   border-radius: 20px;
   border: 1px solid #ffb32f;
}


h3 {
   font-size : 20px;
}

/* 카테고리 */
.info#info__category #category-flex {
  display: flex;
}
.info#info__category select {
  margin-left : 7px;
  color: #a0a0a0;
}

.info#info__category select:first-child {
  margin-left : 0px;
}

.info#info__category select::-webkit-scrollbar {
  width: 10px;
}

.info#info__category select::-webkit-scrollbar-thumb {
  background-color: #b6b6b6;
  border-radius: 3px;
}

.info#info__category select::-webkit-scrollbar-track {
  background-color: #ebe9e9;
  border-radius: 6px;
}


</style>
<!-- 스타일 태그 끝 -->
   <form name="infoFormChange" method="post" action="/mypageInfoChange">
   <label style = "color : #fdbb42; font-size : 24px; margin-bottom : 30px;">내 정보 수정</label>
        <h3>
        아이디
        </h3>
        <div class="info" id="info__id">
        
          <div id="id-input">
            <p class="box">${member.id }</p> 
            
          </div>
          
        </div>

        <h3>이메일</h3>
        <div class="infoEmail" id =info__email>
          <div id="email-input">
            <input class="boxEmail" name="email"></input>
            <!-- <button class="changeEmail" id=changeEmail>수정</button> -->
             <div class="error-msg"></div>
          </div>
          
        </div>
      
        <h3>휴대폰</h3>
        <div class="info" id = info__phone>
           <div id= "phone-input">
          <input class="box" type="text" placeholder="휴대폰 인증해주세요." readonly="readonly"/>
           <!--  <button class="changeBtn" id="">인증</button> -->
           </div>
        </div>
            <h3>관심사</h3>
            <hr>
            
                <h3>관심사1</h3>
           <div class="info" id="info__category" >
          <div id="category-flex">
             <p class="box" style = "margin-right :10px;">${categoryOne.large }</p>
          <p class="box" style = "margin-left :10px;">${categoryOne.small }</p>           
            </div>
        </div>
            <h3>관심사2</h3>
               <div class="info" id="info__category" >
          <div id="category-flex">
             <p class="box" style = "margin-right :10px;">${categoryTwo.large }</p>
          <p class="box" style = "margin-left :10px;">${categoryTwo.small }</p>           
            </div>
        </div>
        
         <h3>관심사3</h3>
               <div class="info" id="info__category" >
          <div id="category-flex">
             <p class="box" style = "margin-right :10px;">${categoryThree.large }</p>
          <p class="box" style = "margin-left :10px;">${categoryThree.small }</p>           
            </div>
        </div>
        
      
      <div id="join" style = "float : right; margin-top : -10px;">
          <input type="button" class="changeBtn" style = "float:right;" value="회원수정"
                              onclick="infoChangeCheck();">
                              </div>
      <span>&nbsp</span>
    </form>
</section>
        
                  </div>
            
            </div>
        </div>
      
        <div class="col-12 col-lg-4 mt-4 mt-lg-0">
            <div class="widget-sidebar story-sidebar">
            
            <div id="button"><img src="<c:url value="/pictures/placeholder/profile.png"/>"
               class="img-fluid rounded-circle mr-1 w-auto" alt="Author"></div>
              
                  
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
									<a href="<c:url value='/expert/sale'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 전환</a>
								</c:if>
							</div>


							<div class="row" >
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


<script type="text/javascript" src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
<script type="text/javascript" src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
<script type="text/javascript" src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>
<script
      src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
      
<script type="text/javascript">
 

 
 function infoChangeCheck() {

	 infoFormChange.submit();

 }

 </script>


</body>
</html>