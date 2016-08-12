<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head><body>
<s:actionerror />
<s:form action="LoginAction" method="post">
<s:textfield name="username" key="label.username" size="20" />
<s:password name="password" key="label.password" size="20" />
<s:submit method="execute" key="label.login" align="center" />

</s:form>
</body>

</html>