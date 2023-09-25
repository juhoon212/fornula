<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="footer" style="padding: 0px;">
	<div class="pre-footer footer-grid-3 bg-light-orange text-dark"
		style="padding-top: 30px">
		<div class="container" style="padding: 30px;">
			<div class="row justify-content-center">
				<div class="col-md-4">
					<div class="widget" style="text-align: left;">
						<img class="footer-logo img-fluid mb-4"
							src="<c:url value="/pictures/placeholder/logo2.png"/>"
							alt="Footer Logo">
						<p style="text-align: left;">전문가 외주 사이트 입니다.</p>

						<a id="kakao-link-btn" href="javascript:kakaoShare()"> <img
							src="https://developers.kakao.com/assets/img/about/logos/kakaolink/kakaolink_btn_small.png" />
						</a>
						
						
					</div>
				</div>
				<div class="col-md-4" style="text-align: center;">
					<div class="widget">
						<h3 class="widget-title">Page</h3>
						<ul>
							<li><a href="<c:url value="/#"/>">메인 페이지</a></li>
							<li><a href="<c:url value="/item/boardList"/>">게시판</a></li>
							<li><a href="<c:url value="expert/ranking"/>">전문가 랭킹</a></li>
							<li><a href="<c:url value="board/list"/>">고객센터</a></li>
							<li><a href="<c:url value="info"/>">회사소개</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-4">
					<div class="widget" style="text-align: center;">
						<h3 class="widget-title">Team</h3>
						<ul>
							<li>윤주훈</li>
							<li>서수연</li>
							<li>박하윤</li>
							<li>조민환</li>
							<li>조혜민</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<footer class="footer bg-light- text-black text-center">
			<div class="container-fluid">
				<div class="row">
					<div class="col-12">
						<p class="footer-text text-center text-md-left"
							style="font-weight: lighter !important">Project by 5 © 2023
							Itwill corp. All rights reserved.</p>
					</div>
				</div>
			</div>
		</footer>
	</div>
</div>
<!-- kakao sdk 호출 -->
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>

<script type="text/javascript">
  // SDK를 초기화 합니다. 사용할 앱의 JavaScript 키를 설정해 주세요.
  Kakao.init('b8e41eee0cc466dfb4360a1b5f92e9a7');

  // SDK 초기화 여부를 판단합니다.
  console.log(Kakao.isInitialized());

  function kakaoShare() {
    Kakao.Link.sendDefault({
      objectType: 'feed',
      content: {
        title: 'FORNUAL',
        description: '전문가 외주 플랫폼 "FORNUAL"입니다 ',
        imageUrl: '<c:url value="/pictures/placeholder/광고 1.jpg"/>',
        link: {
          mobileWebUrl: 'http://52.78.69.41:8080/fornula/',
          webUrl: 'http://52.78.69.41:8080/fornula/',
        },
      },
      buttons: [
        {
          title: '웹으로 보기',
          link: {
            mobileWebUrl: 'http://52.78.69.41:8080/fornula/',
            webUrl: 'http://52.78.69.41:8080/fornula/',
          },
        },
      ],
      // 카카오톡 미설치 시 카카오톡 설치 경로이동
      installTalk: true,
    })
  }
</script>
