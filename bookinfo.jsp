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
		<a
			href='<s:url action="Book"><s:param name="name" value="name"/></s:url>'>返回图书列表</a>
		<p>图书信息</p>
		<table border="1">
			<tbody>
				<tr>
					<th>ISBN</th>
					<td><s:property value="book.isbn" /></td>
				</tr>
				<tr>
					<th>书名</th>
					<td><s:property value="book.title" /></td>
				</tr>
				<tr>
					<th>出版商</th>
					<td><s:property value="book.pub" /></td>
				</tr>
				<tr>
					<th>出版日期</th>
					<td><s:property value="book.date" /></td>
				</tr>
				<tr>
					<th>售价</th>
					<td><s:property value="book.price" /></td>
				</tr>
			</tbody>
		</table>
		<p>作者信息</p>
		<table border="1">
			<tbody>
				<tr>
					<th>作者姓名</th>
					<td><s:property value="author.name" /></td>
				</tr>
				<tr>
					<th>作者年龄</th>
					<td><s:property value="author.age" /></td>
				</tr>
				<tr>
					<th>作者国籍</th>
					<td><s:property value="author.country" /></td>
				</tr>
			</tbody>
		</table>
	</center>
</body>
</html>