<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>BattleShip: New User</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/existing/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="assets/css/existing/signin.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <!-- <form class="form-signin" role="form"> -->
    <s:form action="registration" method="POST" cssClass="form-signin" role="form" >
        <h2 class="form-signin-heading">New User Form</h2>

        <p class="bg-danger errorBoxLoginNewUser"><strong>Error!</strong> Message</p>

        <input name="name" type="text" class="form-control" placeholder="Username" required autofocus autocomplete="on"><br/>
        <input name="email" type="email" class="form-control" placeholder="Email address" required autocomplete="on"><br/>
        <input name="password" type="password" class="form-control" placeholder="Password" required>
        <input name="password2" type="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Create</button>
    </s:form>

    <br/>
    <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <s:url action="login" var="goToLog"></s:url>
            	<a href="<s:property value='#goToLog'/>">Back to Login</a>
            </div>
            <div class="col-md-4"></div>
    </div>

</div> <!-- /container -->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>


