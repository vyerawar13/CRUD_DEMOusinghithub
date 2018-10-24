<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function data()
{
	
	alert("In");
	var s=document.getElementById("t1").value;
	var req=new XMLHttpRequest();
	var url="log?a="+s;
	req.open("GET",url,true);
	req.send();
	
	req.onreadystatechange=function(){
		
		if(req.readyState==4 && req.status==200)
		{
			
			alert(req.responseText);
			document.getElementById("t2").innerHTML=req.responseText;
		}
	}
	
	
	
	}


</script>


</head>
<body>

Search:<input type="text" id="t1" onkeyup="data()">
<div id="t2"></div>

                                    

</body>
</html>