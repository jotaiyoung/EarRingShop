<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>회원정보</h1>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>패스워드</th>
			<th>우편번호</th>
			<th>주소</th>
			<th>상세주소</th>
			<th>폰번호</th>
			<th>이메일</th>
		</tr>
		<c:forEach var="customer" items="${customerList}">
		<tr>
			<td>${customer.customerid}</td>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.password}</td>
			<td>${customer.postcode}</td>
			<td>${customer.address}</td>
			<td>${customer.address2}</td>
			<td>${customer.phone}</td>
			<td>${customer.email}</td>		
		</tr>
		</c:forEach>
	
	</table>
    