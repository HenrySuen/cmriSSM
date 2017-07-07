<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="<%=request.getContextPath() %>"/>  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>manipulate</td>
    </tr>
    <a href="${path}/listCategory">categories</a>>${cat.name}><a href="${path}/toAddProduct?id=">addProduct</a><br>
    <div align='center' border='1' cellspacing='0'>
   <form action="${path}/listByName" method="post">
		<input type="text" placeholder="product name ..." name="name">
		<input type="submit" value="search">
	</form>
	</div>
	<br>
    <c:forEach items="${products}" var="product" varStatus="st">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td><a href="${path}/deleteProduct?id=${product.id}">delete</a>&nbsp;&nbsp;<a href="${path}/toUpProduct?id=${product.id}">update</a></td>
        </tr>
    </c:forEach>
</table>