<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form:form commandName="blog">
		
		<table>
    	<tr>
        	<td><label for="textinput1">Title</label></td>
        	<td><form:input path="title" /></td>
    	</tr>
    	<tr>
        	<td><label for="textinput2">Description</label></td>
        	<td><form:textarea path="description" rows="5" cols="30"/></td>
    	</tr>
    	<tr>
        	<td colspan="2">
            	<input type="submit" value="Save"/>
        	</td>
    	</tr>
		</table>  
	  </form:form>

</body>
</html>
