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
		<p>操作成功</p>
		<a
			href='<s:url action="Book"><s:param name="name" value="name"/></s:url>'>返回图书列表</a>
	</center>
</body>
</html>