<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>전문가 페이지 - 포트폴리오</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" id="montserrat-css"
          href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" id="open-sans-css"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

    <link rel="stylesheet" id="animate-css" href="../css/animate.min.css?ver=3.7.2" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="../css/font-awesome.min.css?ver=5.15.4" type="text/css"
          media="all">
    <link rel="stylesheet" id="bootstrap-css" href="../css/bootstrap.min.css?ver=4.6.0" type="text/css" media="all">
    <link rel="stylesheet" id="smartmenus-bootstrap-css" href="../css/smartmenus-bootstrap.min.css?ver=1.1.1"
          type="text/css" media="all">
    <link rel="stylesheet" id="swiper-css" href="../css/swiper.min.css?ver=4.5.3" type="text/css" media="all">
    <link rel="stylesheet" id="magnific-popup-css" href="../css/magnific-popup.min.css?ver=1.1.0" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-icon-css" href="../css/lana-pet-icon.min.css?ver=1.0.0" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-theme-css" href="../css/lana-pet-theme.min.css?ver=1.0.0" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-print-css" href="../css/lana-pet-print.min.css?ver=1.0.0" type="text/css"
          media="print">
</head>
<body class="archive post-type-archive post-type-archive-lana_pet">

<header class="header bg-dark lana-bg-image-white-small-staring-dog-face-indoor">
    <nav class="navbar navbar-expand-lg navbar-dark bg-transparent" id="lana-pet-main-navbar">
        <a class="navbar-brand" href="../index.html">
            <img class="navbar-logo" src="../pictures/placeholder/190x50.svg" alt="Navbar Logo">
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

                <li class="nav-item dropdown">
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
                        <li><a class="dropdown-item" href="single.html">Single</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown active">
                    <a class="nav-link dropdown-toggle" href="archive-lana_pet.html" id="pet-dropdown"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pet</a>
                    <ul class="dropdown-menu" aria-labelledby="pet-dropdown">
                        <li>
                            <h6 class="dropdown-header font-weight-medium text-primary">List Layout</h6>
                        </li>
                        <li><a class="dropdown-item active" href="archive-lana_pet.html">Archive</a></li>
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
        <div class="row title-row">
            <div class="col-12 col-md-9 col-lg-8 col-xl-7">
                <h1 class="archive-title title">
                    Adopt a pet
                </h1>
                <p class="subtitle">
                    We regularly write articles in our blog in order to share with you all the information we know about
                    animals and their care.
                </p>
            </div>
        </div>
        <div class="row breadcrumb-row">
            <div class="col-12">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                    <li class="breadcrumb-item"><a href="#">Pet</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Archive</li>
                </ol>
            </div>
        </div>
    </div>
</header>

<main class="main container">
    <div class="row">
        <div class="col-12 col-lg-8">
            <div class="pet-posts">
                <div id="post-1" class="lana_pet type-lana_pet post-1 card pet-card">
                    <img class="card-img img-fluid" src="../pictures/placeholder/640x300.svg" alt="Pet">
                    <div class="card-body">
                        <div class="card-title d-flex justify-content-between flex-column flex-md-row align-items-md-center">
                            <h3 class="post-title"><a href="single-lana_pet.html">Pet #1</a></h3>
                            <div class="post-tags">
                                <a href="#">Kitty</a>
                                <a href="#">Male</a>
                                <a href="#">Small</a>
                            </div>
                        </div>
                        <p class="post-text card-text">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut fringilla dignissim efficitur.
                            Phasellus quis dolor nulla. Mauris eleifend augue erat, id auctor enim tempor eu. Sed ut dui
                            elementum, dictum orci non, euismod est. Pellentesque ultrices ligula vitae semper viverra.
                            Morbi maximus nibh elit, non aliquam orci imperdiet id. Mauris lobortis mattis mi, eu
                            consectetur nisi volutpat eget.
                        </p>
                        <div class="d-flex justify-content-between post-meta mt-4">
                            <div class="location-meta">
                                <i class="fas fa-map-marker-alt"></i>
                                Budapest, Hungary
                            </div>
                            <a href="single-lana_pet.html" class="more-link card-link">
                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                            </a>
                        </div>
                    </div>
                </div>
                <div id="post-2" class="lana_pet type-lana_pet post-2 card pet-card">
                    <div class="card-body">
                        <div class="card-title d-flex justify-content-between flex-column flex-md-row align-items-md-center">
                            <h3 class="post-title"><a href="single-lana_pet.html">Pet #2</a></h3>
                            <div class="post-tags">
                                <a href="#">Kitty</a>
                                <a href="#">Male</a>
                                <a href="#">Small</a>
                            </div>
                        </div>
                        <p class="post-text card-text">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut fringilla dignissim efficitur.
                            Phasellus quis dolor nulla. Mauris eleifend augue erat, id auctor enim tempor eu. Sed ut dui
                            elementum, dictum orci non, euismod est. Pellentesque ultrices ligula vitae semper viverra.
                            Morbi maximus nibh elit, non aliquam orci imperdiet id. Mauris lobortis mattis mi, eu
                            consectetur nisi volutpat eget.
                        </p>
                        <div class="d-flex justify-content-between post-meta mt-4">
                            <div class="location-meta">
                                <i class="fas fa-map-marker-alt"></i>
                                Budapest, Hungary
                            </div>
                            <a href="single-lana_pet.html" class="more-link card-link">
                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                            </a>
                        </div>
                    </div>
                </div>
                <div id="post-3" class="lana_pet type-lana_pet post-3 card pet-card">
                    <img class="card-img img-fluid" src="../pictures/placeholder/640x300.svg" alt="Pet">
                    <div class="card-body">
                        <div class="card-title d-flex justify-content-between flex-column flex-md-row align-items-md-center">
                            <h3 class="post-title"><a href="single-lana_pet.html">Pet #3</a></h3>
                            <div class="post-tags">
                                <a href="#">Kitty</a>
                                <a href="#">Male</a>
                                <a href="#">Small</a>
                            </div>
                        </div>
                        <p class="post-text card-text">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut fringilla dignissim efficitur.
                            Phasellus quis dolor nulla. Mauris eleifend augue erat, id auctor enim tempor eu. Sed ut dui
                            elementum, dictum orci non, euismod est. Pellentesque ultrices ligula vitae semper viverra.
                            Morbi maximus nibh elit, non aliquam orci imperdiet id. Mauris lobortis mattis mi, eu
                            consectetur nisi volutpat eget.
                        </p>
                        <div class="d-flex justify-content-between post-meta mt-4">
                            <div class="location-meta">
                                <i class="fas fa-map-marker-alt"></i>
                                Budapest, Hungary
                            </div>
                            <a href="single-lana_pet.html" class="more-link card-link">
                                Learn More <i class="lana-icon-arrow-right text-primary"></i>
                            </a>
                        </div>
                    </div>
                </div>

                <nav class="navigation pagination justify-content-between text-uppercase" role="navigation">
                    <a class="prev disabled" href="#">
                        Prev
                    </a>
                    <div class="nav-links">
                        <ul class="page-numbers">
                            <li><span aria-current="page" class="page-numbers current">1</span></li>
                            <li><a class="page-numbers" href="#">2</a></li>
                            <li><span class="page-numbers dots">â¦</span></li>
                            <li><a class="page-numbers" href="#">4</a></li>
                        </ul>
                    </div>
                    <a class="next" href="#">
                        Next
                    </a>
                </nav>
            </div>
        </div>
        <div class="col-12 col-lg-4 mt-4 mt-lg-0">
            <div class="widget-sidebar pet-sidebar">
                <form class="pet-filter-form">
                    <fieldset class="form-group">
                        <legend>Filters</legend>
                        <div class="form-group">
                            <label for="location" class="sr-only">Location</label>
                            <select id="location" class="custom-select">
                                <option value="">All locations</option>
                                <option value="budapest">Budapest</option>
                                <option value="pecs">PÃ©cs</option>
                                <option value="sopron">Sopron</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="species" class="sr-only">Species</label>
                            <select id="species" class="custom-select">
                                <option value="">All species</option>
                                <option value="dog">Dog</option>
                                <option value="cat">Cat</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="breed" class="sr-only">Breed</label>
                            <select id="breed" class="custom-select">
                                <option value="">All breeds</option>
                                <option value="german-spitz">German Spitz</option>
                                <option value="german-shepherd">German Shepherd</option>
                                <option value="border-collie">Border Collie</option>
                            </select>
                        </div>
                    </fieldset>
                    <fieldset class="form-group">
                        <legend>Age</legend>
                        <div class="form-row">
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="adult" checked>
                                    <label class="custom-control-label" for="adult">Adult</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="baby">
                                    <label class="custom-control-label" for="baby">Baby</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="senior">
                                    <label class="custom-control-label" for="senior">Senior</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="young">
                                    <label class="custom-control-label" for="young">Young</label>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="form-group">
                        <legend>Gender</legend>
                        <div class="form-row">
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="female">
                                    <label class="custom-control-label" for="female">Female</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="male">
                                    <label class="custom-control-label" for="male">Male</label>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="form-group">
                        <legend>Size</legend>
                        <div class="form-row">
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="extra-large" checked>
                                    <label class="custom-control-label" for="extra-large">Extra Large</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="large">
                                    <label class="custom-control-label" for="large">Large</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="medium">
                                    <label class="custom-control-label" for="medium">Medium</label>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="small">
                                    <label class="custom-control-label" for="small">Small</label>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <button type="submit" class="btn btn-primary btn-block font-weight-bold text-uppercase">
                        Search
                    </button>
                </form>
            </div>
        </div>
    </div>
</main>

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

<script type="text/javascript" src="../js/jquery.min.js?ver=3.6.0"></script>
<script type="text/javascript" src="../js/popper.min.js?ver=1.16.1"></script>
<script type="text/javascript" src="../js/bootstrap.min.js?ver=4.6.0"></script>
<script type="text/javascript" src="../js/smartmenus.min.js?ver=1.1.1"></script>
<script type="text/javascript" src="../js/smartmenus-bootstrap.min.js?ver=1.1.1"></script>
<script type="text/javascript" src="../js/swiper.min.js?ver=4.5.3"></script>
<script type="text/javascript" src="../js/scrollmagic.min.js?ver=2.0.8"></script>
<script type="text/javascript" src="../js/magnific-popup.min.js?ver=1.1.0"></script>
<script type="text/javascript" src="../js/custom-theme.js?ver=1.0.0"></script>

</body>
</html>