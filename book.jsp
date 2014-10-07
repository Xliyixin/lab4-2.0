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
		<p>
			<s:property value="name"></s:property>
			的图书列表
		</p>
		<a href='<s:url action="Author"></s:url>'>返回作者列表</a>
		<table border="1">
			<thead>
				<tr>
					<th>书名</th>
					<th>修改</th>
					<th>删除</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="books">
					<tr>
						<td><a
							href='<s:url action="Bookinfo"><s:param name="isbn" value="isbn"/><s:param name="name" value="name"/></s:url>'><s:property
									value="title"></s:property></a></td>
						<td><a
							href='<s:url action="Editbook"><s:param name="isbn" value="isbn"/><s:param name="name" value="name"/></s:url>'>编辑</a></td>
						<td><a
							href='<s:url action="Deletebook"><s:param name="isbn" value="isbn"/><s:param name="name" value="name"/></s:url>'>删除</a></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</center>
</body>
</html>