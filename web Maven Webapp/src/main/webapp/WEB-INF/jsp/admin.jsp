<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/public/head.jspf"%>
<style type="text/css">
#menu {
	width: 200px;
	/* border: 1px solid red; */
}

#menu ul {
	padding: 0px;
	margin: 0px;
	list-style: none;
}

#menu ul li {
	border-bottom: 1px solid #fff;
}

#menu ul li a {
	/* 设置a标签的宽和内间距，则先转换为块级元素 */
	display: block;
	background-color: #008792;
	color: #fff;
	padding: 5px;
	text-decoration: none;
}

#menu ul li a:HOVER {
	background-color: #00a6ac;
}
</style>

<script type="text/javascript">
$(function(){
	$("a[title]").click(function() {
		var text = $(this).text();
		var href = $(this).attr("title");
		if ($("#tt").tabs("exists", text)) {
			$("#tt").tabs("select", text);
		} else {
			$("#tt").tabs("add", {
				title : text,
				closable : true,
				//content:'正文内容'
				//href默认是通过url地址，加载远程的页面，但是仅仅是body部分
				//href:'createTable.action'
				content : '<iframe title='+ text+ ' src='+ href+ ' frameborder="0" width="100%" height="100%"></iframe>'
			});
		}
	});
});
</script>

<body class="easyui-layout">
	<div region="north" title="North Title" split="true"
		style="height:100px;"></div>
	<div region="south" title="South Title" split="true"
		style="height:100px;"></div>
	<div region="west" split="true" title="West" style="width:100px;">
		<div id="menu" class="easyui-accordion"
			style="width:300px;height:200px;">
			<div title="基本操作" >
				<ul>
					<li><a href="#" title="createTable.action">新建数据表</a></li>
					<li><a href="#" title="modifyTable.action">修改数据表</a></li>
				</ul>
			</div>
			<div title="Title2" iconCls="icon-reload" selected="true"
				style="padding:10px;">content2</div>
		</div>
	</div>
	<div region="center" title="center title"
		style="padding:5px;background:#eee;">
		<div id="tt" class="easyui-tabs" data-option="fit:true">
			<div title="系统缺省页面" style="padding:20px;display:none;">
				这里显示系统信息
			</div>
		</div>
	</div>
</body>
</html>
