<%-- 
    Document   : register
    Created on : Jul 1, 2019, 9:14:56 AM
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
                                <a class="nav-link text-white" href="login.html">Login</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Register</a>
                            </li class="nav-item">
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">About Us</a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="col-4">
                    <form class="form-inline mt-2">
                        <input type="text" class="form-control mr-sm-2" placeholder="Search">
                        <button class="btn btn-success my-2 my-sm-0">Search</button>
                    </form>
                </div>
            </div>
            <!------------ Content----->
            <div class="row bg-dark justify-content-around text-light mb-1">
                <div class="col-8 bg-light border border-success">
                    <!-------------- Start CONTENT ---------->
                    <div class="row-1 m-5 justify-content-start text-dark">
                        <p class="display-4">Who are you?</p>
                        <form>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Username</label>
                                <input type="text" class="form-control"  placeholder="Enter username" name="username">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email</label>
                                <input type="email" class="form-control"  placeholder="Enter Email" name="email">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" class="form-control" name="password" placeholder="Password">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Confirm Password</label>
                                <input type="password" class="form-control" name="confirmPassword" placeholder="Confirm Password">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Your Name</label>
                                <input type="text" class="form-control"  placeholder="Enter Your Full Name" name="name">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Gender</label><br>
                                <select name="gender" id="" class="form-control">
                                    <option value="">Male</option>
                                    <option value="">Female</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Address</label>
                                <input type="text" class="form-control"  placeholder="123 New York" name="address">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Your Birth Day</label>
                                <input type="date" class="form-control"  placeholder="DD/MM/YYYY" name="dob">
                            </div>
                            <button type="submit" class="btn btn-dark btn-block">Submit</button>
                        </form>
                    </div>
                    <!-------------- END CONTENT ---------->
                </div>
                <div class="col-4 bg-success">
                    <p class="display-3">
                        News
                    </p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
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
    </body>
</html>

