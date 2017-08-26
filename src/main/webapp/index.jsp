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
    </head>
    <body>
<!--alt+shift+f kodu seliqeye salir-->

<div class="container-fluid">
	<div class="row">

	<div class="col-md-6">
            <form action="searchStudent" method="POST">
                    <div class="form-group">
                       <input class="form-control col-md-6" type="text" name="name" placeholder="Search stuent" required/>
                       <button  class="form-control btn btn-success col-md-3" name="simpleSearch"> Search </button>
                   </div>
            </form>
            <div>
                <a href="AdvancedSt.jsp">Advanced search</a>
            </div>
        </div>

        <div class="col-md-6">
            <form action="searchBook" method="POST">
                <div class="form-group">
                    <input class="form-control col-md-6" type="text" name="name" placeholder="Search book" />
                    <button  class="form-control btn btn-success col-md-3" > Search </button>
                </div>
            </form>
            <div>
                <a href="AdvancedBook.jsp">Advanced search</a>
            </div>
        </div>
	</div>
</div>



    


    </body>
</html>
