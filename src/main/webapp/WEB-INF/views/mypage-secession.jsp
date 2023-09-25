<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>  
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

<!-- my-page style-->
<style>
   #button{
   display: flex;
   justify-content: center;
   align-items center;
   padding-bottom: 2em; 
   }

   #secession {
    justify-content:center;
   }
   
   .info {
   margin-bottom: 22px;
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


</style>
<!-- 스타일 태그 끝 -->
<body class="archive post-type-archive post-type-archive-lana_story">
<jsp:include page="header.jsp" />

<main class="main container">
    <div class="row">
        <div class="col-12 col-lg-8">
         <div class="widget">
            <div class="story-posts">            
   <form name="secessionForm" method="post" action="<c:url value="/mypage/mypageSession"/>">
   <label style = "color : #fdbb42; font-size : 24px; margin-bottom : 30px;">회원 탈퇴</label>
        <h3>
        fornual을 떠나는 이유를 알려주세요.
        </h3>
        <div class="info" id="info__id">
         <div>
            <label><input type="checkbox" name="reason" value="cautionreason1" checked> 이용하고 싶은 서비스가 없어요.</label><br>
            <label><input type="checkbox" name="reason" value="cautionreason2"> 서비스 퀄리티가 낮아요.</label><br>
            <label><input type="checkbox" name="reason" value="cautionreason3"> 비매너 회원을 만났어요.</label><br>
            <label><input type="checkbox" name="reason" value="cautionreason4"> 기타</label><br>
         </div>
        </div>
        <h3>아이디 확인</h3>
        <div class="info">
          <div id="id-input">
            <input class="box" type="text" name="id" placeholder="fornual에 가입하신 아이디를 적어주세요."/>
          </div>
          <p align="left" style="color: red;" id="idMessage">${message }</p>
        </div>
         <div class="info">
          <p>* 현재 사용중인 계정 정보는 회원 탈퇴 후 복구가 불가능합니다.</p>
        </div>
          <h3>관심사 분야</h3>
           <div class="info">
          <label><input class="check" type="checkbox" 
          name="caution" value="cautioncheck" onclick="agreeCheck()"> 주의사항을 모두 입력하였습니다.</label><br>
           </div>
      <div style = "float : right;">
      <button class = "changeBtn" id="checkSubmit" type="button" onclick="submitSecessionCheck();"
                              style="text-align: center;" name="checkBtn" disabled>회원탈퇴</button>
      </div>
      <span>&nbsp</span>
      <sec:csrfInput/>
    </form>     
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
									<a href="<c:url value='/expert/input'/>" class="tag-cloud-link"
										aria-label="admin change button">전문가로 전환</a>
								</c:if>
							</div>
                     <div class="row">
                        <div class="widget">
                           <h3 class="widget-title">나의 정보</h3>
                           <ul>
                              <li><a href="<c:url value="/mypage/mypageInfo"/>">내정보 수정</a></li>
                              <li><a href="<c:url value="/mypage/mypagePurchase"/>">구매 관리</a></li>
                              <li><a href="<c:url value="/mypage/mypagePwchange"/>">비밀번호 수정</a></li>
                              <li><a href="<c:url value="/mypage/mypageSession"/>">회원 탈퇴</a></li>
                           </ul>
                        </div>
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
      function agreeCheck(element) {
         let checkedbox = document.querySelectorAll('input[class=check]:checked');
         let cnt = checkedbox.length;
         
         if(cnt ==1 ){
            document.querySelector('#checkSubmit').disabled=false;
         }else{
            document.querySelector('#checkSubmit').disabled=true;
         }
      }
      
 function submitSecessionCheck() {
    let h3=document.getElementById("idMessage");
   
   if(secessionForm.id.value==""){
     h3.innerText="아이디를 입력해주세요";
      secessionForm.id.focus();
      return;
   }
   

   
   secessionForm.submit();
}

 </script>
</body>
</html>