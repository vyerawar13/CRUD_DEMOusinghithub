<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function del()
{
	alert("delete")
	document.myform.action="del";
	document.myform.submit();
}
	
function add()
{
	alert("add data")
	document.myform.action="register";
	document.myform.submit();
}
	
function edit()
{
	alert("edit data")
	document.myform.action="edit";
	document.myform.submit();
}
	

</script>
</head>
<body bgcolor="aabbcc">
<form name="myform">
<table border="3">
<c:forEach items="${data}" var="s">
<tr><td><input type="radio" name="lid" value="${s.lid}"></td>
<td>${s.uname}</td>
<td>${s.pass}</td>
 <td>${s.user.name}</td>
<td>${s.user.address}</td>
<td>${s.user.mobile}</td></tr>
</c:forEach>
<tr><td><input type="button" value="Delete"  onclick="del()"></td>
<td><input type="button" value="Add"  onclick="add()"></td>
<td><input type="button" value="Edit"  onclick="edit()"></td></tr>
</table>

</form>
</body>
</html>