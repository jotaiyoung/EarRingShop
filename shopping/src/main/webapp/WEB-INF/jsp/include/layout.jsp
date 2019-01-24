<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>

<!DOCTYPE html>
<html>
<head>
	<title><decorator:title default="" /></title>
	<meta charset="UTF-8">
	
	<decorator:head />
	
	<style>
		body {margin: 0; padding: 0}
		div {display:inline-block}
		div.body {text-align: center; width: 100%}
		div.top {
			width: 100%;
			background-color: #B40404; 
			color: #FFFFFF; 
			font-weight: bold;
			padding: 10px 0;
			text-align: center; 
		}
		div.top .top-1 {width: 1000px;}
		div.top .top-left {float: left;}
		div.top .top-right {float: right;}
		div.header{width: 1000px; padding: 30px 0;}
		div.header .header-1 {display: block;padding: 10px 0;height: 20px;}
		div.header .header-1 .header-1-right {float: right;}
		div.header .header-gnb {		
			position: relative;		
			box-sizing: border-box;
			display: flex;
			flex-wrap: wrap;
			padding: 10px 0;
			border-top: 1px solid #3E3E3E;
			border-bottom: 1px solid #3E3E3E;
			align-items: center;
			justify-content: space-around;
			text-decoration: none;
  			letter-spacing: 2px;			
			
		}	
		
		div.contents{ min-height: 500px;width: 1000px;}
		div.footer{height: 300px;width: 100%;border-top: 1px solid #3E3E3E;}
		div.footer .order-info {
			display: block;
			padding: 10px 0;
			background-color: #FCFCFC;
			border-bottom: 1px solid #E8E8E8;
		}
		div.footer .order-info .order-info-block {
			width: 300px;
			height: 150px;
			border-right: 1px solid #3E3E3E;
		}
		div.footer .shop-info {
			display: block;
			padding: 50px 0;
			border-bottom: 1px solid #E8E8E8;
		}
		div.footer .sitemap {
			display: block;
			padding: 10px 0;
			background-color: #FCFCFC;
		}
	</style>
	
	<script type="text/javascript" src="/common/js/jquery-1.11.3.min.js"></script>
</head>
<body>
	<!-- header -->
   	<%@ include file="./layout_top.jsp"%>
	<!-- /header -->
	
	<div class="body">
	   	<!-- header -->
	   	<%@ include file="./layout_header.jsp"%>
		<!-- /header -->
		
		<div class="contents">
			<!-- body -->
			<decorator:body />
			<!-- /body -->
		</div>
	
		<!-- footer -->
		<%@ include file="./layout_footer.jsp"%>
		<!-- /footer -->
	</div>
	
</body>
</html>