<%-- 
    Document   : AdvancedBook
    Created on : Aug 25, 2017, 9:21:44 AM
    Author     : Maga Kh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <div class="container-fluid">
	<div class="row">

            <div class="col-md-6">
                <form action="searchStudent" method="POST">
                        <div class="form-group">
                           <input class="form-control col-md-6" type="text" name="name" placeholder="book name" required/>
                           <input class="form-control col-md-6" type="text" name="author" placeholder="author name" />
                           <input class="form-control col-md-6" type="text" name="publisher" placeholder="publisher name" />
                           <button  class="form-control btn btn-success col-md-3" name="advancedBookSearch"> Search </button>
                       </div>
                </form>
            </div>
        </div>
    </div>
    </body>
</html>
