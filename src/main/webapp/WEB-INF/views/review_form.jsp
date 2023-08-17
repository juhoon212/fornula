<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
<link rel="stylesheet" href="<c:url value="/css/login-form.css"/>">

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
<style>

 
</style>

<body class="home page page-template-template-lana-editor">

<!-- 팝업창 by Juhoon-->

<div class="black-bg">
    <div class="white-bg">
        <form action="">
            <div class="mb-3">
            <h1 class="name">ForNula</h1>
            <p class="close"><img src="<c:url value="/pictures/placeholder/cancel_96921.svg"/>" alt="close"></p>
              <label for="exampleInputEmail1" class="form-label"></label>
              <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="아이디">
              <div id="emailHelp" class="form-text"></div>
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label"></label>
              <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
            <div class="mb-3 form-check">
            </div>
            <div class="btn-container">
              <button type="submit" class="btn btn-light" id="login">로그인</button>
              <button type="submit" class="btn btn-light" id="join">회원가입</button>
            </div>
          </form>
    </div>


    <div id="post-1" class="page type-page post-1">
        <div class="container post-container bg-white">
            <div class="row justify-content-start post-row no-gutters">
                <div class="col-12 px-0 px-sm-3 col-md-10 offset-md-1 px-md-0 col-xl-9">
                    <div class="post-content">
                        <h4 class="font-weight-bold" style="text-align: center;">전문가 등록</h4>

                        <form id="contactform" class="contact-form mt-5">
                            <div class="form-group row">
                                <div class="col">
                                    <input type="text" class="form-control" placeholder="Name" aria-required="true"
                                           required="required" aria-label="Name">
                                </div>
                                <div class="col">
                                    <input type="email" class="form-control" placeholder="Email" aria-required="true"
                                           required="required" aria-label="Email">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col">
                                    <input type="text" class="form-control" placeholder="Subject" aria-required="true"
                                           required="required" aria-label="Subject">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col">
                                    <textarea class="form-control" name="message" rows="8" placeholder="Message"
                                              aria-required="true" required="required" aria-label="Message"></textarea>
                                </div>
                            </div>
                            <div class="row text-center">
                                <div class="col">
                                    <input name="submit" type="submit" id="submit"
                                           class="btn btn-primary btn-lg text-uppercase font-weight-bold w-15x"
                                           value="Send Message">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../js/jquery.min.js?ver=3.6.0"></script>
<script type="text/javascript" src="../js/popper.min.js?ver=1.16.1"></script>
<script type="text/javascript" src="../js/bootstrap.min.js?ver=4.6.0"></script>
<script type="text/javascript" src="../js/smartmenus.min.js?ver=1.1.1"></script>
<script type="text/javascript" src="../js/smartmenus-bootstrap.min.js?ver=1.1.1"></script>
<script type="text/javascript" src="../js/swiper.min.js?ver=4.5.3"></script>
<script type="text/javascript" src="../js/scrollmagic.min.js?ver=2.0.8"></script>
<script type="text/javascript" src="../js/magnific-popup.min.js?ver=1.1.0"></script>
<script type="text/javascript" src="../js/custom-theme.js?ver=1.0.0"></script>
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

