<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Lana Pet - Single</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" id="montserrat-css"
          href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" id="open-sans-css"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

    <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver=4.6.0"/>" type="text/css" media="all">
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
<body class="single single-post">
<!-- 
<header class="header bg-dark lana-bg-image-beige-small-sitting-dog-face-outdoor">
    <nav class="navbar navbar-expand-lg navbar-dark bg-transparent" id="lana-pet-main-navbar">
        <a class="navbar-brand" href="<c:url value="/index.html"/>">
            <img class="navbar-logo" src="<c:url value="/pictures/placeholder/190x50.svg"/>" alt="Navbar Logo">
        </a>
        <div class="toggler-buttons d-flex flex-fill justify-content-end">
            <button class="search-toggler" type="button" data-toggle="collapse" data-target="#lana-search"
                    aria-controls="lana-search" aria-expanded="false" aria-label="Toggle search">
                <i class="fas fa-search fa-lg fa-fw text-light"></i>
            </button>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#lana-navbar"
                    aria-controls="lana-navbar" aria-expanded="false" aria-label="Toggle navigation">
                <i class="fas fa-bars fa-lg fa-fw text-light"></i>
            </button>
        </div>

        <div class="collapse navbar-collapse" id="lana-navbar">
            <ul class="navbar-nav mx-auto">
                <li class="nav-item">
                    <a class="nav-link" href="front-page.html">Front Page</a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="page.html" id="page-dropdown" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Page</a>
                    <ul class="dropdown-menu" aria-labelledby="page-dropdown">
                        <li><a class="dropdown-item" href="page.html">Page (Default Template)</a></li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">More Templates</h6>
                        </li>
                        <li><a class="dropdown-item" href="template-our-services.html">Our Services (Template)</a></li>
                        <li><a class="dropdown-item" href="template-our-partners.html">Our Partners (Template)</a></li>
                        <li><a class="dropdown-item" href="template-our-team.html">Our Team (Template)</a></li>
                        <li><a class="dropdown-item" href="template-contact.html">Contact (Template)</a></li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">Error Templates</h6>
                        </li>
                        <li><a class="dropdown-item" href="404.html">404 (Error Page)</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown active">
                    <a class="nav-link dropdown-toggle" href="archive.html" id="post-dropdown" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Post</a>
                    <ul class="dropdown-menu" aria-labelledby="post-dropdown">
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">List Layout</h6>
                        </li>
                        <li><a class="dropdown-item" href="archive.html">Archive</a></li>
                        <li>
                            <a class="dropdown-item" href="archive-without-sidebar.html">
                                Archive (without Sidebar)
                            </a>
                        </li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">Grid Layout</h6>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-grid-2-columns.html">
                                Archive (Grid - 2 Columns)
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-grid-3-columns.html">
                                Archive (Grid - 3 Columns)
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-grid-4-columns.html">
                                Archive (Grid - 4 Columns)
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-grid-auto-columns.html">
                                Archive (Grid - Auto Columns)
                            </a>
                        </li>
                        <li><a class="dropdown-item active" href="single.html">Single</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="archive-lana_pet.html" id="pet-dropdown"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pet</a>
                    <ul class="dropdown-menu" aria-labelledby="pet-dropdown">
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">List Layout</h6>
                        </li>
                        <li><a class="dropdown-item" href="archive-lana_pet.html">Archive</a></li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">Grid Layout</h6>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-lana_pet-grid-2-columns.html">
                                Archive (Grid - 2 Columns)
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-lana_pet-grid-3-columns.html">
                                Archive (Grid - 3 Columns)
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-lana_pet-grid-auto-columns.html">
                                Archive (Grid - Auto Columns)
                            </a>
                        </li>
                        <li><a class="dropdown-item" href="single-lana_pet.html">Single</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="archive-lana_story.html" id="story-dropdown"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Story</a>
                    <ul class="dropdown-menu" aria-labelledby="story-dropdown">
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">List Layout</h6>
                        </li>
                        <li><a class="dropdown-item" href="archive-lana_story.html">Archive</a></li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">Grid Layout</h6>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-lana_story-grid-3-columns.html">
                                Archive (Grid - 3 Columns)
                            </a>
                        </li>
                        <li><a class="dropdown-item" href="single-lana_story.html">Single</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="archive-lana_fundraiser.html" id="fundraiser-dropdown"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Fundraiser</a>
                    <ul class="dropdown-menu" aria-labelledby="fundraiser-dropdown">
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">List Layout</h6>
                        </li>
                        <li><a class="dropdown-item" href="archive-lana_fundraiser.html">Archive</a></li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">Grid Layout</h6>
                        </li>
                        <li>
                            <a class="dropdown-item" href="archive-lana_fundraiser-grid-3-columns.html">
                                Archive (Grid - 3 Columns)
                            </a>
                        </li>
                        <li><a class="dropdown-item" href="single-lana_fundraiser.html">Single</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="search.html" id="search-dropdown" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Search</a>
                    <ul class="dropdown-menu" aria-labelledby="search-dropdown">
                        <li><a class="dropdown-item" href="search.html">Search Result</a></li>
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">Other Templates</h6>
                        </li>
                        <li>
                            <a class="dropdown-item" href="search-no-results.html">
                                Search No Results
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="attachment.html">Attachment</a>
                </li>
            </ul>
            <form class="search-widget d-none d-xl-inline-flex">
                <button class="search-toggler" type="button" data-toggle="collapse" data-target="#lana-search"
                        aria-controls="lana-search" aria-expanded="false" aria-label="Toggle search">
                    <i class="fas fa-search fa-lg fa-fw text-light"></i>
                </button>
            </form>
            <div class="button-nav-widget d-none d-xl-inline-flex">
                <ul class="nav button-nav">
                    <li class="nav-item">
                        <a href="#" class="btn btn-sm btn-primary text-white text-uppercase font-weight-bold my-auto">
                            Donate
                        </a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="collapse search-collapse bg-dark text-white position-absolute animated fadeInDown"
             id="lana-search">
            <form method="get" class="search-form d-flex align-items-center h-100">
                <div class="input-group search border-transparent">
                    <input type="text" name="s" class="form-control search-input text-light" placeholder="Search"
                           aria-label="Search" aria-describedby="search-button">
                    <div class="input-group-append">
                        <button type="button" class="btn btn-sm close-button" data-toggle="collapse"
                                data-target="#lana-search" aria-controls="lana-search" aria-expanded="true"
                                aria-label="Close search">
                            <i class="fas fa-times fa-lg text-light"></i>
                        </button>
                    </div>
                    <div class="input-group-append">
                        <button type="submit" id="search-button" class="btn search-button">
                            <i class="fa fa-search fa-lg text-light"></i>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </nav>

    <div class="container header-content text-white">
        <div class="row back-row">
            <div class="col-12">
                <a href="#" class="btn btn-sm btn-outline-primary text-white font-weight-bold btn-back">
                    <i class="lana-icon-arrow-left text-white mr-2"></i> Back
                </a>
            </div>
        </div>
        <div class="row title-row post type-post">
            <div class="col-12 col-md-9 col-lg-8 col-xl-7">
                <h1 class="post-title title">
                    Know your pet adoption options
                </h1>
                <ul class="post-meta subtitle">
                    <li>May 24, 2017</li>
                    <li><a href="#">News</a></li>
                </ul>
            </div>
        </div>
        <div class="row breadcrumb-row">
            <div class="col-12">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                    <li class="breadcrumb-item"><a href="#">Post</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Single</li>
                </ol>
            </div>
        </div>
    </div>
</header>
 -->
  <jsp:include page="header.jsp" />
 
<main class="main">
    <div id="post-1" class="post type-post post-1 has-post-thumbnail comment-open">
        <div class="container post-container bg-white">
            <div class="row justify-content-center post-row no-gutters">
                <div class="col-12 col-sm-11 col-md-10 post-thumbnail-col">
                    <img class="img-fluid post-thumbnail" src="<c:url value="/pictures/placeholder/1110x520.svg"/>" alt="Post">
                </div>
                <div class="col-12 col-sm-11 col-md-10 col-lg-8 post-col">
                    <div class="post-content">
                        <p>
                            제목<br>
                            작성자
                        </p>

                        <p>
                            내용
                        </p>

                    </div>

                    <div class="post-tags">
                        <span class="tags-text">연관 카테고리</span>
                        <a href="#">카테고리 1</a>
                        <a href="#">카테고리 2</a>
                        <a href="#">카테고리 3</a>
                    </div>

                    <hr/>

                    <div class="post-pages">
                        <nav class="navigation pagination post-pages-pagination justify-content-between text-uppercase">
                            <a class="prev disabled" href="#">
                                Prev
                            </a>
                            <div class="nav-links">
                                <ul class="page-numbers">
                                    <li><span class="post-page-numbers current">1</span></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                </ul>
                            </div>
                            <a class="next" href="#">
                                Next
                            </a>
                        </nav>
                    </div>
                </div>
            </div>
        </div>

        <div class="container comments-container bg-white">
            <div class="row justify-content-center comments-row no-gutters">
                <div class="col-12 col-sm-11 col-md-10 col-lg-8">
                    <h4 class="comments-title font-weight-bold">
                        Comments <span class="comments-number">(5)</span>
                    </h4>

                    <ul class="comment-list list-unstyled">
                        <li class="media">
                            <img class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
                                 src="<c:url value="/pictures/placeholder/65x65.svg"/>" alt="Avatar">
                            <div class="media-body">
                                <div class="d-bock d-md-flex w-100 justify-content-between">
                                    <h5 class="comment-title">
                                        <a href="#">Commenter</a>
                                    </h5>
                                    <div class="comment-date">
                                        <a href="#">May 24, 2017 at 11:47 am</a>
                                    </div>
                                </div>
                                <div class="comment-text">
                                    <p>
                                        주훈아 이거는 그냥 댓글이 각 ul 태그에다가 ID=1 / ID=2 ... 이렇게 붙여놓고 해당 댓글로 이동하고
                                        싶으면 그냥 #ID값을 사용해서 이동하게 하면 된단다
                                    </p>
                                </div>
                                <ul class="comment-meta">
                                    <li>
                                        <a href="#" class="comment-edit">
                                            <i class="fa fa-pencil-alt"></i> Edit
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="comment-reply">
                                            <i class="fas fa-reply fa-flip-horizontal"></i> Reply
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="media">
                            <img class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
                                 src="<c:url value="/pictures/placeholder/65x65.svg"/>" alt="Avatar">
                            <div class="media-body">
                                <div class="d-bock d-md-flex w-100 justify-content-between">
                                    <h5 class="comment-title">
                                        <a href="#">Commenter</a>
                                    </h5>
                                    <div class="comment-date">
                                        <a href="#">May 24, 2017 at 11:47 am</a>
                                    </div>
                                </div>
                                <div class="comment-text">
                                    <p>
                                        Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante
                                        sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra
                                        turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue
                                        felis in faucibus.
                                    </p>
                                </div>
                                <ul class="comment-meta">
                                    <li>
                                        <a href="#" class="comment-edit">
                                            <i class="fa fa-pencil-alt"></i> Edit
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="comment-reply">
                                            <i class="fas fa-reply fa-flip-horizontal"></i> Reply
                                        </a>
                                    </li>
                                </ul>

                                <ul class="comment-children list-unstyled">
                                    <li class="media">
                                        <img class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
                                             src="<c:url value="/pictures/placeholder/65x65.svg"/>" alt="Avatar">
                                        <div class="media-body">
                                            <div class="d-bock d-md-flex w-100 justify-content-between">
                                                <h5 class="comment-title">
                                                    <a href="#">Commenter</a>
                                                </h5>
                                                <div class="comment-date"> 
                                                    <a href="#">May 24, 2017 at 11:47 am</a>
                                                </div>
                                            </div>
                                            <div class="comment-text">
                                                <p>
                                                    Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
                                                    scelerisque ante sollicitudin. Cras purus odio, vestibulum in
                                                    vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi
                                                    vulputate fringilla. Donec lacinia congue felis in faucibus.
                                                </p>
                                            </div>
                                            <ul class="comment-meta">
                                                <li>
                                                    <a href="#" class="comment-edit">
                                                        <i class="fa fa-pencil-alt"></i> Edit
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="comment-reply">
                                                        <i class="fas fa-reply fa-flip-horizontal"></i> Reply
                                                    </a>
                                                </li>
                                            </ul>

                                            <ul class="comment-children list-unstyled">
                                                <li class="media">
                                                    <img class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
                                                         src="<c:url value="/pictures/placeholder/65x65.svg"/>" alt="Avatar">
                                                    <div class="media-body">
                                                        <div class="d-bock d-md-flex w-100 justify-content-between">
                                                            <h5 class="comment-title">
                                                                <a href="#">Commenter</a>
                                                            </h5>
                                                            <div class="comment-date">
                                                                <a href="#">May 24, 2017 at 11:47 am</a>
                                                            </div>
                                                        </div>
                                                        <div class="comment-text">
                                                            <p>
                                                                Cras sit amet nibh libero, in gravida nulla. Nulla vel
                                                                metus scelerisque ante sollicitudin. Cras purus odio,
                                                                vestibulum in vulputate at, tempus viverra turpis. Fusce
                                                                condimentum nunc ac nisi vulputate fringilla. Donec
                                                                lacinia congue felis in faucibus.
                                                            </p>
                                                        </div>
                                                        <ul class="comment-meta">
                                                            <li>
                                                                <a href="#" class="comment-edit">
                                                                    <i class="fa fa-pencil-alt"></i> Edit
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#" class="comment-reply">
                                                                    <i class="fas fa-reply fa-flip-horizontal"></i>
                                                                    Reply
                                                                </a>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="media">
                            <img class="avatar photo rounded-circle mr-2 mr-sm-3 mr-md-4"
                                 src="<c:url value="/pictures/placeholder/65x65.svg"/>" alt="Avatar">
                            <div class="media-body">
                                <div class="d-bock d-md-flex w-100 justify-content-between">
                                    <h5 class="comment-title">
                                        <a href="#">Commenter</a>
                                    </h5>
                                    <div class="comment-date">
                                        <a href="#">May 24, 2017 at 11:47 am</a>
                                    </div>
                                </div>
                                <div class="comment-text">
                                    <p>
                                        Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante
                                        sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra
                                        turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue
                                        felis in faucibus.
                                    </p>
                                </div>
                                <ul class="comment-meta">
                                    <li>
                                        <a href="#" class="comment-edit">
                                            <i class="fa fa-pencil-alt"></i> Edit
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="comment-reply">
                                            <i class="fas fa-reply fa-flip-horizontal"></i> Reply
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>

                    <hr/>
                    <nav class="navigation pagination comment-pagination justify-content-between text-uppercase"
                         role="navigation">
                        <a class="prev disabled" href="#">
                            Prev
                        </a>
                        <div class="nav-links">
                            <ul class="page-numbers">
                                <li><span aria-current="page" class="page-numbers current">1</span></li>
                                <li><a class="page-numbers" href="#">2</a></li>
                                <li><a class="page-numbers" href="#">3</a></li>
                            </ul>
                        </div>
                        <a class="next" href="#">
                            Next
                        </a>
                    </nav>

                    <div id="respond" class="comment-respond">
                        <h4 id="reply-title" class="comment-reply-title font-weight-bold">
                            Leave a Reply
                        </h4>
                        <form id="commentform" class="comment-form form-horizontal">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <input type="text" class="form-control" placeholder="Name (required)"
                                           aria-required="true" required="required" aria-label="Name">
                                </div>
                                <div class="form-group col-md-6">
                                    <input type="email" class="form-control" placeholder="Email (required)"
                                           aria-required="true" required="required" aria-label="Email">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col">
                                    <input type="text" class="form-control" placeholder="Website" aria-label="Website">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col">
                                    <textarea class="form-control" name="comment" rows="8" title="Comment"
                                              placeholder="Comment" aria-required="true" required="required"></textarea>
                                </div>
                            </div>
                            <div class="row text-center">
                                <div class="col">
                                    <input name="submit" type="submit" id="submit"
                                           class="btn btn-primary btn-lg text-uppercase font-weight-bold w-15x"
                                           value="Post Comment">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<!-- 
<div class="pre-footer footer-grid-1 bg-dark text-white">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-12 col-md-10 col-lg-6 text-center">
                <div class="widget widget_lana_pet_subscribe">
                    <h3 class="widget-title">Subscribe</h3>
                    <p>Your weekly updates on the Pethome</p>
                    <div class="lana-hr lana-hr-4 border-primary mt-4 mb-3"></div>
                    <form class="mt-5">
                        <div class="input-group input-group-lg">
                            <input type="email"
                                   class="form-control bg-transparent border-primary text-white text-uppercase"
                                   placeholder="Email" aria-label="Email" aria-describedby="subscribe">
                            <div class="input-group-append">
                                <button type="submit" id="subscribe"
                                        class="btn btn-primary text-uppercase font-weight-bold">
                                    <span class="d-none d-sm-inline">Subscribe</span>
                                    <i class="fas fa-paper-plane d-inline d-sm-none"></i>
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<footer class="footer bg-dark text-white">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6">
                <p class="footer-text text-center text-md-left">
                    Lana Pet theme by <a href="http://lana.codes/" target="_blank">Lana Codes</a> Â© 2020 All Rights
                    Reserved.
                </p>
            </div>
            <div class="col-md-6">
                <ul class="nav justify-content-center justify-content-md-end">
                    <li class="nav-item"><a href="#" class="nav-link">Terms of Use</a></li>
                    <li class="nav-item"><a href="#" class="nav-link">Privacy Policy</a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>
 -->
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

</body>
</html>