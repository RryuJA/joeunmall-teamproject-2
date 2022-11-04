<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>상품 리스트</title>
</head>
<body>

	<table>
		<c:forEach items="${userList}" var="user" varStatus="st">
			<tr>
				<td>${st.count}</td>
				<td>${user.userIndex}</td>
				<td>${user.userId}</td>
				<td>${user.userName}</td>
				<td>${user.userPw}</td>
				<td><fmt:formatDate value="${user.userDate}" pattern="yyyy-MM-dd" /></td>
				<td>${user.userEmail}</td>
				<td><fmt:formatDate value="${user.userBirth}" pattern="yyyy-MM-dd" /></td>
				<td>${user.userGender}</td>
				<td>${user.userLandline}</td>
				<td>${user.userMobile}</td>
				<td>${user.userPost}</td>
				<td>${user.userAddress}</td>
				<td>${user.userAddressDetail}</td>
			</tr>
		</c:forEach>
	</table>

	<table>
		<c:forEach items="${prList}" var="product" varStatus="st">
			<tr>
				<td>${st.count}</td>
				<td>${product.productIndex}</td>
				<td>${product.productCategoryIndex}</td>
				<td>${product.productStateIndex}</td>
				<td>${product.productName}</td>
				<td><fmt:formatNumber value="${product.productPrice}" pattern="#,###" /></td>
				<td>${product.productImage}</td>
				<td><fmt:formatDate value="${product.productDate}" pattern="yyyy-MM-dd" /></td>
				<td>${product.productInfo}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>