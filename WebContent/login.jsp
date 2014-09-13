<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>BattleShip: Login</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/existing/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="assets/css/existing/signin.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <s:form action="login" method="POST" cssClass="form-signin" role="form" >
        <h2 class="form-signin-heading">Please sign in</h2>

    <p class="bg-danger errorBoxLoginNewUser"><strong>Error!</strong> Please enter an username and a password.</p>

    <input type="email" class="form-control" placeholder="Email address" required autofocus><br/>
        <input type="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </s:form>

    <br/>
    <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
            	<s:url action="registration" var="goToReg"></s:url>
            	<a href="<s:property value='#goToReg'/>">New user Registration</a>
            </div>
            <div class="col-md-4"></div>
    </div>

</div> <!-- /container -->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>

