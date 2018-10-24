<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aabbcc">
<form action="update">
<input type="hidden" name="lid" value="${udata.lid}">
<br>
name<input type="text" name="name" value="${udata.user.name}"><br>
address<input type="text" name="address" value="${udata.user.address}"><br>
mobile<input type="text" name="mobile" value="${udata.user.mobile}"><br>
uname<input type="text" name="uname" value="${udata.uname}"><br>
pass<input type="text" name="pass" value="${udata.pass}"><br>
<input type="submit" value="Update">
</form>
</body>
</html>