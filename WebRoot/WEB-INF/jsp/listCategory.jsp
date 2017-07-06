<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="<%=request.getContextPath() %>"/>  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>manipulate</td>
    </tr>
    <a href="${path}/toAddCat">addCategory</a><br>
    <div align='center' border='1' cellspacing='0'>
   <form action="${path}/listByName" method="post">
		<input type="text" placeholder="category name ..." name="name">
		<input type="submit" value="search">
	</form>
	</div>
	<br>
    <c:forEach items="${categories}" var="cat" varStatus="st">
        <tr>
            <td>${cat.id}</td>
            <td>${cat.name}</td>
            <td><a href="${path}/deleteCat?id=${cat.id}">delete</a>&nbsp;&nbsp;<a href="${path}/toUpCat?id=${cat.id}">update</a></td>
        </tr>
    </c:forEach>
</table>