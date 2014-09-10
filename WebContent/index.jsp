<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>welcome page</h1>
    <s:if test="%{#mg!=null}">
	<s:property value="failure_message" /> 
        </s:if>
</body>
</html>