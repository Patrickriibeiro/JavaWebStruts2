<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Credit</title>
</head>
<body>
	<s:form action="Credit">
		<s:textfield name="amount" label="Amount" size="14"></s:textfield>
		<s:submit method="execute" label="OK"></s:submit>
	</s:form>
</body>
</html>