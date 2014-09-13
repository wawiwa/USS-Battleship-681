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

        <input type="username" class="form-control" placeholder="Username" required autofocus><br/>
        <input type="email" class="form-control" placeholder="Email address" required><br/>
        <input type="password" class="form-control" placeholder="Password" required>
        <input type="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Create</button>
    </s:form>

    <br/>
    <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4"><a href="login.jsp">Back to Login</a></div>
            <div class="col-md-4"></div>
    </div>

</div> <!-- /container -->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>


<%-- <html>
<head></head>
<body>
	<h1>registration form</h1>
    <s:set name="mg" value="failure_message"/>
	<s:form action="registration" method="POST" >
		<s:textfield name="name" label="Username" />
		<s:textfield name="email" label="email" />
		<s:password name="password" label="Password"/>
		<s:password name="password2" label="Re-enter Password"/>
		<s:if test="%{#mg!=null}">
	<s:property value="failure_message" /> 
        </s:if>
		
		
		<s:submit />
	</s:form>
	<a href="https://www.worldwordweb.us">certifivate</a>
 
</body>
</html> --%>