<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
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
</html>