<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
	<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>" type="text/css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">

    <meta charset="utf-8">
    <title>Lana Pet - Front Page</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <link rel="stylesheet" id="montserrat-css"
          href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" id="open-sans-css"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

    <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css" media="all">
    <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver=4.6.0"/>" type="text/css" media="all">
    <link rel="stylesheet" id="smartmenus-bootstrap-css" href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>" type="text/css" media="all">
    <link rel="stylesheet" id="swiper-css" href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css" media="all">
    <link rel="stylesheet" id="magnific-popup-css" href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>" type="text/css" media="all">
    <link rel="stylesheet" id="lana-pet-icon-css" href="<c:url value="css/lana-pet-icon.min.css?ver=1.0.0"/>" type="text/css" media="all">
    <link rel="stylesheet" id="lana-pet-theme-css" href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>" type="text/css" media="all">
    <link rel="stylesheet" id="lana-pet-print-css" href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>" type="text/css" media="print">
    
</head>

<body class="home page page-template-template-lana-editor">

<!--로그인 팝업창 by Juhoon-->

<div class="black-bg">
    <div class="white-bg">
        <form action="">
            <div class="mb-3">
            <!-- <h1 class="name">ForNula</h1> -->
           	   <div class="name">FORNUAL</div>
               <p class="close"><img src="<c:url value="/pictures/placeholder/cancel_96921.svg"/>" alt="close"></p>
               <label for="exampleInputEmail1" class="form-label"></label>
               <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="아이디">
               <div id="emailHelp" class="form-text"></div>
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label"></label>
              <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
            <div class="id-pw-find" >
            	<a href="">아이디 / 비밀번호 찾기</a>
            </div>
            <div class="btn-container">
              <button type="submit" class="btn btn-light" id="login">로그인</button>
              <button type="submit" class="btn btn-light" id="join">회원가입</button>
            </div>
            <div id="logos">
	          	<a href=""><img src="<c:url value="/pictures/placeholder/social.png"/>" alt="google"></a>
	          	<a href=""><img src="<c:url value="/pictures/placeholder/instagram.png"/>" alt="instagram"></a>
	          	<a href=""><img src="<c:url value="/pictures/placeholder/facebook.png"/>" alt="facebook"></a>
	          	<a href=""><img src="<c:url value="/pictures/placeholder/kakao-talk.png"/>" alt="kakao"></a>
          	</div>
          </form>
          
    </div>

</div>

		
<jsp:include page="header.jsp" />



<!-- 광고 삽입 -->
 <div class="container-fluid bg-dark text-white mt-auto py-5 " style="z-index: 2;">
         <div class="row">
            <div class="col-12 col-md-9 col-lg-8 col-xl-7 h-100">
               <div class="header-carousel swiper-container bg-transparent h-100">
                  <div class="swiper-wrapper" data-scroll-animate="comeInUp">
                     <div class="swiper-slide">
                        <div class="lana_slider type-lana_slider card slider-card h-100">
                           <div class="card-body">
                              <h1 class="card-title">광고-1
                              </h1>
                              <p class="card-text">광고내용</p>
                           </div>
                          
                        </div>
                     </div>
                     <div class="swiper-slide">
                        <div class="lana_slider type-lana_slider card slider-card h-100">
                           <div class="card-body">
                              <h1 class="card-title">Open your heart and home to a
                                 friend for life.</h1>
                              <p class="card-text">Do you think about adopting a pet?</p>
                           </div>
                        </div>
                     </div>
                     <div class="swiper-slide">
                        <div class="lana_slider type-lana_slider card slider-card h-100">
                           <div class="card-body">
                              <h1 class="card-title">Do you think about adopting a pet?
                              </h1>
                              <p class="card-text">Lorem ipsum dolor sit amet,
                                 consectetur adipiscing elit, sed do eiusmod tempor incididunt
                                 ut labore.</p>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="d-flex swiper-controllers mt-5"
                     data-scroll-animate="fadeInDown">
                     <div
                        class="swiper-text-button-prev swiper-text-button-white mr-4 my-auto">
                        <div
                           class="swiper-button-prev swiper-button-sm position-relative d-inline-block my-auto align-middle"></div>
                        <div class="swiper-text-prev d-inline-block my-auto">Prev</div>
                     </div>
                     <div
                        class="swiper-text-button-next swiper-text-button-white ml-4 my-auto">
                        <div class="swiper-text-next d-inline-block my-auto">Next</div>
                        <div
                           class="swiper-button-next swiper-button-sm position-relative d-inline-block my-auto align-middle"></div>
                     </div>
                     <div class="swiper-pagination position-relative ml-auto my-auto"></div>
                  </div>
               </div>
            </div>
         </div>
      </div>

<main class="main">
    <div id="who-we-are-container" class="container-fluid bg-light-orange section-py--large">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-md-10 col-lg-6 text-center">
                    <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Who we are</h1>
                    <p data-scroll-animate="fadeInUp">
                        We are non-profit organization devoted to fastening discarded and homeless pets with the goal of
                        re-homing them to their home forever.
                    </p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4" data-scroll-animate="zoomIn"></div>
                </div>
            </div>
        </div>
    </div>

    <div id="our-services-container"
         class="container-fluid bg-dark text-white lana-bg-image-white-large-staring-cat-body-indoor section-py--large">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-md-10 col-lg-6 text-center">
                    <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Our Services</h1>
                    <p data-scroll-animate="fadeInUp">We have following services for help animals.</p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4 mb-5" data-scroll-animate="zoomIn"></div>
                </div>
            </div>
            <div class="row mt-4">
                <div class="col-12 col-sm-6 col-lg-3 py-4 py-lg-0">
                    <div class="lana_service type-lana_service card service-card bg-transparent text-center">
                        <div class="card-img-top img-fluid" data-scroll-animate="zoomIn">
                            <span class="lpi lpi-dog lpi-5x"></span>
                        </div>
                        <div class="card-body" data-scroll-animate="fadeIn">
                            <h5 class="post-title card-title">
                                Adoption
                            </h5>
                            <p class="post-text card-text">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sit amet ultricies dui,
                                et posuere lacus. Vestibulum accumsan justo eget justo rhoncus convallis.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-lg-3 py-4 py-lg-0">
                    <div class="lana_service type-lana_service card service-card bg-transparent text-center">
                        <div class="card-img-top img-fluid" data-scroll-animate="zoomIn">
                            <span class="lpi lpi-pet lpi-5x"></span>
                        </div>
                        <div class="card-body" data-scroll-animate="fadeIn">
                            <h5 class="post-title card-title">
                                Dog walking
                            </h5>
                            <p class="post-text card-text">
                                Nullam in malesuada turpis. Phasellus eget consectetur odio. Donec aliquam ac felis vel
                                fermentum. Proin at vestibulum lacus.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-lg-3 py-4 py-lg-0">
                    <div class="lana_service type-lana_service card service-card bg-transparent text-center">
                        <div class="card-img-top img-fluid" data-scroll-animate="zoomIn">
                            <span class="lpi lpi-paw lpi-5x"></span>
                        </div>
                        <div class="card-body" data-scroll-animate="fadeIn">
                            <h5 class="post-title card-title">
                                Dog training
                            </h5>
                            <p class="post-text card-text">
                                Suspendisse porta eget odio eu faucibus. Vestibulum ullamcorper nulla sapien, ac
                                pulvinar elit ultrices quis. Sed at ante eget nisi congue tristique.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-lg-3 py-4 py-lg-0">
                    <div class="lana_service type-lana_service card service-card bg-transparent text-center">
                        <div class="card-img-top img-fluid" data-scroll-animate="zoomIn">
                            <span class="lpi lpi-healthy lpi-5x"></span>
                        </div>
                        <div class="card-body" data-scroll-animate="fadeIn">
                            <h5 class="post-title card-title">
                                Volunteer
                            </h5>
                            <p class="post-text card-text">
                                Aenean sapien lectus, viverra ut auctor quis, tempus eget erat. Sed ut bibendum diam, ac
                                fringilla turpis. Aenean finibus feugiat elit at accumsan.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="our-pets-container" class="container-fluid bg-light-blue section-py--large">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-md-10 col-lg-6 text-center">
                    <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Our Pets</h1>
                    <p data-scroll-animate="fadeInUp">We have wonderful cats and dogs ready for adoption.</p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4" data-scroll-animate="zoomIn"></div>
                </div>
            </div>
            <div class="row mt-5">
                <div class="col-12 px-0">
                    <div class="pets-carousel swiper-container swiper-container-items h-100">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <div class="lana_pet type-lana_pet card pet-grid-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="lana-img-zoom">
                                        <img src="../pictures/placeholder/530x400.svg" class="card-img-top img-fluid"
                                             alt="Pet">
                                    </div>
                                    <div class="card-body">
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Ut eu tempor lectus. Nulla odio nisl, dictum id facilisis et, luctus varius
                                            nisi. Aliquam eu nisl sit amet diam convallis commodo.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <p class="card-text">
                                            <a href="#" class="more-link card-link">
                                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                                            </a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_pet type-lana_pet card pet-grid-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="lana-img-zoom">
                                        <img src="../pictures/placeholder/530x400.svg" class="card-img-top img-fluid"
                                             alt="Pet">
                                    </div>
                                    <div class="card-body">
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <p class="card-text">
                                            <a href="#" class="more-link card-link">
                                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                                            </a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_pet type-lana_pet card pet-grid-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="lana-img-zoom">
                                        <img src="../pictures/placeholder/530x400.svg" class="card-img-top img-fluid"
                                             alt="Pet">
                                    </div>
                                    <div class="card-body">
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Suspendisse vel ornare velit. Donec enim erat, maximus non lobortis sit
                                            amet, ornare ac nibh.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <p class="card-text">
                                            <a href="#" class="more-link card-link">
                                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                                            </a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_pet type-lana_pet card pet-grid-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="lana-img-zoom">
                                        <img src="../pictures/placeholder/530x400.svg" class="card-img-top img-fluid"
                                             alt="Pet">
                                    </div>
                                    <div class="card-body">
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Nulla facilisi. Sed molestie facilisis posuere.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <p class="card-text">
                                            <a href="#" class="more-link card-link">
                                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                                            </a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_pet type-lana_pet card pet-grid-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="lana-img-zoom">
                                        <img src="../pictures/placeholder/530x400.svg" class="card-img-top img-fluid"
                                             alt="Pet">
                                    </div>
                                    <div class="card-body">
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Duis vehicula mauris ipsum, at semper ex tincidunt vitae. Curabitur gravida
                                            sapien id imperdiet fringilla.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <p class="card-text">
                                            <a href="#" class="more-link card-link">
                                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                                            </a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_pet type-lana_pet card pet-grid-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="lana-img-zoom">
                                        <img src="../pictures/placeholder/530x400.svg" class="card-img-top img-fluid"
                                             alt="Pet">
                                    </div>
                                    <div class="card-body">
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Etiam quis urna faucibus, vestibulum elit in, sagittis augue. Vivamus ut
                                            augue odio.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <p class="card-text">
                                            <a href="#" class="more-link card-link">
                                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                                            </a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-pagination" data-scroll-animate="fadeInDown"></div>
                        <div class="swiper-button-next swiper-button-arrow" data-scroll-animate="fadeInLeft"></div>
                        <div class="swiper-button-prev swiper-button-arrow" data-scroll-animate="fadeInRight"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="gallery-container" class="container-fluid bg-dark text-white section-py--large">
        <div class="row justify-content-center">
            <div class="col-12 col-md-10 col-lg-6 text-center">
                <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Gallery</h1>
                <p data-scroll-animate="fadeInUp">We have wonderful cats and dogs ready for adoption.</p>
                <div class="lana-hr lana-hr-4 border-primary mt-4" data-scroll-animate="zoomIn"></div>
            </div>
        </div>
        <div class="row text-center my-5 mfp-gallery">
            <div class="col-12 col-sm-6 col-lg-4 my-3">
                <a href="../pictures/placeholder/1920x1080.svg" class="lana-img-overlay image-link text-white"
                   data-scroll-animate="comeInRight">
                    <img src="../pictures/placeholder/640x430.svg" class="mfp-image img-fluid" alt="Pet">
                    <div class="container overlay-content">
                        <div class="row h-100">
                            <div class="col-12 align-self-end p-5">
                                <div class="d-flex justify-content-between">
                                    <span class="title h3">Jumbo</span>
                                    <i class="fas fa-search-plus fa-2x align-middle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-12 col-sm-6 col-lg-4 my-3">
                <a href="../pictures/placeholder/1920x1080.svg" class="lana-img-overlay image-link text-white"
                   data-scroll-animate="comeInUp">
                    <img src="../pictures/placeholder/640x430.svg" class="mfp-image img-fluid" alt="Pet">
                    <div class="container overlay-content">
                        <div class="row h-100">
                            <div class="col-12 align-self-end p-5">
                                <div class="d-flex justify-content-between">
                                    <span class="title h3">Jack</span>
                                    <i class="fas fa-search-plus fa-2x align-middle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-12 col-sm-6 col-lg-4 my-3">
                <a href="../pictures/placeholder/1920x1080.svg" class="lana-img-overlay image-link text-white"
                   data-scroll-animate="comeInLeft">
                    <img src="../pictures/placeholder/640x430.svg" class="mfp-image img-fluid" alt="Pet">
                    <div class="container overlay-content">
                        <div class="row h-100">
                            <div class="col-12 align-self-end p-5">
                                <div class="d-flex justify-content-between">
                                    <span class="title h3">Bo</span>
                                    <i class="fas fa-search-plus fa-2x align-middle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-12 col-sm-6 col-lg-4 my-3">
                <a href="../pictures/placeholder/1920x1080.svg" class="lana-img-overlay image-link text-white"
                   data-scroll-animate="comeInRight">
                    <img src="../pictures/placeholder/640x430.svg" class="mfp-image img-fluid" alt="Pet">
                    <div class="container overlay-content">
                        <div class="row h-100">
                            <div class="col-12 align-self-end p-5">
                                <div class="d-flex justify-content-between">
                                    <span class="title h3">Rusty</span>
                                    <i class="fas fa-search-plus fa-2x align-middle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-12 col-sm-6 col-lg-4 my-3">
                <a href="../pictures/placeholder/1920x1080.svg" class="lana-img-overlay image-link text-white"
                   data-scroll-animate="comeInDown">
                    <img src="../pictures/placeholder/640x430.svg" class="mfp-image img-fluid" alt="Pet">
                    <div class="container overlay-content">
                        <div class="row h-100">
                            <div class="col-12 align-self-end p-5">
                                <div class="d-flex justify-content-between">
                                    <span class="title h3">Linda</span>
                                    <i class="fas fa-search-plus fa-2x align-middle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-12 col-sm-6 col-lg-4 my-3">
                <a href="../pictures/placeholder/1920x1080.svg" class="lana-img-overlay image-link text-white"
                   data-scroll-animate="comeInLeft">
                    <img src="../pictures/placeholder/640x430.svg" class="mfp-image img-fluid" alt="Pet">
                    <div class="container overlay-content">
                        <div class="row h-100">
                            <div class="col-12 align-self-end p-5">
                                <div class="d-flex justify-content-between">
                                    <span class="title h3">Shadow</span>
                                    <i class="fas fa-search-plus fa-2x align-middle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-12 text-center">
                <a href="#" class="btn btn-primary btn-lg text-uppercase font-weight-bold w-15x">Show More</a>
            </div>
        </div>
    </div>

    <div id="our-team-container" class="container-fluid bg-light-blue section-py--large">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-md-10 col-lg-6 text-center">
                    <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Meet Our Team</h1>
                    <p data-scroll-animate="fadeInUp">
                        We have a team that takes care about pets, help then find new family. We treat and domesticate
                        pets.
                    </p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4" data-scroll-animate="zoomIn"></div>
                </div>
            </div>

            <div class="row mt-5">
                <div class="col-12 col-md-4 col-lg-4">
                    <div class="lana_member type-lana_member card member-card bg-transparent">
                        <div class="card-body">
                            <img src="../pictures/placeholder/250x250.svg"
                                 class="card-img-top img-fluid rounded-circle" alt="Team Member"
                                 data-scroll-animate="zoomIn">
                            <h5 class="post-title card-title" data-scroll-animate="fadeInDown">
                                Natalia Scrilsen
                            </h5>
                            <h6 class="card-subtitle" data-scroll-animate="fadeInUp">
                                Vaterian
                            </h6>
                            <p class="post-text card-text" data-scroll-animate="fadeIn">
                                Quisque sit amet ex id lacus ullamcorper consectetur. Phasellus cursus arcu quam, vel
                                porttitor magna efficitur ac.
                            </p>
                            <ul class="social-icons list-inline" data-scroll-animate="fadeInUp">
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-facebook"></i></a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-twitter"></i></a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-linkedin"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-4 col-lg-4">
                    <div class="lana_member type-lana_member card member-card bg-transparent">
                        <div class="card-body">
                            <img src="../pictures/placeholder/250x250.svg"
                                 class="card-img-top img-fluid rounded-circle" alt="Team Member"
                                 data-scroll-animate="zoomIn">
                            <h5 class="post-title card-title" data-scroll-animate="fadeInDown">
                                Natalia Scrilsen
                            </h5>
                            <h6 class="card-subtitle" data-scroll-animate="fadeInUp">
                                Vaterian
                            </h6>
                            <p class="post-text card-text" data-scroll-animate="fadeIn">
                                Ut hendrerit nec neque nec porttitor. Ut semper, lacus posuere mollis ultricies, purus
                                quam fringilla quam, quis imperdiet nisl lacus eget libero.
                            </p>
                            <ul class="social-icons list-inline" data-scroll-animate="fadeInUp">
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-facebook"></i></a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-twitter"></i></a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-linkedin"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-4 col-lg-4">
                    <div class="lana_member type-lana_member card member-card bg-transparent">
                        <div class="card-body">
                            <img src="../pictures/placeholder/250x250.svg"
                                 class="card-img-top img-fluid rounded-circle" alt="Team Member"
                                 data-scroll-animate="zoomIn">
                            <h5 class="post-title card-title" data-scroll-animate="fadeInDown">
                                Natalia Scrilsen
                            </h5>
                            <h6 class="card-subtitle" data-scroll-animate="fadeInUp">
                                Vaterian
                            </h6>
                            <p class="post-text card-text" data-scroll-animate="fadeIn">
                                Mauris lacinia gravida ex, eget porta massa pellentesque non. Vivamus id libero
                                imperdiet, imperdiet enim id, pretium sem.
                            </p>
                            <ul class="social-icons list-inline" data-scroll-animate="fadeInUp">
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-facebook"></i></a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-twitter"></i></a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#" class="social-icon"><i class="fab fa-linkedin"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="stories-container"
         class="container-fluid bg-dark lana-bg-image-brown-and-white-small-staring-dog-face-indoor section-py--large">
        <div class="container">
            <div class="row justify-content-center text-white">
                <div class="col-12 col-md-10 col-lg-6 text-center">
                    <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Happy Stories</h1>
                    <p data-scroll-animate="fadeInUp">
                        We are happy that we help families find a new family member for themselves.
                    </p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4" data-scroll-animate="zoomIn"></div>
                </div>
            </div>
            <div class="row mt-5">
                <div class="col-12 px-0">
                    <div class="stories-carousel swiper-container swiper-container-items h-100">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <div class="lana_story type-lana_story card story-slide-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <div class="media">
                                            <img src="../pictures/placeholder/100x100.svg"
                                                 class="img-fluid rounded-circle" alt="Pet">
                                            <div class="media-body align-self-center">
                                                <h5 class="post-title card-title">Jumbo</h5>
                                                <h6 class="card-subtitle">Anastasia</h6>
                                            </div>
                                        </div>
                                        <p class="post-text card-text">
                                            How did we live without a cat? This is an indescribable happiness! Thank you
                                            Pethome for allowing us adopt him!
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_story type-lana_story card story-slide-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <div class="media">
                                            <img src="../pictures/placeholder/100x100.svg"
                                                 class="img-fluid rounded-circle" alt="Pet">
                                            <div class="media-body align-self-center">
                                                <h5 class="post-title card-title">Jack</h5>
                                                <h6 class="card-subtitle">Lana</h6>
                                            </div>
                                        </div>
                                        <p class="post-text card-text">
                                            How did we live without a cat? This is an indescribable happiness!
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_story type-lana_story card story-slide-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <div class="media">
                                            <img src="../pictures/placeholder/100x100.svg"
                                                 class="img-fluid rounded-circle" alt="Pet">
                                            <div class="media-body align-self-center">
                                                <h5 class="post-title card-title">Bo</h5>
                                                <h6 class="card-subtitle">Anna</h6>
                                            </div>
                                        </div>
                                        <p class="post-text card-text">
                                            How did we live without a cat?
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="lana_story type-lana_story card story-slide-card mx-0 mx-md-3 h-100"
                                     data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <div class="media">
                                            <img src="../pictures/placeholder/100x100.svg"
                                                 class="img-fluid rounded-circle" alt="Pet">
                                            <div class="media-body align-self-center">
                                                <h5 class="post-title card-title">Rusty</h5>
                                                <h6 class="card-subtitle">Svetlana</h6>
                                            </div>
                                        </div>
                                        <p class="post-text card-text">
                                            How did we live without a cat? This is an indescribable happiness! Thank you
                                            Pethome for allowing us adopt him!
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-pagination" data-scroll-animate="fadeInDown"></div>
                        <div class="swiper-button-next swiper-button-arrow" data-scroll-animate="fadeInLeft"></div>
                        <div class="swiper-button-prev swiper-button-arrow" data-scroll-animate="fadeInRight"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="latest-posts-container" class="container-fluid bg-white section-py--large">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-md-10 col-lg-6 text-center">
                    <h1 class="mb-4 font-weight-bold" data-scroll-animate="fadeInDown">Latest Posts</h1>
                    <p data-scroll-animate="fadeInUp">
                        We regularly write articles in our blog in order to share with you all the information we know
                        about animals and their care.
                    </p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4" data-scroll-animate="zoomIn"></div>
                </div>
            </div>
            <div class="row mt-4 mb-5">
                <div class="col-12 px-0">
                    <div class="latest-posts-carousel swiper-container swiper-container-items swiper-visible-items h-100">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <a class="post type-post card post-slide-card px-0 px-sm-3 h-100" href="single.html"
                                   data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <h6 class="card-subtitle">
                                            Oct 17, 2018 / Cats, Dogs
                                        </h6>
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Donec vitae iaculis ipsum, quis feugiat erat. Phasellus felis nisl, ornare
                                            quis leo id, tincidunt aliquet odio.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="media">
                                            <img src="../pictures/placeholder/32x32.svg"
                                                 class="img-fluid rounded-circle" alt="Author">
                                            <div class="media-body align-self-center">
                                                <div class="author-meta">By: Anastasia</div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                            <div class="swiper-slide">
                                <a class="post type-post card post-slide-card px-0 px-sm-3 h-100" href="single.html"
                                   data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <h6 class="card-subtitle">
                                            Oct 10, 2018 / Cats, Dogs
                                        </h6>
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Suspendisse potenti. Morbi ultricies neque eget nisi posuere suscipit.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="media">
                                            <img src="../pictures/placeholder/32x32.svg"
                                                 class="img-fluid rounded-circle" alt="Author">
                                            <div class="media-body align-self-center">
                                                <div class="author-meta">By: Lana</div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                            <div class="swiper-slide">
                                <a class="post type-post card post-slide-card px-0 px-sm-3 h-100" href="single.html"
                                   data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <h6 class="card-subtitle">
                                            Sept 20, 2018 / Cats, Dogs
                                        </h6>
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Orci varius natoque penatibus et magnis dis parturient montes, nascetur
                                            ridiculus mus.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="media">
                                            <img src="../pictures/placeholder/32x32.svg"
                                                 class="img-fluid rounded-circle" alt="Author">
                                            <div class="media-body align-self-center">
                                                <div class="author-meta">By: Anna</div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                            <div class="swiper-slide">
                                <a class="post type-post card post-slide-card px-0 px-sm-3 h-100" href="single.html"
                                   data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <h6 class="card-subtitle">
                                            Sept 15, 2018 / Cats, Dogs
                                        </h6>
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Fusce leo nunc, gravida et maximus non, semper eu enim.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="media">
                                            <img src="../pictures/placeholder/32x32.svg"
                                                 class="img-fluid rounded-circle" alt="Author">
                                            <div class="media-body align-self-center">
                                                <div class="author-meta">By: Svetlana</div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                            <div class="swiper-slide">
                                <a class="post type-post card post-slide-card px-0 px-sm-3 h-100" href="single.html"
                                   data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <h6 class="card-subtitle">
                                            Aug 21, 2018 / Cats, Dogs
                                        </h6>
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Suspendisse iaculis enim at est porttitor, elementum pharetra sem varius.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="media">
                                            <img src="../pictures/placeholder/32x32.svg"
                                                 class="img-fluid rounded-circle" alt="Author">
                                            <div class="media-body align-self-center">
                                                <div class="author-meta">By: Nastya</div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                            <div class="swiper-slide">
                                <a class="post type-post card post-slide-card px-0 px-sm-3 h-100" href="single.html"
                                   data-scroll-animate="fadeIn">
                                    <div class="card-body">
                                        <h6 class="card-subtitle">
                                            Oct 17, 2018 / Cats, Dogs
                                        </h6>
                                        <h5 class="post-title card-title">
                                            Know your pet adoption options
                                        </h5>
                                        <p class="post-text card-text">
                                            Aenean eget sapien nunc. In pharetra, sapien eget volutpat suscipit, dui ex
                                            rutrum risus, ac commodo magna purus in massa.
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <div class="media">
                                            <img src="../pictures/placeholder/32x32.svg"
                                                 class="img-fluid rounded-circle" alt="Author">
                                            <div class="media-body align-self-center">
                                                <div class="author-meta">By: Katya</div>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="swiper-button-next swiper-button-arrow" data-scroll-animate="fadeInLeft"></div>
                        <div class="swiper-button-prev swiper-button-arrow" data-scroll-animate="fadeInRight"></div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-12 text-center">
                    <a href="#" class="btn btn-primary btn-lg text-uppercase font-weight-bold w-15x">Read More</a>
                </div>
            </div>
        </div>
    </div>
</main>

<jsp:include page="footer.jsp"/>


<script type="text/javascript" src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
<script type="text/javascript" src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
<script type="text/javascript" src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/login-form.js"/>"></script>


<script>
	let loginButton = document.querySelector('#loginButton');
	let close = document.querySelector('.close');
	
	
	loginButton.addEventListener('click', () => {
	    document.querySelector('.black-bg').classList.add('show-modal');
	})
	
	close.addEventListener('click', () => {
	    document.querySelector('.black-bg').classList.remove('show-modal');
	})


</script>
</body>
</html>

