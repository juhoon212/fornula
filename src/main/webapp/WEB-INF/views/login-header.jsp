<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header class="header position-relative">
	<div class="header-navbar border-bottom border-white">
		<nav class="navbar navbar-expand-lg navbar-light py-4 bg-light-orange"
			id="lana-pet-main-navbar" data-lana-collapse-bg="bg-light-orange"
			id="lana-pet-main-navbar">
			<a class="navbar-brand" href="<c:url value="/index.html"/>"> <img
				class="navbar-logo"
				src="<c:url value="/pictures/placeholder/logo_label.png"/>"
				alt="Navbar Logo">
			</a>



			<div class="toggler-buttons d-flex flex-fill justify-content-end">
				<!-- 화면 크기 조정시 로 그인 버튼 -->
				<a href="#" class="btn my-auto" aria-controls="lana-navbar"
					aria-expanded="false" aria-label="Toggle navigation"> <i
					class="fas fa-user-circle fa-2x" style="color: #ff8a00;"></i></a>
				<!-- 화면크기 조정시 검색 토글 버튼  -->
				<button class="search-toggler" type="button" data-toggle="collapse"
					data-target="#lana-search" aria-controls="lana-search"
					aria-expanded="false" aria-label="Toggle search">
					<i class="fas fa-search fa-lg fa-fw text-dark"></i>
				</button>
				<!-- 화면크기 조정시 카테고리 토글 버튼  -->
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#lana-navbar" aria-controls="lana-navbar"
					aria-expanded="false" aria-label="Toggle navigation">

					<i class="fas fa-bars fa-lg fa-fw text-dark"></i>
				</button>
			</div>

			<!-- NAVBAR 메뉴 - 드랍다운 박스  -->
			<div class="collapse navbar-collapse" id="lana-navbar">
				<ul class="navbar-nav ml-lg-auto">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="archive.html"
						id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">카테고리</a>
						<ul class="dropdown-menu" aria-labelledby="page-dropdown">
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">디자인</h6>
							</li>
							<li><a class="dropdown-item"
								href="template-our-services.html">그래픽 디자인</a></li>
							<li><a class="dropdown-item"
								href="template-our-partners.html">제품 디자인</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">번역</h6>
							</li>
							<li><a class="dropdown-item" href="template-contact.html">영어
									번역</a></li>
							<li><a class="dropdown-item" href="template-contact.html">중국어
									번역</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">사진·편집</h6>
							</li>
							<li><a class="dropdown-item" href="template-contact.html">헤어
									메이크업</a></li>
							<li><a class="dropdown-item" href="template-contact.html">제품·홍보
									사진</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">세무</h6>
							</li>
							<li><a class="dropdown-item" href="template-contact.html">사업자
									세무</a></li>
							<li><a class="dropdown-item" href="404.html">개인 세무</a></li>
							<li>
								<h6 class="dropdown-header font-weight-medium text-primary">마케팅</h6>
							</li>
							<li><a class="dropdown-item" href="template-contact.html">SNS
									홍보</a></li>
							<li><a class="dropdown-item" href="404.html">해외 마케팅</a></li>
						</ul>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="archive.html"
						id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">디자인</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="archive-lana_pet.html"
						id="pet-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">번역</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="archive-lana_story.html"
						id="story-dropdown" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">사진·편집</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle"
						href="archive-lana_fundraiser.html" id="fundraiser-dropdown"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">세무</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle"
						href="archive-lana_fundraiser.html" id="fundraiser-dropdown"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">마케팅</a>
					</li>
				</ul>

				<!-- 토글, 검 색 버튼  -->
				<div class="d-none d-xl-inline-flex ml-xl-4">
					<form class="search-widget d-none d-xl-inline-flex ml-3">
						<button class="search-toggler" type="button"
							data-toggle="collapse" data-target="#lana-search"
							aria-controls="lana-search" aria-expanded="false"
							aria-label="Toggle search">
							<i class="fas fa-search fa-2x fa-fw text-dark"></i>
						</button>
					</form>
					<!-- 프로필 사진 삽입 -->
					<div class="dropdown">
						<div class="profile">
							<a class="dropdown-toggle" href="my-page" role="button"
								data-bs-toggle="dropdown" aria-expanded="false"> <img
								src="<c:url value="/pictures/placeholder/65x65.svg"/>"
								class="rounded-circle" alt="profilephoto" width="60" height="60">
							</a>

							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="#">내 정보 관리</a>
								<li><a class="dropdown-item" href="#">전문가 등록</a>
								<li><a class="dropdown-item" href="#">장바구니</a>
								<li><a class="dropdown-item" href="#">로그아웃</a>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<div
				class="collapse search-collapse py-4 bg-light text-white position-absolute animated fadeInDown"
				id="lana-search">
				<form method="get"
					class="search-form d-flex align-items-center h-100">
					<div class="input-group search border-transparent">
						<input type="text" name="s"
							class="form-control search-input text-dark" placeholder="Search"
							aria-label="Search" aria-describedby="search-button">
						<div class="input-group-append">
							<!-- 검색 아이콘 버튼 -->
							<button type="button" class="btn btn-sm close-button"
								data-toggle="collapse" data-target="#lana-search"
								aria-controls="lana-search" aria-expanded="true"
								aria-label="Close search">
								<i class="fas fa-times fa-lg text-dark"></i>
							</button>
						</div>
						<div class="input-group-append">
							<button type="submit" id="search-button"
								class="btn search-button">
								<i class="fa fa-search fa-lg text-dark"></i>
							</button>
						</div>
					</div>
				</form>
			</div>
		</nav>
	</div>
	<hr>
</header>


