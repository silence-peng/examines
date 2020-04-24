layui.use(['form','layer','laydate','jquery'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,$ = layui.jquery;
		
		laydate.render({
		   elem: '#mdate'
		});
		laydate.render({
		   elem: '#wdate'
		});
		laydate.render({
		   elem: '#getmarried'
		});
		laydate.render({
		   elem: '#createDate'
		});
})