<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:forEach var="row" begin="0" end="19" step="1" varStatus="stat">
	
	<div class="box">
		<a href="/earring/view" name="anchorBoxName_6734">
			<img src="/common/images/product/earring/lovart777_6734.jpg" alt="" class="thumb">
		</a>
		<p class="name">
			<a href="/product/detail.html?product_no=6734&amp;cate_no=65&amp;display_group=2">
				<span style="font-size: 12px; color: #555555;">
					★14k gold★<br>커팅 원터치 링귀걸이(14~16mm)
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
					61,000 won
				</span>
				<span id="span_product_tax_type_text" style=""> </span>
			</li>
		</ul>
	</div>
	<c:if test="${(stat.index % 3) == 0}">
		<br/>
	</c:if>
</c:forEach>

