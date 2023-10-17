<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Statements</title>
</head>
<body>

	<p>Balance: <s:property value="balance"></s:property></p>
	
	<p>
	Transactions
	<BR>
	<table border="1">
	<tr>
		<td>Date</td>
		<td>Amount<td>
		<td>C/D</td>
		<td>Document</td>
		<tr>
		<s:iterator value="transactions" var="trn">
		<tr>
		<td><s:property value="#trn.date"/></td>
		<td><s:property value="#trn.amount"/><td>
		<td><s:property value="#trn.nature"/></td>
		<td><s:property value="#trn.document"/></td>
		<tr>
		</s:iterator>
	</table>
	
	<P><a href="Credit.jsp">Credit</a> - <a href="Debit.jsp">Debit</a></P>


</body>
</html>