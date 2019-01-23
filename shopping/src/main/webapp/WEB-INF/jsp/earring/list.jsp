<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:forEach var="row" items="${resultList}" varStatus="stat">
	
	<div class="box">
		<a href="/earring/view?pid=${row.pid}" name="anchorBoxName_6734">
			<img src="/common/images/product/earring/lovart777_6734.jpg" alt="" class="thumb">
		</a>
		<p class="name">
			<a href="/earring/view?pid=${row.pid}">
				<span style="font-size: 12px; color: #555555;">
					${row.name}
				</span>
			</a>
		</p>
		<p class="icon"></p>
		<ul class="xans-element- xans-product xans-product-listitem">
			<li class=" xans-record-">
				<strong class="title displaynone">
					<span style="font-size: 10px; color: #89D8CE; font-weight: bold;">판매가</span> :
				</strong> 
				<span style="font-size: 10px; color: #89D8CE; font-weight: bold;">
					${row.price} won
				</span>
				<span id="span_product_tax_type_text" style=""> </span>
			</li>
		</ul>
	</div>
	
</c:forEach>

