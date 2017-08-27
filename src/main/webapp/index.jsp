<%-- 
    Document   : index
    Created on : Aug 24, 2017, 11:58:51 PM
    Author     : Maga Kh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <title>Search Student</title>
        <style>
            .st{
                margin-top: 5%;
            }
        </style>
    </head>
    <body>
<!--alt+shift+f for clean code-->

<div class="container-fluid">
	<div class="row">

	<div class="col-md-6">
            <form action="searchresult" method="POST" class="st">
                    <div class="form-group">
                       <input class="form-control col-md-6" type="text" name="name" placeholder="Search student" required/>
                       <button  class="form-control btn btn-success col-md-3" name="simpleSearch"> Search </button>
                   </div>
            </form>
            <div>
                <a href="AdvancedSt.jsp">Advanced student search+</a>
            </div>
        </div>

        <div class="col-md-6">
            <form action="searchresult" method="POST" class="st">
                <div class="form-group">
                    <input class="form-control col-md-6" type="text" name="name" placeholder="Search book" required/>
                    <button  class="form-control btn btn-success col-md-3" name="simpleBookSearch"> Search </button>
                </div>
            </form>
            <div>
                <a href="AdvancedBook.jsp">Advanced Book search+</a>
            </div>
        </div>
	</div>
</div>



    


    </body>
</html>
