layui.use(['form','layer','jquery'], function() {
	var form = layui.form
		,layer = layui.layer
		,$ = layui.jquery;
	form.on('submit(formDemo)', function(data) {
		let param = $("form").serialize();
		$.ajax({
			url:"",
			type:"checkLogin",
			data:param,
			dataType:"text",
			success:function(result){
				if(result){
					layer.msg('欢迎使用孕检系统！',function () {
						location.href="/home";
					});
				}else{
					layer.msg('登录失败');
				}
			}
		});
		return false;
	});
})