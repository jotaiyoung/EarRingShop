<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="panel-body">
	<form:form role="form" commandName="customerVO" action="/login" method="post">
		<fieldset>
			<div class="form-group">
				<form:input type="text" class="form-control" placeholder="ID" path="id"/>
			</div>
			<div class="form-group">
				<form:password class="form-control" placeholder="Password" path="password"/>
			</div>		
			<div class="checkbox">
				<label>
					<form:checkbox path="rememberId"/>
				</label>
			</div>
			<button type="submit" class="btn btn-lg btn-success btn-block">로그인</button>
		</fieldset>	
	</form:form>
</div>