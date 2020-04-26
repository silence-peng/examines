layui.use(['form','layer','laydate','jquery'], function() {
	var form = layui.form
		,layer = layui.layer
		,laydate = layui.laydate
		,$ = layui.jquery;
	$.ajax({
		url:'/checkProve/getUserByuserid'
		,type:'post'
		,data:null
		,dataType:'json'
		,success:function(e){
			form.val("formTest",e);
		}
	});
	$.ajax({
		url:'/checkProve/getYxResult'
		,type:'post'
		,data:{sex:0}
		,dataType:'json'
		,success:function(e){
			form.val("formTest",e);
		}
	});
	$.ajax({
		url:'/checkProve/getYxAdvise'
		,type:'post'
		,data:null
		,dataType:'json'
		,success:function(e){
			$(e).each(function(){
				$("#advise").append("<div class='layui-form-item' style='margin-left: 40px;'>"+
					"<div class='layui-inline layui-bg-gray suggest'>" +
					"<input type='checkbox' value='"+this.yxid+"' name='yxid' lay-skin='primary'>" +
					"</div>" +
					"<div class='layui-bg-gray layui-inline suggests'>" +this.yxitem+"</div>"+
					"</div>");
			});
			$.post('/checkProve/getAdviseArr',{sex:0},function (result) {
				var arr=[];
				arr=result.split(",");
				$("input[name='yxid']:checkbox").each(function () {
					for (var i=0;i<arr.length;i++){
						if($(this).val()==parseInt(arr[i])){
							$(this).attr("checked",true);
						}
					}
				})
			})
		}
	});

	form.on('submit(formDemo)', function(data) {
		var arrobject = [2,3];

		$("input[name='yxid']:checkbox").each(function() {
			if ($(this).attr("checked") === true) {
				console.info($(this).val());

				arrobject.push($(this).val());

			}
		});

		var arrString =arrobject.join(",");
		console.log(arrString);
		var param={arr:arrString,isabnormal:$("input[name='isabnormal']:radio").val(),abnormalities:$("#abnormalities").val(),resultid:$("#resultid").val()}
		$.ajax({
			url:"/checkProve/save",
			type:"post",
			data:param,
			dataType:"text",
			success:function(result){
				if(result=="ok"){
					layer.msg('保存成功！');

				}else{
					layer.msg('保存失败！');
				}
			}
		});
		return false;
	});

})