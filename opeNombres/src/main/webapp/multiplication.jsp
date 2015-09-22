<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="OperationsServlet">
		<input type="text" name="ope1"/>
		<input type="text" name="ope2"/>
		<input type="hidden" name="type" value="*"/>
		<input type="submit" value="*"/>
	</form>
	<% 
	if(request.getAttribute("result")!=null){
		String res = request.getAttribute("result").toString();
		if(res!=null){
			out.print("<p>"+res+"</p>");
		}
	}
	%>
	<a href="index.jsp">Retour</a>
</body>
</html>