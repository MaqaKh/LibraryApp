<%-- 
    Document   : AdvancedSt
    Created on : Aug 25, 2017, 9:21:28 AM
    Author     : Maga Kh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advanced student search</title>
                <style>
            .st{
                margin-top: 5%;
            }
        </style>
    </head>
    <body>
    <div class="container-fluid">
	<div class="row">

            <div class="col-md-6">
                <form action="searchresult" method="POST" class="st">
                        <div class="form-group">
                           Name:<input class="form-control col-md-6" type="text" name="name" placeholder="student name" required/>
                           
                           Surname:<input class="form-control col-md-6" type="text" name="surname" placeholder="student surname" />
                           Age:<input class="form-control col-md-6" type="number" name="age"  min="1"  max="100" placeholder="student age" />
                           <button  class="form-control btn btn-success col-md-3" name="advancedStSearch"> Search </button>
                       </div>
                </form>
            </div>
        </div>
    </div>
    </body>
</html>
