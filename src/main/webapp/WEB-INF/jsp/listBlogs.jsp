<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
    .box{
        border: 1px solid #aaa; /*getting border*/
        border-radius: 4px; /*rounded border*/
        color: #000; /*text color*/
    }
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

			<c:forEach items="${blogs}" var="blog">
			<table>
			    <tr>
			    	<th><a  href="editBlog.html?id=${blog.id}"> ${blog.title} </a> </th>
			    </tr>
			    <tr>
			    	<td><textarea class="box">${blog.description}</textarea></td>
			    </tr>
			    <tr>
			    	<td><fmt:formatDate type="date" value="${blog.date}"/></td>
			    </tr>
			</table>
			</c:forEach> 
			
			<table>
			<tr>
				<td>
					<a href="editBlog.html?id=-1"> Create new blog </a>
				</td>
			</tr>
			</table>

</body>
</html>