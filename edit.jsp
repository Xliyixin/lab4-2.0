<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统</title>
</head>
<body>
	<center>
		<p>编辑图书</p>
		<s:form action="Addbook">
			<s:textfield name="book.isbn" label="ISBN" />
			<s:textfield name="book.title" label="书名" />
			<s:textfield name="book.pub" label="出版社" />
			<s:textfield name="book.date" label="出版日期" />
			<s:textfield name="book.price" label="售价" />
			<s:textfield name="book.id" label="作者ID" readonly="true" />
			<s:textfield name="name" label="作者姓名" readonly="true" />
			<s:submit value="完成" />
		</s:form>
	</center>
</body>
</html>