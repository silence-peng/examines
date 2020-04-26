layui.use(['form','layer','laydate','jquery'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,$ = layui.jquery;
		
		laydate.render({
		   elem: '#mdate'
		});

	$.ajax({
		url:'/image/openImage'
		,type:'post'
		,data:null
		,dataType:'json'
		,success:function(e){
			form.val("formTest",e);
		}
	});
	form.on('submit(formDemo)', function(data) {
		console.log($("#userid").val());
		$.ajax({
			url:"/image/getB",
			type:"post",
			data:{userid:$("#userid").val()},
			dataType:"json",
			success:function(result){
				$("#minImg").html("");
				$("#maxImg").html("");
				$("#minImg").append("<img src='"+result.bimgfile+"' width='50px' height='40px'/>" +
					"<label name='imgsize'>"+result.imgsize+"</label>");
				$("#maxImg").append("<img src='"+result.bimgfile+"' width='90%' style='padding: 30px;'/>");
				form.val("formTest",result);
			}
		});
		return false;
	});
	$("#minImg").dblclick(function () {
		$.post('/image/deleteImg',{userid:$("#userid").val()},function (e) {
			if(e=="ok"){
				$("#minImg").hide();
				$("#maxImg").hide();
			}
			$("#maxImg").hide();
		})
	})
});