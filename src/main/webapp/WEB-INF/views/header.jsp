<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

   <header
      class="header position-relative">
      <div class="header-navbar border-bottom border-white">
         <nav class="navbar navbar-expand-lg navbar-light py-4 bg-light-orange" id="lana-pet-main-navbar" data-lana-collapse-bg="bg-light-orange"
            id="lana-pet-main-navbar">
            <p id="logo"><a class="navbar-brand" href="<c:url value="/index.html"/>">
             	FORNUAL
            </a></p>



				<div class="toggler-buttons d-flex flex-fill justify-content-end">
					
					<!-- 화면크기 조정시 검색 토글 버튼  -->
					<button class="search-toggler" type="button" data-toggle="collapse"
						data-target="#lana-search" aria-controls="lana-search"
						aria-expanded="false" aria-label="Toggle search">
						<i class="fas fa-search fa-lg fa-fw text-dark"></i>
					</button>
					<!-- 화면크기 조정시 카테고리 토글  버튼  -->
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#lana-navbar" aria-controls="lana-navbar"
						aria-expanded="false" aria-label="Toggle navigation">

						<i class="fas fa-bars fa-lg fa-fw text-dark"></i>
					</button>
				</div>

				<!-- NAVBAR 메뉴 - 드랍다운 박스  -->
            <div class="collapse navbar-collapse" id="lana-navbar">
               <ul class="navbar-nav ml-lg-auto">
                  <li class="nav-item dropdown">
                  	<a class="nav-link dropdown-toggle" href="archive.html"
                     id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
                     aria-expanded="false">카테고리</a>
                     <ul class="dropdown-menu" aria-labelledby="page-dropdown">
                        <li>
                           <h6 class="dropdown-header font-weight-medium text-primary">디자인</h6>
                        </li>
                        <li><a class="dropdown-item"
                           href="template-our-services.html">로고 디자인</a></li>
                        <li><a class="dropdown-item"
                           href="template-our-partners.html">제품 디자인</a></li>
                        <li><a class="dropdown-item" href="template-our-team.html">일러스터</a></li>
                        <li>
                           <h6 class="dropdown-header font-weight-medium text-primary">마케팅</h6>
                        </li>
                        <li><a class="dropdown-item" href="template-contact.html">채널
                              활성화</a></li>
                        <li><a class="dropdown-item" href="template-contact.html">광고</a></li>
                        <li>
                           <h6 class="dropdown-header font-weight-medium text-primary">IT·프로그래밍</h6>
                        </li>
                        <li><a class="dropdown-item" href="template-contact.html">데이터</a></li>
                        <li><a class="dropdown-item" href="template-contact.html">웹/앱</a></li>
                        <li>
                           <h6 class="dropdown-header font-weight-medium text-primary">투잡·재태크</h6>
                        </li>
                        <li><a class="dropdown-item" href="template-contact.html">컨설팅</a></li>
                        <li><a class="dropdown-item" href="404.html">강의/전자책</a></li>
                     </ul>

                  <li class="nav-item dropdown"><a
                     class="nav-link dropdown-toggle" href="archive.html"
                     id="post-dropdown" data-toggle="dropdown" aria-haspopup="true"
                     aria-expanded="false">디자인</a></li>

                  <li class="nav-item dropdown"><a
                     class="nav-link dropdown-toggle" href="archive-lana_pet.html"
                     id="pet-dropdown" data-toggle="dropdown" aria-haspopup="true"
                     aria-expanded="false">IT·프로그래밍</a></li>

                  <li class="nav-item dropdown"><a
                     class="nav-link dropdown-toggle" href="archive-lana_story.html"
                     id="story-dropdown" data-toggle="dropdown" aria-haspopup="true"
                     aria-expanded="false">마케팅</a></li>

                  <li class="nav-item dropdown"><a
                     class="nav-link dropdown-toggle"
                     href="archive-lana_fundraiser.html" id="fundraiser-dropdown"
                     data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">투잡·재태크</a>
                  </li>
               </ul>

               <!-- 토글, 검색 버튼  -->
               <div class="d-none d-xl-inline-flex ml-xl-4">
                  <form class="search-widget d-none d-xl-inline-flex ml-3">
                     <button class="search-toggler" type="button"
                        data-toggle="collapse" data-target="#lana-search"
                        aria-controls="lana-search" aria-expanded="false"
                        aria-label="Toggle search">
                        <i class="fas fa-search fa-2x fa-fw text-dark"></i>
                     </button>
                  </form>
                  <!-- 로그인버튼 삽입 -->
                  <div class="button-nav-widget d-none d-xl-inline-flex">
                     <ul class="nav button-nav">
                        <li class="nav-item">
                        	<a href="#"
                           class="btn btn-sm btn-outline-primary text-orange text-uppercase font-weight-bold my-auto" id="loginButton">
                              Login </a>
                        </li>
                     </ul>
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
   </header>
