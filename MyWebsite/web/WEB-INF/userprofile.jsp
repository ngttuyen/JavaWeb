<%-- 
    Document   : userprofile
    Created on : Jul 1, 2019, 9:08:10 AM
    Author     : meo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>duongdo's BookStore</title>
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel="stylesheet" href="style/style.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    </head>
    <body>
        <!-- -- Your Content Here -->
        <div class="container">
            <div class="row justify-content-center">
                <p class="display-1 text-dark">doduong's <p class="text-success display-1">BookStore</p></p>
            </div>
            <!------ Nav bar --------->
            <div class="row bg-dark mb-1">
                <div class="col-8">
                    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">

                        <ul class="navbar-nav mr-auto">
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="login.html">Profile</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">History</a>
                            </li class="nav-item">
                        </ul>
                        <p class="text-white m-auto lead">You are now logging as <strong>User01 !</strong></p>
                        <a class="nav-link text-white btn btn-danger" href="#">Sign Out</a>
                    </nav>
                </div>
                <div class="col-4">
                    <form class="form-inline mt-2">
                        <input type="text" class="form-control mr-sm-2" placeholder="Search">
                        <button class="btn btn-success my-2 my-sm-0 mr-1">Search</button>
                        <a href="cart.html" class="btn btn-info"><i class="fa fa-cart-plus"> 10</i></a>
                    </form>
                </div>
            </div>
            <!------------ Content----->
            <div class="row bg-dark justify-content-around text-light mb-1">
                <div class="col-9 bg-light border border-success">
                    <!------START OF CONTENT ----->
                    <div class="container text-dark text-center">
                        <div class="row justify-content-around mt-4 mb-4">
                            <div class="col-3">
                                <div class="card" style="width:14rem;">
                                    <img class="card-img-top"  src="#" alt="User Avatar">
                                    <div class="card-body">
                                        <h4 class="card-title">User Name</h4>
                                        <a href="#" class="btn btn-primary">Save Profile</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-9">

                            </div>
                        </div>

                    </div>
                    <!------END OF CONTENT ----->
                </div>
                <div class="col-3 bg-success">
                    <p class="display-3">
                        News
                    </p>
                    <p class="h5 font-weight-light">Harry Potter is on sale now!</p>
                    <p class="h5 font-weight-light"><strong>Lord Of The Rings</strong> is on sale now!</p>
                    <p class="h5 font-weight-light">Harry Potter is on sale now!</p>
                </div>
            </div>
            <!------------ Footer----->
            <div class="row bg-dark justify-content-around text-light p-4 mb-2">
                <footer class="blockquote-footer">
                    <p class="h6 text-white">Copy Right 2019 duongdo990@gmail.com</p>
                </footer>
            </div>
        </div>

        <!-- -- End Content Here -->
    </body>
</html>

