<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}

table thead tr th {
	border: 1px solid black;
	padding: 3px;
	background-color: #cccccc;
}

table tbody tr td {
	border: 1px solid black;
	padding: 3px;
}
</style>
</head>
<body>
	<center>
		<s:form action="Book">
			<s:textfield name="name" label="作者姓名" />
			<s:submit value="搜索" />
		</s:form>
		<p>作者列表</p>
	</center>
	<table cellspacing="0" align="center">
		<thead>
			<tr>
				<th>作者ID</th>
				<th>作者姓名</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="authors">
				<tr>
					<td><s:property value="id"></s:property></td>
					<td><a href='<s:url action="Book"><s:param name="name" value="name"/></s:url>'><s:property value="name"></s:property></a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>