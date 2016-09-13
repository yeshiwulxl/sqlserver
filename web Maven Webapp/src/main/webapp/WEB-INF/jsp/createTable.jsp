<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  

<html>      
<head>
<%@include file="/public/head.jspf"%>
</head>
<script type="text/javascript">

</script>
<body>
<form action="addTable.action">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>数据表名:</td>
			<td><input type="text" name="tablename"></td>
		</tr>
		<tr>
			<td>数据表标识:</td>
			<td><input type="text" name="tablelogo"></td>
		</tr>
		<tr>
			<td>备注:</td>
			<td><textarea rows="" cols="" name="remark"></textarea></td>
		</tr>
	</table>
</form>
</body>
</html>  
