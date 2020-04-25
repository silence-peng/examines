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

	$.post('/addUser/getRegosterType',function(result){
		let role = eval(result);
		$("#regtypeId").append("<option value=''></option>");
		$(role).each(function(){
			$("#regtypeId").append("<option value='"+this.regtypeId+"'>"+this.type+"</option>");
			form.render();//渲染登记类型
		})

	})
	//监听提交
	form.on('submit(formDemo)', function(data) {
		let param = $("form").serialize();
		$.ajax({
			url:"/addUser/addUserInfo",
			type:"post",
			data:param,
			dataType:"text",
			success:function(result){
				if(result=="ok"){
					layer.msg('新建成功！',{time:1000},function(){
						parent.layer.close(parent.layer.index);
					});
				}else{
					layer.msg('新建失败！');
				}
			}
		});
		return false;
	});
})