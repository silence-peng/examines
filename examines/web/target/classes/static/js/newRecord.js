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
			$("#regtypeId").append("<option value='"+this.regtypeid+"'>"+this.type+"</option>");
			form.render();//渲染登记类型
		})

	});
	$("#mqian").click(function () {
		$("#canvasParcel").removeClass();
		layer.open({
			type : 2,
			content : 'Testm',
			area : [ '800px', '400px' ],
			shade : 0,
			maxmin : true,
			success : function(layero, index) {
				var iframe = window['layui-layer-iframe' + index];
			},
			shade : [ 0.8, '#393d49' ]
			/*,end:function () {
				var path ="E:/Downloads/"+$("#qimgm").val();
				$("#zf").append("<img width='300' src='"+path+" height='200' style='margin-left: 50px;'/>");
			}*/
		});
	});
	$("#fqian").click(function () {
		$("#canvasParcel").removeClass();
		layer.open({
			type : 2,
			content : 'Testf',
			area : [ '800px', '400px' ],
			shade : 0,
			maxmin : true,
			success : function(layero, index) {
				var iframe = window['layui-layer-iframe' + index];
			},
			shade : [ 0.8, '#393d49' ]
			/*,end:function () {
				var path ="E:\\Downloads/"+$('#qimgf').val();
				$("#qz").append("<img width='300' src='"+path+" height='200' style='margin-left: 50px;'/>");
			}*/
		});
	});
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